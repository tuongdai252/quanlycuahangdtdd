/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import DTO.chitiethoadonxuatDTO;
import BUS.chitiethoadonxuatBUS;
import BUS.hoadonxuatBUS;
import BUS.sanphamBUS;
import DTO.hoadonxuatDTO;
import DTO.sanphamDTO;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ThongKeSPXuat extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyThongTinSanPham
     */
    String [] columns = new String [] {"Mã sản phẩm","Tên sản phẩm","Số lượng","Ngày xuất"};
    DefaultTableModel modeltable = new DefaultTableModel(null, columns);
    
    void HienThiDS(ArrayList dshd) 
    {
        modeltable.getDataVector().removeAllElements();
        for (int i = 0; i < dshd.size(); i++) {
            chitiethoadonxuatDTO a = (chitiethoadonxuatDTO) dshd.get(i);
            ArrayList ds = hoadonxuatBUS.TimKiemTheoTuKhoa(a.mahdx);
            hoadonxuatDTO b = (hoadonxuatDTO) ds.get(0);
            ArrayList dssp = sanphamBUS.TimKiemTheoTuKhoa(a.masp);
            sanphamDTO c = (sanphamDTO) dssp.get(0);
            modeltable.insertRow(i, new Object[]{a.masp, c.tensp, a.soluong, b.ngayhd});
        }
        jTable1.setModel(modeltable);
    }
    
    public ThongKeSPXuat()
    {
        initComponents();
        ButtonGroup rg = new ButtonGroup();
        rg.add(NgayRadioButton);
        rg.add(ThangRadioButton);
        rg.add(NamRadioButton);
        rg.setSelected(NgayRadioButton.getModel(),true);
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
        NgayXuatLabel = new javax.swing.JLabel();
        NgayText = new javax.swing.JTextField();
        ThangText = new javax.swing.JTextField();
        NamText = new javax.swing.JTextField();
        LoaiLabel = new javax.swing.JLabel();
        ThongKeButton = new javax.swing.JButton();
        NgayRadioButton = new javax.swing.JRadioButton();
        ThangRadioButton = new javax.swing.JRadioButton();
        NamRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TongSPText = new javax.swing.JTextField();
        TongSPLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        NgayXuatLabel.setText("Thời gian:");

        ThangText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThangTextActionPerformed(evt);
            }
        });

        LoaiLabel.setText("Thống kê theo:");

        ThongKeButton.setText("Thống kê");
        ThongKeButton.setEnabled(false);
        ThongKeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeButtonActionPerformed(evt);
            }
        });

        NgayRadioButton.setText("Ngày");
        NgayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayRadioButtonActionPerformed(evt);
            }
        });

        ThangRadioButton.setText("Tháng");
        ThangRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThangRadioButtonActionPerformed(evt);
            }
        });

        NamRadioButton.setText("Năm");
        NamRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamRadioButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("/");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("/");

        TongSPText.setEditable(false);
        TongSPText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TongSPTextActionPerformed(evt);
            }
        });

        TongSPLabel.setText("Tổng sản phẩm:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TongSPLabel)
                        .addGap(18, 18, 18)
                        .addComponent(TongSPText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NgayXuatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoaiLabel))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NgayRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ThangRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NamRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NgayText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ThangText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NamText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ThongKeButton)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoaiLabel)
                    .addComponent(NgayRadioButton)
                    .addComponent(ThangRadioButton)
                    .addComponent(NamRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NgayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ThangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ThongKeButton)
                        .addComponent(NgayXuatLabel))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TongSPLabel)
                    .addComponent(TongSPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NgayXuatLabel, ThangText});

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
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Ngày xuất"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThangTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThangTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThangTextActionPerformed

    private void ThongKeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKeButtonActionPerformed
        String thoigian = "";
        if(NgayRadioButton.isSelected())
        {
            thoigian = NgayText.getText() + "/" + ThangText.getText() + "/" + NamText.getText();
            ArrayList dshd = chitiethoadonxuatBUS.TimKiemTheoNgay(thoigian);
            HienThiDS(dshd);
        }
        else if(ThangRadioButton.isSelected())
        {
            thoigian = ThangText.getText() + "/" + NamText.getText();
            ArrayList dshd = chitiethoadonxuatBUS.TimKiemTheoThang(thoigian);
            HienThiDS(dshd);
        }
        else if(NamRadioButton.isSelected())
        {
            thoigian = NamText.getText();
            ArrayList dshd = chitiethoadonxuatBUS.TimKiemTheoThang(thoigian);
            HienThiDS(dshd);
        }
        int tongsp = 0;
        TongSPText.enable(true);
        for(int i = 0; i < modeltable.getRowCount(); i++)
        {
            tongsp += Integer.parseInt(String.valueOf(modeltable.getValueAt(i,2)));
        }
        TongSPText.setText(String.valueOf(tongsp));
    }//GEN-LAST:event_ThongKeButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void NgayRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayRadioButtonActionPerformed
        NgayText.enable(true);
        ThangText.enable(true);
        NamText.enable(true);
        NgayText.setText("");
        ThangText.setText("");
        NamText.setText("");
        ThongKeButton.setEnabled(true);
    }//GEN-LAST:event_NgayRadioButtonActionPerformed

    private void ThangRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThangRadioButtonActionPerformed
        NgayText.enable(false);
        ThangText.enable(true);
        NamText.enable(true);
        NgayText.setText("");
        ThangText.setText("");
        NamText.setText("");
        ThongKeButton.setEnabled(true);
    }//GEN-LAST:event_ThangRadioButtonActionPerformed

    private void NamRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamRadioButtonActionPerformed
        NgayText.enable(false);
        ThangText.enable(false);
        NamText.enable(true);
        NgayText.setText("");
        ThangText.setText("");
        NamText.setText("");
        ThongKeButton.setEnabled(true);
    }//GEN-LAST:event_NamRadioButtonActionPerformed

    private void TongSPTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TongSPTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TongSPTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoaiLabel;
    private javax.swing.JRadioButton NamRadioButton;
    private javax.swing.JTextField NamText;
    private javax.swing.JRadioButton NgayRadioButton;
    private javax.swing.JTextField NgayText;
    private javax.swing.JLabel NgayXuatLabel;
    private javax.swing.JRadioButton ThangRadioButton;
    private javax.swing.JTextField ThangText;
    private javax.swing.JButton ThongKeButton;
    private javax.swing.JLabel TongSPLabel;
    private javax.swing.JTextField TongSPText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
