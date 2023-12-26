USE MASTER
DROP DATABASE [TranNgocGrocery_DB]
GO

-- TẠO DATABASE
CREATE DATABASE [TranNgocGrocery_DB]
GO

-- SỬ DỤNG DATABASE
USE [TranNgocGrocery_DB]
GO

--TẠO BẢNG LOẠI SẢN PHẨM
CREATE TABLE Categories
(
    id INT IDENTITY(0,1) PRIMARY KEY,
    name NVARCHAR(50) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
	decription NVARCHAR(50)
)
--TẠO BẢNG SẢN PHẨM
CREATE TABLE Product
(
	idProduct NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS PRIMARY KEY,
	name NVARCHAR(55) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
	costPrice FLOAT NOT NULL, -- giá nhập
	originalPrice FLOAT NOT NULL, -- giá bán gốc
	currentPrice FLOAT, -- giá bán hiện tại nếu có chương trinh khuyến mãi
	quantity INT NOT NULL,
	status NVARCHAR(25) NOT NULL,
	categories INT,
    FOREIGN KEY (categories) REFERENCES Categories(id)

)
GO


--TẠO BẢNG KHUYẾN MÃI
CREATE TABLE Promotion
(
	idPromotion NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS PRIMARY KEY,
	name NVARCHAR(55) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
	typePromotion NVARCHAR(30) NOT NULL, 
	discount FLOAT NOT NULL,  -- Số tiền giảm hoặc phần trăm giảm
	priceRange FLOAT, -- khoảng giá áp dụng ví dụ trên 100.000VND
	quantity INT,
	dayStart DATE NOT NULL,
	dayEnd DATE NOT NULL,
	status NVARCHAR(25),
	description NVARCHAR(200),
	CONSTRAINT CK_Promotion_Status CHECK (status IN (N'Hết hạn', N'Còn hạn'))
)
GO

-- TRIGGER KIỂM TRA HẠN KHUYỄN MÃI
/*
CREATE TRIGGER trg_Promotion_Status
ON Promotion
AFTER INSERT, UPDATE
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE Promotion
    SET status = CASE 
                    WHEN dayEnd IS NULL THEN N'Còn hạn'  -- Xem xét nếu dayEnd có thể là NULL
                    WHEN dayEnd < GETDATE() THEN N'Hết hạn'
                    ELSE N'Còn hạn'
                 END
    WHERE idPromotion IN (SELECT idPromotion FROM inserted) AND status = N'Còn hạn';

	 -- Cập nhật currentPrice của sản phẩm khi Khuyến mãi hết hạn
    UPDATE Product
    SET currentPrice = 0
    FROM Product
    INNER JOIN ProductPromotion ON Product.idProduct = ProductPromotion.idProduct
    INNER JOIN Promotion ON ProductPromotion.idPromotion = Promotion.idPromotion
    WHERE Promotion.status = N'Hết hạn';
END
GO
*/

-- TẠO BẢNG TRUNG GIAN SẢN PHẨM VÀ KHUYỄN MÃI
CREATE TABLE ProductPromotion
(
    id INT PRIMARY KEY IDENTITY(1,1),
    idProduct NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS,
    idPromotion NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS,
    FOREIGN KEY (idProduct) REFERENCES Product(idProduct),
    FOREIGN KEY (idPromotion) REFERENCES Promotion(idPromotion)
)
GO

--BẢNG KHÁCH HÀNG
CREATE TABLE Customer
(
	idCustomer NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS PRIMARY KEY,
	name NVARCHAR(55) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
	phone NVARCHAR(10) NOT NULL ,
	address NVARCHAR(55),
	rewardPoints int
)
GO

-- TẠO BẢNG HÓA ĐƠN
CREATE TABLE Invoice
(
    idInvoice NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS PRIMARY KEY,	
	customer NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
	amountReceived FLOAT NOT NULL, -- số tiền nhận
    changeAmount FLOAT, -- số tiền thừa
    totalAmount FLOAT, -- Tổng tiền hóa đơn
    dateCreated DATETIME NOT NULL,
    status NVARCHAR(25) NOT NULL,
    FOREIGN KEY (customer) REFERENCES Customer(idCustomer)
)
GO

-- BẢNG CHI TIẾT HÓA ĐƠN
CREATE TABLE InvoiceDetails 
(
    idInvoiceDetails NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS PRIMARY KEy,
	invoice NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
    product NVARCHAR(15) COLLATE SQL_Latin1_General_CP1_CS_AS NOT NULL,
    quantity INT NOT NULL,
    unitPrice FLOAT NOT NULL,
	FOREIGN KEY (product) REFERENCES Product(idProduct),
	FOREIGN KEY (invoice) REFERENCES Invoice(idInvoice)
)
GO
