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
        TKChi = new javax.swing.JToggleButton();
        TKSPXuat = new javax.swing.JToggleButton();
        TKSPNhap = new javax.swing.JToggleButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        TKThu.setText("THỐNG KÊ THU");
        TKThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKThuActionPerformed(evt);
            }
        });

        TKChi.setText("THỐNG KÊ CHI");
        TKChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKChiActionPerformed(evt);
            }
        });

        TKSPXuat.setText("THỐNG KÊ SẢN PHẨM XUẤT");
        TKSPXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKSPXuatActionPerformed(evt);
            }
        });

        TKSPNhap.setText("THỐNG KÊ SẢN PHẨM NHẬP");
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
                .addComponent(TKThu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TKChi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TKSPXuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TKSPNhap)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                .addComponent(TKSPNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TKSPXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TKThu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(TKChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
