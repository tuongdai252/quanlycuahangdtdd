/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import BUS.nhacungcapBUS;
import DTO.nhacungcapDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QuanLyNhaCungCap extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyNhaCungCap
     */
    String [] columns = new String [] {"Mã ncc","Tên ncc","Điện thoại","Địa chỉ"};
    DefaultTableModel modeltable = new DefaultTableModel(null, columns);
    
    void HienThiDS(ArrayList ds) 
    {
        modeltable.getDataVector().removeAllElements();
        for (int i = 0; i < ds.size(); i++) {
            nhacungcapDTO a = (nhacungcapDTO) ds.get(i);
            modeltable.insertRow(i, new Object[]{a.mancc, a.tenncc, a.sdt, a.diachi});
        }
        jTable1.setModel(modeltable);
    }
    
    public QuanLyNhaCungCap() {
        initComponents();
        ArrayList dsncc = nhacungcapBUS.TimKiemTatCa();
        HienThiDS(dsncc);
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
        MaNCCLabel = new javax.swing.JLabel();
        MaNCCText = new javax.swing.JTextField();
        TenLabel = new javax.swing.JLabel();
        TenText = new javax.swing.JTextField();
        SDTLabel = new javax.swing.JLabel();
        SDTText = new javax.swing.JTextField();
        DiaChiLabel = new javax.swing.JLabel();
        DiaChiText = new javax.swing.JTextField();
        ThemButton = new javax.swing.JButton();
        SuaButton = new javax.swing.JButton();
        XoaButton = new javax.swing.JButton();
        TuKhoaLabel = new javax.swing.JLabel();
        TuKhoaText = new javax.swing.JTextField();
        TimButton = new javax.swing.JButton();
        DanhSachButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        MaNCCLabel.setText("Mã:");

        MaNCCText.setEditable(false);
        MaNCCText.setEnabled(false);
        MaNCCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaNCCTextActionPerformed(evt);
            }
        });

        TenLabel.setText("Tên:");

        TenText.setEnabled(false);
        TenText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenTextActionPerformed(evt);
            }
        });

        SDTLabel.setText("Số điện thoại:");

        SDTText.setEnabled(false);
        SDTText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDTTextActionPerformed(evt);
            }
        });

        DiaChiLabel.setText("Địa chỉ:");

        DiaChiText.setEnabled(false);
        DiaChiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiTextActionPerformed(evt);
            }
        });

        ThemButton.setText("Thêm");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });

        SuaButton.setText("Sửa");
        SuaButton.setEnabled(false);
        SuaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaButtonActionPerformed(evt);
            }
        });

        XoaButton.setText("Xóa");
        XoaButton.setEnabled(false);
        XoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaButtonActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(ThemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SuaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XoaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(TuKhoaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DanhSachButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MaNCCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MaNCCText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TenText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DiaChiLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDTLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SDTText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiaChiText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaNCCLabel)
                    .addComponent(MaNCCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDTLabel)
                    .addComponent(SDTText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaChiLabel)
                    .addComponent(DiaChiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TenLabel)
                    .addComponent(TenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemButton)
                    .addComponent(SuaButton)
                    .addComponent(XoaButton)
                    .addComponent(TuKhoaLabel)
                    .addComponent(TuKhoaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimButton)
                    .addComponent(DanhSachButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DiaChiLabel, DiaChiText, MaNCCLabel, MaNCCText, SDTLabel, SDTText, TenLabel, TenText});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã ncc", "Tên ncc", "Điện thoại", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaNCCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaNCCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaNCCTextActionPerformed

    private void TenTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenTextActionPerformed

    private void SDTTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDTTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SDTTextActionPerformed

    private void DiaChiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiTextActionPerformed

    private void SuaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaButtonActionPerformed
        if(MaNCCText.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã nhà cung cấp!!!!","Missing information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(TenText.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên nhà cung cấp!!!!","Missing information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhacungcapDTO ncc = new nhacungcapDTO();
        ncc.mancc = MaNCCText.getText();
        ncc.tenncc = TenText.getText();
        ncc.sdt = SDTText.getText();
        ncc.diachi = DiaChiText.getText();
        nhacungcapBUS.Sua(ncc);
        JOptionPane.showMessageDialog(null, "Sửa thành công","Success",JOptionPane.INFORMATION_MESSAGE);
        ArrayList dsncc = nhacungcapBUS.TimKiemTatCa();
        HienThiDS(dsncc);
    }//GEN-LAST:event_SuaButtonActionPerformed

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        ThemNhaCungCap a = new ThemNhaCungCap();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        //Refresh jTable
        a.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                ArrayList dsncc = nhacungcapBUS.TimKiemTatCa();
                HienThiDS(dsncc);
            }
        });
    }//GEN-LAST:event_ThemButtonActionPerformed

    private void XoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButtonActionPerformed
        String s = MaNCCText.getText();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            nhacungcapBUS.Xoa(s);
            JOptionPane.showMessageDialog(null, "Xóa thành công","Success",JOptionPane.INFORMATION_MESSAGE);
            ArrayList dsncc = nhacungcapBUS.TimKiemTatCa();
            HienThiDS(dsncc);
            MaNCCText.setText("");
            TenText.setText("");
            SDTText.setText("");
            DiaChiText.setText("");
            MaNCCText.enable(false);
            TenText.enable(false);
            SDTText.enable(false);
            DiaChiText.enable(false);
            SuaButton.setEnabled(false);
            XoaButton.setEnabled(false);
        }
    }//GEN-LAST:event_XoaButtonActionPerformed

    private void TimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimButtonActionPerformed
        String tukhoa = TuKhoaText.getText();
        ArrayList dsncc = nhacungcapBUS.TimKiemTheoTuKhoa(tukhoa);
        HienThiDS(dsncc);
        if(dsncc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả!!!","Not found",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TimButtonActionPerformed

    private void DanhSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhSachButtonActionPerformed
        ArrayList dsncc = nhacungcapBUS.TimKiemTatCa();
        HienThiDS(dsncc);
    }//GEN-LAST:event_DanhSachButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String mancc = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 0);
        String ten = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 1);
        String sdt = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 2);
        String diachi = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 3);
        MaNCCText.setText(mancc);
        TenText.setText(ten);
        SDTText.setText(sdt);
        DiaChiText.setText(diachi);
        MaNCCText.enable();
        TenText.enable();
        SDTText.enable();
        DiaChiText.enable();
        SuaButton.setEnabled(true);
        XoaButton.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DanhSachButton;
    private javax.swing.JLabel DiaChiLabel;
    private javax.swing.JTextField DiaChiText;
    private javax.swing.JLabel MaNCCLabel;
    private javax.swing.JTextField MaNCCText;
    private javax.swing.JLabel SDTLabel;
    private javax.swing.JTextField SDTText;
    private javax.swing.JButton SuaButton;
    private javax.swing.JLabel TenLabel;
    private javax.swing.JTextField TenText;
    private javax.swing.JButton ThemButton;
    private javax.swing.JButton TimButton;
    private javax.swing.JLabel TuKhoaLabel;
    private javax.swing.JTextField TuKhoaText;
    private javax.swing.JButton XoaButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
