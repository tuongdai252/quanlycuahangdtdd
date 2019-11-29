/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author ASUS
 */
public class ThongKeBaoCao extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    private void ThongKeThu()
    {
        TKThu.setForeground(new java.awt.Color(0,0,0));
        TKChi.setForeground(new java.awt.Color(102,102,102));
        TKSPXuat.setForeground(new java.awt.Color(102,102,102));
        TKSPNhap.setForeground(new java.awt.Color(102,102,102));
        ThongKeThu tk = new ThongKeThu();
        /*Remove title bar*/
        BasicInternalFrameUI btk = (BasicInternalFrameUI)tk.getUI();
        btk.setNorthPane(null);
        //Remove surrounding borders
        tk.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tk.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        //Show jInternalFrame
        jDesktopPane1.add(tk);
        tk.setVisible(true);
        try {
            tk.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ThongKeBaoCao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ThongKeChi()
    {
        TKChi.setForeground(new java.awt.Color(0,0,0));
        TKThu.setForeground(new java.awt.Color(102,102,102));
        TKSPXuat.setForeground(new java.awt.Color(102,102,102));
        TKSPNhap.setForeground(new java.awt.Color(102,102,102));
        ThongKeChi tk = new ThongKeChi();
        /*Remove title bar*/
        BasicInternalFrameUI btk = (BasicInternalFrameUI)tk.getUI();
        btk.setNorthPane(null);
        //Remove surrounding borders
        tk.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tk.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        //Show jInternalFrame
        jDesktopPane1.add(tk);
        tk.setVisible(true);
        try {
            tk.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ThongKeBaoCao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ThongKeSPXuat()
    {
        TKSPXuat.setForeground(new java.awt.Color(0,0,0));
        TKThu.setForeground(new java.awt.Color(102,102,102));
        TKChi.setForeground(new java.awt.Color(102,102,102));
        TKSPNhap.setForeground(new java.awt.Color(102,102,102));
        ThongKeSPXuat tk = new ThongKeSPXuat();
        /*Remove title bar*/
        BasicInternalFrameUI btk = (BasicInternalFrameUI)tk.getUI();
        btk.setNorthPane(null);
        //Remove surrounding borders
        tk.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tk.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        //Show jInternalFrame
        jDesktopPane1.add(tk);
        tk.setVisible(true);
        try {
            tk.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ThongKeBaoCao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ThongKeSPNhap()
    {
        TKSPNhap.setForeground(new java.awt.Color(0,0,0));
        TKThu.setForeground(new java.awt.Color(102,102,102));
        TKChi.setForeground(new java.awt.Color(102,102,102));
        TKSPXuat.setForeground(new java.awt.Color(102,102,102));
        ThongKeSPNhap tk = new ThongKeSPNhap();
        /*Remove title bar*/
        BasicInternalFrameUI btk = (BasicInternalFrameUI)tk.getUI();
        btk.setNorthPane(null);
        //Remove surrounding borders
        tk.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tk.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        //Show jInternalFrame
        jDesktopPane1.add(tk);
        tk.setVisible(true);
        try {
            tk.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ThongKeBaoCao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ThongKeBaoCao() {
        initComponents();
        //Giao dien button Thong ke hoanh thu
        TKThu.setOpaque(false);
        TKThu.setContentAreaFilled(false);
        //Giao dien button Thongke chi phi
        TKChi.setOpaque(false);
        TKChi.setContentAreaFilled(false);
        //Giao dien button Thong ke san pham xuat
        TKSPXuat.setOpaque(false);
        TKSPXuat.setContentAreaFilled(false);
        //Giao dien button Thong ke san pham nhap
        TKSPNhap.setOpaque(false);
        TKSPNhap.setContentAreaFilled(false);
        //Group button
        ButtonGroup btg = new ButtonGroup();
        btg.add(TKThu);
        btg.add(TKChi);
        btg.add(TKSPXuat);
        btg.add(TKSPNhap);
        btg.setSelected(TKThu.getModel(),true);
        ThongKeThu();
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
        TKThu = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        TKChi = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        TKSPXuat = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        TKSPNhap = new javax.swing.JToggleButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jPanel1.setBackground(new java.awt.Color(251, 176, 59));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        TKThu.setSelected(true);
        TKThu.setText("DOANH THU");
        TKThu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TKThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKThuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("|");

        TKChi.setText("CHI PHÍ");
        TKChi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TKChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKChiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("|");

        TKSPXuat.setText("SẢN PHẨM XUẤT");
        TKSPXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TKSPXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKSPXuatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setText("|");

        TKSPNhap.setText("SẢN PHẨM NHẬP");
        TKSPNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TKSPNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKSPNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TKThu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TKChi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TKSPXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(TKSPNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(TKChi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TKSPNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TKThu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TKSPXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TKThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKThuActionPerformed
        ThongKeThu();
    }//GEN-LAST:event_TKThuActionPerformed

    private void TKChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKChiActionPerformed
        ThongKeChi();
    }//GEN-LAST:event_TKChiActionPerformed

    private void TKSPXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKSPXuatActionPerformed
        ThongKeSPXuat();
    }//GEN-LAST:event_TKSPXuatActionPerformed

    private void TKSPNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKSPNhapActionPerformed
        ThongKeSPNhap();
    }//GEN-LAST:event_TKSPNhapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton TKChi;
    private javax.swing.JToggleButton TKSPNhap;
    private javax.swing.JToggleButton TKSPXuat;
    private javax.swing.JToggleButton TKThu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
