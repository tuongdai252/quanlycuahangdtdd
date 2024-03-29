/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import BUS.chitiethoadonxuatBUS;
import DTO.chitiethoadonxuatDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class XemChiTietHDX extends javax.swing.JFrame {

    /**
     * Creates new form XemChiTietHDX
     */
    public void setMHD(String mhd){
        MHD.setText(mhd);
    }
    
    public void setMNV(String mnv){
        MNV.setText(mnv);
    }
    
    public void setMKH(String mkh){
        MKH.setText(mkh);
    }
    
    public void setNX(String nx){
        NX.setText(nx);
    }
    
    public void setTT(String tt){
        TT.setText(tt);
    }
    
    String [] columns = new String [] {"Mã sản phẩm","Số lượng","Đơn giá","Thành tiền"};
    DefaultTableModel modeltable = new DefaultTableModel(null, columns);
    
    void HienThiDS(ArrayList dshd) 
    {
        modeltable.getDataVector().removeAllElements();
        for (int i = 0; i < dshd.size(); i++) {
            chitiethoadonxuatDTO a = (chitiethoadonxuatDTO) dshd.get(i);
            modeltable.insertRow(i, new Object[]{a.masp, a.soluong, String.format("%.0f", a.dongia), a.thanhtien});
        }
        jTable1.setModel(modeltable);
    }
    
    public XemChiTietHDX() {
        initComponents();
        ArrayList dshdx = chitiethoadonxuatBUS.TimKiemTatCa();
        HienThiDS(dshdx);
    }
    
    public XemChiTietHDX(String mhd){
        initComponents();
        ArrayList dshdx = chitiethoadonxuatBUS.TimKiemTheoMa(mhd);
        HienThiDS(dshdx);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaHDLabel = new javax.swing.JLabel();
        MaKhachLabel = new javax.swing.JLabel();
        MaNVLabel = new javax.swing.JLabel();
        NgayXuatLabel = new javax.swing.JLabel();
        TongTienLabel = new javax.swing.JLabel();
        MHD = new javax.swing.JLabel();
        MNV = new javax.swing.JLabel();
        MKH = new javax.swing.JLabel();
        NX = new javax.swing.JLabel();
        TT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chi tiết hóa đơn xuất");
        setResizable(false);

        MaHDLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MaHDLabel.setText("HÓA ĐƠN XUẤT: ");

        MaKhachLabel.setText("Mã khách:");

        MaNVLabel.setText("Mã nhân viên:");

        NgayXuatLabel.setText("Ngày xuất:");

        TongTienLabel.setText("Tổng tiền:");

        MHD.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MHD.setText("(Mã hđ)");

        MNV.setText("(Mã nv)");

        MKH.setText("(Mã kh)");

        NX.setText("(Ngày xuất)");

        TT.setText("(Tổng tiền)");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MaHDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MHD))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(MaNVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(NgayXuatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NX, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MaKhachLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TongTienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TT, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(MKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaHDLabel)
                    .addComponent(MHD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaNVLabel)
                    .addComponent(MaKhachLabel)
                    .addComponent(MNV)
                    .addComponent(MKH))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayXuatLabel)
                    .addComponent(TongTienLabel)
                    .addComponent(NX)
                    .addComponent(TT))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XemChiTietHDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemChiTietHDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemChiTietHDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemChiTietHDX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemChiTietHDX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MHD;
    private javax.swing.JLabel MKH;
    private javax.swing.JLabel MNV;
    private javax.swing.JLabel MaHDLabel;
    private javax.swing.JLabel MaKhachLabel;
    private javax.swing.JLabel MaNVLabel;
    private javax.swing.JLabel NX;
    private javax.swing.JLabel NgayXuatLabel;
    private javax.swing.JLabel TT;
    private javax.swing.JLabel TongTienLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
