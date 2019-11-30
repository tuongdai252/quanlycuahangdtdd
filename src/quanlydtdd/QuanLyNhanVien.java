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
public class QuanLyNhanVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    private void QLNhanVien()
    {
        QLNhanVien.setForeground(new java.awt.Color(0,0,0));
        QLQuyen.setForeground(new java.awt.Color(102,102,102));
        QuanLyThongTinNhanVien qlnv = new QuanLyThongTinNhanVien();
        /*Remove title bar*/
        BasicInternalFrameUI bqlnv = (BasicInternalFrameUI)qlnv.getUI();
        bqlnv.setNorthPane(null);
        //Remove surrounding borders
        qlnv.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qlnv.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        //Show jInternalFrame
        jDesktopPane1.add(qlnv);
        qlnv.setVisible(true);
        try {
            qlnv.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void QLQuyen()
    {
        QLQuyen.setForeground(new java.awt.Color(0,0,0));
        QLNhanVien.setForeground(new java.awt.Color(102,102,102));
        QuanLyQuyen qlq = new QuanLyQuyen();
        /*Remove title bar*/
        BasicInternalFrameUI bqlq = (BasicInternalFrameUI)qlq.getUI();
        bqlq.setNorthPane(null);
        //Remove surrounding borders
        qlq.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        qlq.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        //Show jInternalFrame
        jDesktopPane1.add(qlq);
        qlq.setVisible(true);
        try {
            qlq.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public QuanLyNhanVien() {
        initComponents();
        QLNhanVien.setOpaque(false);
        QLNhanVien.setContentAreaFilled(false);
        QLQuyen.setOpaque(false);
        QLQuyen.setContentAreaFilled(false);
        ButtonGroup btg = new ButtonGroup();
        btg.add(QLNhanVien);
        btg.add(QLQuyen);
        btg.setSelected(QLNhanVien.getModel(),true);
        QLNhanVien();
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
        QLNhanVien = new javax.swing.JToggleButton();
        QLQuyen = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jPanel1.setBackground(new java.awt.Color(251, 176, 59));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        QLNhanVien.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        QLNhanVien.setSelected(true);
        QLNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        QLNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNhanVienActionPerformed(evt);
            }
        });

        QLQuyen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        QLQuyen.setText("QUẢN LÝ QUYỀN");
        QLQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLQuyenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("|");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(QLQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QLNhanVien, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
            .addComponent(QLQuyen, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
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

    private void QLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNhanVienActionPerformed
        QLNhanVien();
    }//GEN-LAST:event_QLNhanVienActionPerformed

    private void QLQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLQuyenActionPerformed
        QLQuyen();
    }//GEN-LAST:event_QLQuyenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton QLNhanVien;
    private javax.swing.JToggleButton QLQuyen;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
