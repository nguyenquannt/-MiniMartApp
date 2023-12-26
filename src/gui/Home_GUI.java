package gui;

import javax.swing.JPanel;
/**
 *
 * @author Nguyễn Quân 33, 124, 163 1292,717 JP center
 */
public class Home_GUI extends javax.swing.JFrame {

    private Sell_GUI sell_GUI;
    private ImportGoods_GUI importGoods_GUI;
    private InventoryManagement_GUI inventoryManagement_GUI;
    private Promotion_GUI promotion_GUI;
    private Statistical_GUI statistical_GUI;
    
    public Home_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1500, 800);

//        stopWebcam1();
//        stopWebcam2();
        JP_Center.removeAll();
        sell_GUI = new Sell_GUI();
        addJPanel(sell_GUI);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Main = new javax.swing.JPanel();
        JP_Top = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlNameShop = new javax.swing.JLabel();
        JP_Left = new javax.swing.JPanel();
        BTN_Promotion = new javax.swing.JButton();
        BTN_Sell = new javax.swing.JButton();
        BTN_ImportGoods = new javax.swing.JButton();
        BTN_InventoryManagement = new javax.swing.JButton();
        JL_NguyenQuan = new javax.swing.JLabel();
        BTN_Statistical1 = new javax.swing.JButton();
        JP_Center = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TẠP HÓA TRẦN NGỌC_Phần mềm được phát triển bởi Nguyễn Quân");
        setResizable(false);

        JP_Top.setBackground(new java.awt.Color(33, 124, 163));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Logo64.png"))); // NOI18N

        jlNameShop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jlNameShop.setForeground(new java.awt.Color(255, 255, 255));
        jlNameShop.setText("TẠP HÓA TRẦN NGỌC");

        javax.swing.GroupLayout JP_TopLayout = new javax.swing.GroupLayout(JP_Top);
        JP_Top.setLayout(JP_TopLayout);
        JP_TopLayout.setHorizontalGroup(
            JP_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_TopLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jlLogo)
                .addGap(18, 18, 18)
                .addComponent(jlNameShop)
                .addContainerGap(915, Short.MAX_VALUE))
        );
        JP_TopLayout.setVerticalGroup(
            JP_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_TopLayout.createSequentialGroup()
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JP_TopLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlNameShop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JP_Left.setBackground(new java.awt.Color(33, 124, 163));

        BTN_Promotion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_Promotion.setText("KHUYẾN MÃI");
        BTN_Promotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PromotionActionPerformed(evt);
            }
        });

        BTN_Sell.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_Sell.setText("BÁN HÀNG");
        BTN_Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SellActionPerformed(evt);
            }
        });

        BTN_ImportGoods.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_ImportGoods.setText("NHẬP HÀNG");
        BTN_ImportGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ImportGoodsActionPerformed(evt);
            }
        });

        BTN_InventoryManagement.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_InventoryManagement.setText("QUẢN LÝ KHO");
        BTN_InventoryManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_InventoryManagementActionPerformed(evt);
            }
        });

        JL_NguyenQuan.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        JL_NguyenQuan.setForeground(new java.awt.Color(255, 255, 255));
        JL_NguyenQuan.setText("V 0.0.1_Phát triển bởi Nguyễn Quân");

        BTN_Statistical1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_Statistical1.setText("THỐNG KÊ");
        BTN_Statistical1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Statistical1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_LeftLayout = new javax.swing.GroupLayout(JP_Left);
        JP_Left.setLayout(JP_LeftLayout);
        JP_LeftLayout.setHorizontalGroup(
            JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_Promotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_ImportGoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_InventoryManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP_LeftLayout.createSequentialGroup()
                        .addComponent(JL_NguyenQuan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BTN_Statistical1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_LeftLayout.setVerticalGroup(
            JP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BTN_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_ImportGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_InventoryManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_Promotion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_Statistical1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(JL_NguyenQuan)
                .addContainerGap())
        );

        javax.swing.GroupLayout JP_CenterLayout = new javax.swing.GroupLayout(JP_Center);
        JP_Center.setLayout(JP_CenterLayout);
        JP_CenterLayout.setHorizontalGroup(
            JP_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JP_CenterLayout.setVerticalGroup(
            JP_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JP_MainLayout = new javax.swing.GroupLayout(JP_Main);
        JP_Main.setLayout(JP_MainLayout);
        JP_MainLayout.setHorizontalGroup(
            JP_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JP_MainLayout.createSequentialGroup()
                .addComponent(JP_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_Center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JP_MainLayout.setVerticalGroup(
            JP_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MainLayout.createSequentialGroup()
                .addComponent(JP_Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP_Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP_MainLayout.createSequentialGroup()
                        .addComponent(JP_Center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_PromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PromotionActionPerformed
        //        stopWebcam1();
//        stopWebcam2();
        JP_Center.removeAll();
        promotion_GUI = new Promotion_GUI();
        addJPanel(promotion_GUI);
    }//GEN-LAST:event_BTN_PromotionActionPerformed

    private void BTN_SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SellActionPerformed
        //        stopWebcam1();
//        stopWebcam2();
        JP_Center.removeAll();
        sell_GUI = new Sell_GUI();
        addJPanel(sell_GUI);
    }//GEN-LAST:event_BTN_SellActionPerformed

    private void BTN_ImportGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ImportGoodsActionPerformed
        //        stopWebcam1();
//        stopWebcam2();
        JP_Center.removeAll();
        importGoods_GUI = new ImportGoods_GUI();
        addJPanel(importGoods_GUI);
    }//GEN-LAST:event_BTN_ImportGoodsActionPerformed

    private void BTN_InventoryManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_InventoryManagementActionPerformed
        //        stopWebcam1();
//        stopWebcam2();
        JP_Center.removeAll();
        inventoryManagement_GUI = new InventoryManagement_GUI();
        addJPanel(inventoryManagement_GUI);
    }//GEN-LAST:event_BTN_InventoryManagementActionPerformed

    private void BTN_Statistical1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Statistical1ActionPerformed
        //        stopWebcam1();
//        stopWebcam2();
        JP_Center.removeAll();
        statistical_GUI = new Statistical_GUI();
        addJPanel(statistical_GUI);
    }//GEN-LAST:event_BTN_Statistical1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_GUI().setVisible(true);
            }
        });
    }

//    Add panel gui to panel center
    public void addJPanel(JPanel jPanel) {
        JP_Center.add(jPanel);
        JP_Center.revalidate();
        JP_Center.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ImportGoods;
    private javax.swing.JButton BTN_InventoryManagement;
    private javax.swing.JButton BTN_Promotion;
    private javax.swing.JButton BTN_Sell;
    private javax.swing.JButton BTN_Statistical1;
    private javax.swing.JLabel JL_NguyenQuan;
    private javax.swing.JPanel JP_Center;
    private javax.swing.JPanel JP_Left;
    private javax.swing.JPanel JP_Main;
    private javax.swing.JPanel JP_Top;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNameShop;
    // End of variables declaration//GEN-END:variables
}
