/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import BUS.chitiethoadonxuatBUS;
import BUS.hoadonxuatBUS;
import BUS.khachhangBUS;
import BUS.nhanvienBUS;
import BUS.sanphamBUS;
import DTO.chitiethoadonxuatDTO;
import DTO.hoadonxuatDTO;
import DTO.sanphamDTO;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import otherfunctions.ConvertNumberToWords;

/**
 *
 * @author ASUS
 */
public class ThemHoaDonXuat extends javax.swing.JFrame {

    /**
     * Creates new form ThemHoaDonXuat
     */
    String [] columns = new String [] {"Mã sản phẩm","Số lượng","Đơn giá","Thành tiền"};
    DefaultTableModel modeltable = new DefaultTableModel(null, columns);
    
    void TinhTongTien()
    {
        float tongtien = 0;
        for (int i = 0; i < modeltable.getRowCount(); i++) {
            float cong = Float.parseFloat(String.valueOf(modeltable.getValueAt(i,3)));
            tongtien += cong;
        }
        TongTienText.setText(String.valueOf(tongtien));
    }
    
    void HienThiDS() 
    {
        if (sanphamBUS.kiemTraTonTai(MaSPText.getText()) == false)
        {
            JOptionPane.showConfirmDialog((Component) null, "Mã không tồn tại", "alert", JOptionPane.CLOSED_OPTION);
            return;
        }
        String masp = MaSPText.getText();
        int soluong = Integer.valueOf(SoLuongText.getText());
        float dongia = Float.valueOf(DonGiaText.getText());
        float thanhtien = dongia * soluong;
        Object[] row = {masp, soluong, dongia, thanhtien};
        modeltable.addRow(row);
        jTable1.setModel(modeltable);
        TinhTongTien();
    }
    
    public ThemHoaDonXuat() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MaSPText = new javax.swing.JTextField();
        DonGiaLabel = new javax.swing.JLabel();
        SoLuongText = new javax.swing.JTextField();
        MaSPLabel = new javax.swing.JLabel();
        SOLuongLabel = new javax.swing.JLabel();
        DonGiaText = new javax.swing.JTextField();
        ThemButton = new javax.swing.JButton();
        XoaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        MaHDLabel = new javax.swing.JLabel();
        MaHDText = new javax.swing.JTextField();
        MaKhachLabel = new javax.swing.JLabel();
        MaKhachText = new javax.swing.JTextField();
        MaNVLabel = new javax.swing.JLabel();
        MaNVText = new javax.swing.JTextField();
        NgayXuatLabel = new javax.swing.JLabel();
        NgayXuatText = new javax.swing.JTextField();
        TongTienLabel = new javax.swing.JLabel();
        TongTienText = new javax.swing.JTextField();
        LuuButton = new javax.swing.JButton();
        HuyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm hóa đơn xuất");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 181, 115));
        jLabel1.setText("THÊM HÓA ĐƠN XUẤT");

        DonGiaLabel.setText("Đơn giá:");

        SoLuongText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoLuongTextActionPerformed(evt);
            }
        });

        MaSPLabel.setText("Mã SP:");

        SOLuongLabel.setText("Số lượng:");

        ThemButton.setText("Thêm chi tiết");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });

        XoaButton.setText("Xóa");
        XoaButton.setEnabled(false);
        XoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaSPLabel)
                .addGap(4, 4, 4)
                .addComponent(MaSPText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SOLuongLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoLuongText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DonGiaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonGiaText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThemButton)
                .addGap(18, 18, 18)
                .addComponent(XoaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MaSPLabel)
                        .addComponent(SoLuongText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MaSPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SOLuongLabel)
                        .addComponent(DonGiaLabel)
                        .addComponent(DonGiaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ThemButton)
                        .addComponent(XoaButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );

        MaHDLabel.setText("Mã HĐ:");

        MaHDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaHDTextActionPerformed(evt);
            }
        });

        MaKhachLabel.setText("Mã khách:");

        MaKhachText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaKhachTextActionPerformed(evt);
            }
        });

        MaNVLabel.setText("Mã nhân viên:");

        MaNVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaNVTextActionPerformed(evt);
            }
        });

        NgayXuatLabel.setText("Ngày xuất:");

        NgayXuatText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayXuatTextActionPerformed(evt);
            }
        });

        TongTienLabel.setText("Tổng tiền:");

        TongTienText.setEditable(false);
        TongTienText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TongTienTextActionPerformed(evt);
            }
        });

        LuuButton.setText("Lưu");
        LuuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuButtonActionPerformed(evt);
            }
        });

        HuyButton.setText("Hủy");
        HuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(MaHDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(MaHDText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(LuuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(MaKhachLabel)
                            .addGap(40, 40, 40)
                            .addComponent(MaKhachText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(MaNVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MaNVText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(TongTienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TongTienText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NgayXuatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NgayXuatText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TongTienLabel)
                            .addComponent(TongTienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NgayXuatLabel)
                            .addComponent(NgayXuatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(HuyButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaHDLabel)
                            .addComponent(MaHDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaNVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNVLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaKhachLabel)
                            .addComponent(MaKhachText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(LuuButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaHDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaHDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaHDTextActionPerformed

    private void MaKhachTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaKhachTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaKhachTextActionPerformed

    private void MaNVTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaNVTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaNVTextActionPerformed

    private void NgayXuatTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayXuatTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayXuatTextActionPerformed

    private void TongTienTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TongTienTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TongTienTextActionPerformed

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        HienThiDS();
        MaSPText.setText("");
        SoLuongText.setText("");
        DonGiaText.setText("");
    }//GEN-LAST:event_ThemButtonActionPerformed

    private void SoLuongTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoLuongTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoLuongTextActionPerformed

    private void HuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_HuyButtonActionPerformed

    private void LuuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuButtonActionPerformed
        if (hoadonxuatBUS.kiemTraTonTai(MaHDText.getText()) == true)
        {
            JOptionPane.showConfirmDialog((Component) null, "Mã hóa đơn đã tồn tại", "alert", JOptionPane.CLOSED_OPTION);
            return;
        }
        if (nhanvienBUS.kiemTraTonTai(MaNVText.getText()) == false)
        {
            JOptionPane.showConfirmDialog((Component) null, "Mã nhân viên không tồn tại", "alert", JOptionPane.CLOSED_OPTION);
            return;
        }
        if (khachhangBUS.kiemTraTonTai(MaKhachText.getText()) == false)
        {
            JOptionPane.showConfirmDialog((Component) null, "Mã khách hàng không tồn tại", "alert", JOptionPane.CLOSED_OPTION);
            return;
        }
        if (modeltable.getRowCount() < 0)
        {
            JOptionPane.showConfirmDialog((Component) null, "Chưa có chi tiết hóa đơn", "alert", JOptionPane.CLOSED_OPTION);
        }
        //Them hoa don
        hoadonxuatDTO hd = new hoadonxuatDTO();
        hd.mahdx = MaHDText.getText();
        hd.manv = MaNVText.getText();
        hd.makh = MaKhachText.getText();
        hd.ngayhd = NgayXuatText.getText();
        hd.tongtien = Float.valueOf(TongTienText.getText());
        hoadonxuatBUS.Them(hd);
        for (int i = 0; i < modeltable.getRowCount(); i++) {
            //Them chi tiet hoa don
            chitiethoadonxuatDTO ct = new chitiethoadonxuatDTO();
            ct.mahdx = hd.mahdx;
            ct.masp = String.valueOf(modeltable.getValueAt(i,0));
            ct.soluong = Integer.parseInt(String.valueOf(modeltable.getValueAt(i,1)));
            ct.dongia = Float.parseFloat(String.valueOf(modeltable.getValueAt(i,2)));
            ConvertNumberToWords cnw = new ConvertNumberToWords();
            float tt = Float.parseFloat(String.valueOf(modeltable.getValueAt(i,3)));
            int rtt = (int) tt;
            String thanhtien = cnw.NumToWords(rtt) + " đồng";
            ct.thanhtien = thanhtien;
            chitiethoadonxuatBUS.Them(ct);
            //Chinh so luong san pham
            ArrayList dssp = sanphamBUS.TimKiemTheoTuKhoa(ct.masp);
            sanphamDTO s = (sanphamDTO) dssp.get(0);
            s.soluong -= ct.soluong;
            sanphamBUS.Sua(s);
        }
        JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công","Success",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_LuuButtonActionPerformed

    private void XoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButtonActionPerformed
        modeltable.removeRow(jTable1.getSelectedRow());
        jTable1.setModel(modeltable);
        TinhTongTien();
        XoaButton.setEnabled(false);
    }//GEN-LAST:event_XoaButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        XoaButton.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ThemHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemHoaDonXuat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DonGiaLabel;
    private javax.swing.JTextField DonGiaText;
    private javax.swing.JButton HuyButton;
    private javax.swing.JButton LuuButton;
    private javax.swing.JLabel MaHDLabel;
    private javax.swing.JTextField MaHDText;
    private javax.swing.JLabel MaKhachLabel;
    private javax.swing.JTextField MaKhachText;
    private javax.swing.JLabel MaNVLabel;
    private javax.swing.JTextField MaNVText;
    private javax.swing.JLabel MaSPLabel;
    private javax.swing.JTextField MaSPText;
    private javax.swing.JLabel NgayXuatLabel;
    private javax.swing.JTextField NgayXuatText;
    private javax.swing.JLabel SOLuongLabel;
    private javax.swing.JTextField SoLuongText;
    private javax.swing.JButton ThemButton;
    private javax.swing.JLabel TongTienLabel;
    private javax.swing.JTextField TongTienText;
    private javax.swing.JButton XoaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}