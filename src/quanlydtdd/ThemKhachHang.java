/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import BUS.khachhangBUS;
import DTO.khachhangDTO;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ThemKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form ThemKhachHang
     */
    public ThemKhachHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaKHLabel = new javax.swing.JLabel();
        MaKHText = new javax.swing.JTextField();
        SDTLabel = new javax.swing.JLabel();
        SDTText = new javax.swing.JTextField();
        HoLabel = new javax.swing.JLabel();
        HoText = new javax.swing.JTextField();
        DiaChiLabel = new javax.swing.JLabel();
        DiaChiText = new javax.swing.JTextField();
        TenLabel = new javax.swing.JLabel();
        TenText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ThemButton = new javax.swing.JButton();
        HuyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm khách hàng");
        setResizable(false);

        MaKHLabel.setText("Mã khách hàng:");

        MaKHText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaKHTextActionPerformed(evt);
            }
        });

        SDTLabel.setText("Số điện thoại:");

        SDTText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDTTextActionPerformed(evt);
            }
        });

        HoLabel.setText("Họ:");

        HoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoTextActionPerformed(evt);
            }
        });

        DiaChiLabel.setText("Địa chỉ:");

        DiaChiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiTextActionPerformed(evt);
            }
        });

        TenLabel.setText("Tên:");

        TenText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 181, 115));
        jLabel1.setText("THÊM KHÁCH HÀNG");

        ThemButton.setText("Lưu");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });

        HuyButton.setText("Hủy");
        HuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaKHLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HoText, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(MaKHText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ThemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SDTLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SDTText, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(TenText)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(HuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DiaChiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaChiText, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaKHLabel)
                            .addComponent(MaKHText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HoLabel)
                            .addComponent(HoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SDTLabel)
                            .addComponent(SDTText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TenLabel)
                            .addComponent(TenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaChiLabel)
                    .addComponent(DiaChiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemButton)
                    .addComponent(HuyButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaKHTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaKHTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaKHTextActionPerformed

    private void SDTTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDTTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SDTTextActionPerformed

    private void HoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoTextActionPerformed

    private void DiaChiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiTextActionPerformed

    private void TenTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenTextActionPerformed

    private void HuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_HuyButtonActionPerformed

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        if(MaKHText.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã khách hàng!!!!","Missing information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(TenText.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên khách hàng!!!!","Missing information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (khachhangBUS.kiemTraTonTai(MaKHText.getText()) == true)
        {
            JOptionPane.showConfirmDialog((Component) null, "Mã khách hàng đã tồn tại", "alert", JOptionPane.CLOSED_OPTION);
            return;
        }
        khachhangDTO kh = new khachhangDTO();
        kh.makh = MaKHText.getText();
        kh.ho = HoText.getText();
        kh.ten = TenText.getText();
        kh.sdt = SDTText.getText();
        kh.diachi = DiaChiText.getText();
        khachhangBUS.Them(kh);
        JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công","Success",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_ThemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ThemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiaChiLabel;
    private javax.swing.JTextField DiaChiText;
    private javax.swing.JLabel HoLabel;
    private javax.swing.JTextField HoText;
    private javax.swing.JButton HuyButton;
    private javax.swing.JLabel MaKHLabel;
    private javax.swing.JTextField MaKHText;
    private javax.swing.JLabel SDTLabel;
    private javax.swing.JTextField SDTText;
    private javax.swing.JLabel TenLabel;
    private javax.swing.JTextField TenText;
    private javax.swing.JButton ThemButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
