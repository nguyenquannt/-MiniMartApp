package gui;
/**
 *
 * @author Nguyễn Quân 33, 124, 163 
 * 1250,670
 */
public class Sell_GUI extends javax.swing.JPanel {
    public Sell_GUI() {
        initComponents();
        this.setSize(1250,670);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Left = new javax.swing.JPanel();
        JTF_AddProduct = new javax.swing.JTextField();
        BTN_AddProduct = new javax.swing.JButton();
        JSP_TableProduct = new javax.swing.JScrollPane();
        JTABLE_Product = new javax.swing.JTable();
        JP_Right = new javax.swing.JPanel();
        JP_Right_1 = new javax.swing.JPanel();
        JL_PhoneCusOld = new javax.swing.JLabel();
        JTF_PhoneCusOld = new javax.swing.JTextField();
        BTN_FilterPhoneCusOld = new javax.swing.JButton();
        JP_Right_2 = new javax.swing.JPanel();
        JTF_PhoneCus = new javax.swing.JTextField();
        JL_PhoneCus = new javax.swing.JLabel();
        JTF_NameCus = new javax.swing.JTextField();
        JL_NameCus = new javax.swing.JLabel();
        JTF_PointCus = new javax.swing.JTextField();
        JL_PointCus = new javax.swing.JLabel();
        JP_Right_3 = new javax.swing.JPanel();
        JTF_Total = new javax.swing.JTextField();
        JL_Total = new javax.swing.JLabel();
        JL_VND = new javax.swing.JLabel();
        CBB_Promotion = new javax.swing.JComboBox<>();
        JL_Promotion = new javax.swing.JLabel();
        JL_MinusPointsCus = new javax.swing.JLabel();
        CBB_MinusPointsCus = new javax.swing.JComboBox<>();
        JL_Payments = new javax.swing.JLabel();
        CBB_Payments = new javax.swing.JComboBox<>();
        JL_MoneyReceived = new javax.swing.JLabel();
        JTF_MoneyReceived = new javax.swing.JTextField();
        JTF_MoneyChange = new javax.swing.JTextField();
        JL_MoneyChange = new javax.swing.JLabel();
        JP_Right_4 = new javax.swing.JPanel();
        BTN_Create = new javax.swing.JButton();
        BTN_Payments = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JP_Left.setBackground(new java.awt.Color(255, 255, 255));
        JP_Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JTF_AddProduct.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JTF_AddProduct.setText("OK");

        BTN_AddProduct.setBackground(new java.awt.Color(51, 51, 255));
        BTN_AddProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_AddProduct.setForeground(new java.awt.Color(255, 255, 255));
        BTN_AddProduct.setText("Thêm sản phẩm");

        JTABLE_Product.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTABLE_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên SP", "Số lượng", "Giá gốc", "Giá KM", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JSP_TableProduct.setViewportView(JTABLE_Product);

        javax.swing.GroupLayout JP_LeftLayout = new javax.swing.GroupLayout(JP_Left);
        JP_Left.setLayout(JP_LeftLayout);
        JP_LeftLayout.setHorizontalGroup(
            JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSP_TableProduct)
                    .addGroup(JP_LeftLayout.createSequentialGroup()
                        .addComponent(JTF_AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_AddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JP_LeftLayout.setVerticalGroup(
            JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTF_AddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(BTN_AddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSP_TableProduct)
                .addContainerGap())
        );

        JP_Right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JP_Right_1.setBackground(new java.awt.Color(255, 255, 255));
        JP_Right_1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng cũ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        JL_PhoneCusOld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_PhoneCusOld.setText("SDT KH:");

        JTF_PhoneCusOld.setEditable(false);
        JTF_PhoneCusOld.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTF_PhoneCusOld.setText("OK");

        BTN_FilterPhoneCusOld.setBackground(new java.awt.Color(51, 51, 255));
        BTN_FilterPhoneCusOld.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BTN_FilterPhoneCusOld.setForeground(new java.awt.Color(255, 255, 255));
        BTN_FilterPhoneCusOld.setText("TÌM");

        javax.swing.GroupLayout JP_Right_1Layout = new javax.swing.GroupLayout(JP_Right_1);
        JP_Right_1.setLayout(JP_Right_1Layout);
        JP_Right_1Layout.setHorizontalGroup(
            JP_Right_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_Right_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_PhoneCusOld)
                .addGap(18, 18, 18)
                .addComponent(JTF_PhoneCusOld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_FilterPhoneCusOld))
        );
        JP_Right_1Layout.setVerticalGroup(
            JP_Right_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_Right_1Layout.createSequentialGroup()
                .addGroup(JP_Right_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_PhoneCusOld, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_PhoneCusOld)
                    .addComponent(BTN_FilterPhoneCusOld))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        JP_Right_2.setBackground(new java.awt.Color(255, 255, 255));
        JP_Right_2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        JTF_PhoneCus.setEditable(false);
        JTF_PhoneCus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTF_PhoneCus.setText("OK");

        JL_PhoneCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_PhoneCus.setText("SDT KH:");

        JTF_NameCus.setEditable(false);
        JTF_NameCus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTF_NameCus.setText("OK");

        JL_NameCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_NameCus.setText("Họ tên KH:");

        JTF_PointCus.setEditable(false);
        JTF_PointCus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTF_PointCus.setText("OK");

        JL_PointCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_PointCus.setText("Điểm tích lũy:");

        javax.swing.GroupLayout JP_Right_2Layout = new javax.swing.GroupLayout(JP_Right_2);
        JP_Right_2.setLayout(JP_Right_2Layout);
        JP_Right_2Layout.setHorizontalGroup(
            JP_Right_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_Right_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_Right_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_Right_2Layout.createSequentialGroup()
                        .addComponent(JL_PhoneCus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTF_PhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_Right_2Layout.createSequentialGroup()
                        .addComponent(JL_NameCus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTF_NameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_Right_2Layout.createSequentialGroup()
                        .addComponent(JL_PointCus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(JTF_PointCus, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        JP_Right_2Layout.setVerticalGroup(
            JP_Right_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_Right_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_Right_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_PhoneCus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_PhoneCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_Right_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_NameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_NameCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_Right_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_PointCus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_PointCus))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        JP_Right_3.setBackground(new java.awt.Color(255, 255, 255));
        JP_Right_3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        JTF_Total.setEditable(false);
        JTF_Total.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        JTF_Total.setForeground(new java.awt.Color(255, 0, 0));
        JTF_Total.setText("100.909");

        JL_Total.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JL_Total.setText("TỔNG TIỀN:");

        JL_VND.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JL_VND.setText("VND");

        CBB_Promotion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CBB_Promotion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JL_Promotion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_Promotion.setText("Giảm giá:");

        JL_MinusPointsCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_MinusPointsCus.setText("Trừ điểm TL:");

        CBB_MinusPointsCus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CBB_MinusPointsCus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JL_Payments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_Payments.setText("HT thanh toán:");

        CBB_Payments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CBB_Payments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JL_MoneyReceived.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_MoneyReceived.setText("Tiền nhận:");

        JTF_MoneyReceived.setEditable(false);
        JTF_MoneyReceived.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTF_MoneyReceived.setText("OK");

        JTF_MoneyChange.setEditable(false);
        JTF_MoneyChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTF_MoneyChange.setText("OK");

        JL_MoneyChange.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JL_MoneyChange.setText("Tiền trả lại:");

        javax.swing.GroupLayout JP_Right_3Layout = new javax.swing.GroupLayout(JP_Right_3);
        JP_Right_3.setLayout(JP_Right_3Layout);
        JP_Right_3Layout.setHorizontalGroup(
            JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_Right_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_Right_3Layout.createSequentialGroup()
                        .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_Total)
                            .addComponent(JL_Promotion)
                            .addComponent(JL_MinusPointsCus)
                            .addComponent(JL_Payments))
                        .addGap(18, 18, 18)
                        .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBB_Payments, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBB_MinusPointsCus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JP_Right_3Layout.createSequentialGroup()
                                .addComponent(JTF_Total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JL_VND)
                                .addContainerGap())
                            .addComponent(CBB_Promotion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_Right_3Layout.createSequentialGroup()
                        .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_MoneyReceived)
                            .addComponent(JL_MoneyChange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_MoneyReceived, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(JTF_MoneyChange)))))
        );
        JP_Right_3Layout.setVerticalGroup(
            JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_Right_3Layout.createSequentialGroup()
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Total)
                    .addComponent(JL_VND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBB_Promotion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Promotion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBB_MinusPointsCus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_MinusPointsCus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBB_Payments, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Payments))
                .addGap(18, 18, 18)
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_MoneyReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_MoneyReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_Right_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_MoneyChange, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_MoneyChange))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        JP_Right_4.setBackground(new java.awt.Color(255, 255, 255));
        JP_Right_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        BTN_Create.setBackground(new java.awt.Color(51, 51, 255));
        BTN_Create.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BTN_Create.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Create.setText("THANH TOÁN");

        BTN_Payments.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Payments.setText("Tạo đơn hàng");

        javax.swing.GroupLayout JP_Right_4Layout = new javax.swing.GroupLayout(JP_Right_4);
        JP_Right_4.setLayout(JP_Right_4Layout);
        JP_Right_4Layout.setHorizontalGroup(
            JP_Right_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_Right_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_Right_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Payments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_Right_4Layout.setVerticalGroup(
            JP_Right_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_Right_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_Payments, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JP_RightLayout = new javax.swing.GroupLayout(JP_Right);
        JP_Right.setLayout(JP_RightLayout);
        JP_RightLayout.setHorizontalGroup(
            JP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Right_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_Right_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_Right_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_Right_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JP_RightLayout.setVerticalGroup(
            JP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_RightLayout.createSequentialGroup()
                .addComponent(JP_Right_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_Right_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_Right_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_Right_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_Right, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AddProduct;
    private javax.swing.JButton BTN_Create;
    private javax.swing.JButton BTN_FilterPhoneCusOld;
    private javax.swing.JButton BTN_Payments;
    private javax.swing.JComboBox<String> CBB_MinusPointsCus;
    private javax.swing.JComboBox<String> CBB_Payments;
    private javax.swing.JComboBox<String> CBB_Promotion;
    private javax.swing.JLabel JL_MinusPointsCus;
    private javax.swing.JLabel JL_MoneyChange;
    private javax.swing.JLabel JL_MoneyReceived;
    private javax.swing.JLabel JL_NameCus;
    private javax.swing.JLabel JL_Payments;
    private javax.swing.JLabel JL_PhoneCus;
    private javax.swing.JLabel JL_PhoneCusOld;
    private javax.swing.JLabel JL_PointCus;
    private javax.swing.JLabel JL_Promotion;
    private javax.swing.JLabel JL_Total;
    private javax.swing.JLabel JL_VND;
    private javax.swing.JPanel JP_Left;
    private javax.swing.JPanel JP_Right;
    private javax.swing.JPanel JP_Right_1;
    private javax.swing.JPanel JP_Right_2;
    private javax.swing.JPanel JP_Right_3;
    private javax.swing.JPanel JP_Right_4;
    private javax.swing.JScrollPane JSP_TableProduct;
    private javax.swing.JTable JTABLE_Product;
    private javax.swing.JTextField JTF_AddProduct;
    private javax.swing.JTextField JTF_MoneyChange;
    private javax.swing.JTextField JTF_MoneyReceived;
    private javax.swing.JTextField JTF_NameCus;
    private javax.swing.JTextField JTF_PhoneCus;
    private javax.swing.JTextField JTF_PhoneCusOld;
    private javax.swing.JTextField JTF_PointCus;
    private javax.swing.JTextField JTF_Total;
    // End of variables declaration//GEN-END:variables
}
