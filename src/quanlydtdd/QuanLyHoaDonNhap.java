/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import DTO.hoadonnhapDTO;
import BUS.hoadonnhapBUS;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QuanLyHoaDonNhap extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyThongTinSanPham
     */
    String [] columns = new String [] {"Mã hóa đơn","Mã nhân viên","Mã nhà cung cấp","Ngày nhập","Tổng tiền"};
    DefaultTableModel modeltable = new DefaultTableModel(null, columns);
    
    void HienThiDS(ArrayList dshd) 
    {
        modeltable.getDataVector().removeAllElements();
        for (int i = 0; i < dshd.size(); i++) {
            hoadonnhapDTO a = (hoadonnhapDTO) dshd.get(i);
            modeltable.insertRow(i, new Object[]{a.mahdn, a.manv, a.mancc, a.ngaynhap, String.format("%.0f", a.tongtien)});
        }
        jTable1.setModel(modeltable);
    }
    
    public QuanLyHoaDonNhap()
    {
        initComponents();
        ArrayList dshdn = hoadonnhapBUS.TimKiemTatCa();
        HienThiDS(dshdn);
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
        MaHDLabel = new javax.swing.JLabel();
        MaHDText = new javax.swing.JTextField();
        MaNCCLabel = new javax.swing.JLabel();
        MaNCCText = new javax.swing.JTextField();
        NgayNhapLabel = new javax.swing.JLabel();
        NgayNhapText = new javax.swing.JTextField();
        MaNVLabel = new javax.swing.JLabel();
        MaNVText = new javax.swing.JTextField();
        TongTienLabel = new javax.swing.JLabel();
        TongTienText = new javax.swing.JTextField();
        ThemButton = new javax.swing.JButton();
        ChiTietButton = new javax.swing.JButton();
        TuKhoaLabel = new javax.swing.JLabel();
        TuKhoaText = new javax.swing.JTextField();
        TimButton = new javax.swing.JButton();
        DanhSachButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        MaHDLabel.setText("Mã HĐ:");

        MaHDText.setEditable(false);
        MaHDText.setEnabled(false);
        MaHDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaHDTextActionPerformed(evt);
            }
        });

        MaNCCLabel.setText("Mã nhà cc:");

        MaNCCText.setEditable(false);
        MaNCCText.setEnabled(false);
        MaNCCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaNCCTextActionPerformed(evt);
            }
        });

        NgayNhapLabel.setText("Ngày nhập:");

        NgayNhapText.setEditable(false);
        NgayNhapText.setEnabled(false);
        NgayNhapText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayNhapTextActionPerformed(evt);
            }
        });

        MaNVLabel.setText("Mã nhân viên:");

        MaNVText.setEditable(false);
        MaNVText.setEnabled(false);
        MaNVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaNVTextActionPerformed(evt);
            }
        });

        TongTienLabel.setText("Tổng tiền:");

        TongTienText.setEditable(false);
        TongTienText.setEnabled(false);
        TongTienText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TongTienTextActionPerformed(evt);
            }
        });

        ThemButton.setText("Thêm");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });

        ChiTietButton.setText("Xem chi tiết");
        ChiTietButton.setEnabled(false);
        ChiTietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiTietButtonActionPerformed(evt);
            }
        });

        TuKhoaLabel.setText("Từ khóa:");

        TimButton.setText("Tìm");
        TimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimButtonActionPerformed(evt);
            }
        });

        DanhSachButton.setText("Hiển thị danh sách");
        DanhSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanhSachButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaNCCLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaHDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaHDText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNCCText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TongTienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TongTienText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NgayNhapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MaNVLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NgayNhapText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNVText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChiTietButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(TuKhoaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DanhSachButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaHDLabel)
                    .addComponent(MaHDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNVLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaNCCLabel)
                    .addComponent(MaNCCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayNhapLabel)
                    .addComponent(NgayNhapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TongTienLabel)
                    .addComponent(TongTienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemButton)
                    .addComponent(TuKhoaLabel)
                    .addComponent(TuKhoaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimButton)
                    .addComponent(DanhSachButton)
                    .addComponent(ChiTietButton))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MaHDLabel, MaHDText, MaNCCLabel, MaNCCText, NgayNhapLabel, NgayNhapText, TongTienLabel, TongTienText});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaHDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaHDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaHDTextActionPerformed

    private void TongTienTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TongTienTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TongTienTextActionPerformed

    private void NgayNhapTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayNhapTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayNhapTextActionPerformed

    private void MaNCCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaNCCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaNCCTextActionPerformed

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        ThemHoaDonNhap a = new ThemHoaDonNhap();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        //Refresh jTable
        a.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                ArrayList dshdn = hoadonnhapBUS.TimKiemTatCa();
                HienThiDS(dshdn);
            }
        });
    }//GEN-LAST:event_ThemButtonActionPerformed

    private void TimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimButtonActionPerformed
        String tukhoa = TuKhoaText.getText();
        ArrayList dshd = hoadonnhapBUS.TimKiemTheoTuKhoa(tukhoa);
        HienThiDS(dshd);
        if(dshd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả!!!","Not found",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TimButtonActionPerformed

    private void DanhSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhSachButtonActionPerformed
        ArrayList dshd = hoadonnhapBUS.TimKiemTatCa();
        HienThiDS(dshd);
    }//GEN-LAST:event_DanhSachButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String mahd = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 0);
        String manv = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 1);
        String makh = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 2);
        String ngayxuat = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 3);
        String tongtien = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 4);
        MaHDText.setText(mahd);
        MaNVText.setText(manv);
        MaNCCText.setText(makh);
        NgayNhapText.setText(ngayxuat);
        TongTienText.setText(tongtien);
        MaHDText.enable();
        MaNVText.enable();
        MaNCCText.enable();
        NgayNhapText.enable();
        TongTienText.enable();
        ChiTietButton.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void MaNVTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaNVTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaNVTextActionPerformed

    private void ChiTietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiTietButtonActionPerformed
        XemChiTietHDN ct = new XemChiTietHDN(MaHDText.getText());
        ct.setMHD(MaHDText.getText());
        ct.setMNV(MaNVText.getText());
        ct.setMNCC(MaNCCText.getText());
        ct.setNN(NgayNhapText.getText());
        ct.setTT(TongTienText.getText());
        ct.setLocationRelativeTo(null);
        ct.setVisible(true);
        ct.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ChiTietButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChiTietButton;
    private javax.swing.JButton DanhSachButton;
    private javax.swing.JLabel MaHDLabel;
    private javax.swing.JTextField MaHDText;
    private javax.swing.JLabel MaNCCLabel;
    private javax.swing.JTextField MaNCCText;
    private javax.swing.JLabel MaNVLabel;
    private javax.swing.JTextField MaNVText;
    private javax.swing.JLabel NgayNhapLabel;
    private javax.swing.JTextField NgayNhapText;
    private javax.swing.JButton ThemButton;
    private javax.swing.JButton TimButton;
    private javax.swing.JLabel TongTienLabel;
    private javax.swing.JTextField TongTienText;
    private javax.swing.JLabel TuKhoaLabel;
    private javax.swing.JTextField TuKhoaText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
