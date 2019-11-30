/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import dangnhap.DangNhap;
import java.awt.Color;
import java.awt.Insets;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Dat
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    String taikhoan = "";
    String maquyen = "";
    
    public void setUsername(String username) {
        taikhoan = username;
        jLabel4.setText(username);
    }
    
    public void setQuyen(String quyen) {
        maquyen = quyen;
    }
    
    private boolean isAccessQLKH(String quyen)
    {
        String[] allow = {"MQ04", "MQ01"};
        boolean isAccess = false;
        for(int i = 0; i < allow.length; i++)
        {
            if(quyen.equals(allow[i])){
                isAccess = true;
                break;
            }
        }
        return isAccess;
    }
    
    private boolean isAccessQLSP(String quyen)
    {
        String[] allow = {"MQ04", "MQ01", "MQ02", "MQ03"};
        boolean isAccess = false;
        for(int i = 0; i < allow.length; i++)
        {
            if(quyen.equals(allow[i])){
                isAccess = true;
                break;
            }
        }
        return isAccess;
    }
    
    private boolean isAccessQLHD(String quyen)
    {
        String[] allow = {"MQ04", "MQ01", "MQ02", "MQ03"};
        boolean isAccess = false;
        for(int i = 0; i < allow.length; i++)
        {
            if(quyen.equals(allow[i])){
                isAccess = true;
                break;
            }
        }
        return isAccess;
    }
    
    private boolean isAccessQLNV(String quyen)
    {
        String[] allow = {"MQ04"};
        boolean isAccess = false;
        for(int i = 0; i < allow.length; i++)
        {
            if(quyen.equals(allow[i])){
                isAccess = true;
                break;
            }
        }
        return isAccess;
    }
    
    private boolean isAccessQLNCC(String quyen)
    {
        String[] allow = {"MQ04", "MQ03"};
        boolean isAccess = false;
        for(int i = 0; i < allow.length; i++)
        {
            if(quyen.equals(allow[i])){
                isAccess = true;
                break;
            }
        }
        return isAccess;
    }
    
    private boolean isAccessTKBC(String quyen)
    {
        String[] allow = {"MQ04", "MQ02", "MQ03"};
        boolean isAccess = false;
        for(int i = 0; i < allow.length; i++)
        {
            if(quyen.equals(allow[i])){
                isAccess = true;
                break;
            }
        }
        return isAccess;
    }
    
    public Home() {
        initComponents();
        ButtonGroup btg = new ButtonGroup();
        btg.add(QLKH);
        btg.add(QLSP);
        btg.add(QLHD);
        btg.add(QLNV);
        btg.add(QLNCC);
        btg.add(TKBC);
        /*Giao dien Button Quan ly khach hang*/
        QLKH.setOpaque(false);
        QLKH.setContentAreaFilled(false);
        QLKH.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK));
        QLKH.setMargin(new Insets(0,0,0,0));
        /*Giao dien Button Quan ly san pham*/
        QLSP.setOpaque(false);
        QLSP.setContentAreaFilled(false);
        QLSP.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK));
        QLSP.setMargin(new Insets(0,0,0,0));
        /*Giao dien Button Quan ly don hang*/
        QLHD.setOpaque(false);
        QLHD.setContentAreaFilled(false);
        QLHD.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK));
        QLHD.setMargin(new Insets(0,0,0,0));
        /*Giao dien Button Quan ly nhan vien*/
        QLNV.setOpaque(false);
        QLNV.setContentAreaFilled(false);
        QLNV.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK));
        QLNV.setMargin(new Insets(0,0,0,0));
        /*Giao dien Button Quan ly nha cung cap*/
        QLNCC.setOpaque(false);
        QLNCC.setContentAreaFilled(false);
        QLNCC.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK));
        QLNCC.setMargin(new Insets(0,0,0,0));
        /*Giao dien Button Thong ke bao cao*/
        TKBC.setOpaque(false);
        TKBC.setContentAreaFilled(false);
        TKBC.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK));
        TKBC.setMargin(new Insets(0,0,0,0));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        QLKH = new javax.swing.JToggleButton();
        QLSP = new javax.swing.JToggleButton();
        QLHD = new javax.swing.JToggleButton();
        QLNV = new javax.swing.JToggleButton();
        TKBC = new javax.swing.JToggleButton();
        QLNCC = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý cửa hàng điện thoại di động");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(34, 181, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 600));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manger.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 100));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/computer-resize.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        QLKH.setBackground(new java.awt.Color(33, 178, 113));
        QLKH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        QLKH.setForeground(new java.awt.Color(0, 0, 0));
        QLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon navigation/customer-30.png"))); // NOI18N
        QLKH.setText("Khách hàng");
        QLKH.setBorder(null);
        QLKH.setContentAreaFilled(false);
        QLKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKH.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        QLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKHActionPerformed(evt);
            }
        });

        QLSP.setBackground(new java.awt.Color(33, 178, 113));
        QLSP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        QLSP.setForeground(new java.awt.Color(0, 0, 0));
        QLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon navigation/cell-phone-30.png"))); // NOI18N
        QLSP.setText("Sản phẩm");
        QLSP.setBorder(null);
        QLSP.setContentAreaFilled(false);
        QLSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLSP.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        QLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSPActionPerformed(evt);
            }
        });

        QLHD.setBackground(new java.awt.Color(33, 178, 113));
        QLHD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        QLHD.setForeground(new java.awt.Color(0, 0, 0));
        QLHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon navigation/bill-30.png"))); // NOI18N
        QLHD.setText("Hóa đơn");
        QLHD.setBorder(null);
        QLHD.setContentAreaFilled(false);
        QLHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLHD.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        QLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLHDActionPerformed(evt);
            }
        });

        QLNV.setBackground(new java.awt.Color(33, 178, 113));
        QLNV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        QLNV.setForeground(new java.awt.Color(0, 0, 0));
        QLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon navigation/staff-30.png"))); // NOI18N
        QLNV.setText("Nhân viên");
        QLNV.setBorder(null);
        QLNV.setContentAreaFilled(false);
        QLNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNV.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNVActionPerformed(evt);
            }
        });

        TKBC.setBackground(new java.awt.Color(33, 178, 113));
        TKBC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TKBC.setForeground(new java.awt.Color(0, 0, 0));
        TKBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon navigation/statistics-30.png"))); // NOI18N
        TKBC.setText("Thống kê");
        TKBC.setBorder(null);
        TKBC.setContentAreaFilled(false);
        TKBC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TKBC.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        TKBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKBCActionPerformed(evt);
            }
        });

        QLNCC.setBackground(new java.awt.Color(33, 178, 113));
        QLNCC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        QLNCC.setForeground(new java.awt.Color(0, 0, 0));
        QLNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon navigation/supplier-30.png"))); // NOI18N
        QLNCC.setText("Nhà cung cấp");
        QLNCC.setBorder(null);
        QLNCC.setContentAreaFilled(false);
        QLNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNCC.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        QLNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QLKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(QLSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(QLHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(QLNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(TKBC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(QLNCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(QLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(QLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(QLNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TKBC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(251, 176, 59));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 85));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quản lý cửa hàng điện thoại di động");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Welcome back,");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(Username)");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKHActionPerformed
        if(isAccessQLKH(maquyen))
        {
            jLabel1.setText("Quản lý khách hàng");
            QuanLyKhachHang qlkh = new QuanLyKhachHang();
            /*Remove title bar*/
            BasicInternalFrameUI bqlkh = (BasicInternalFrameUI)qlkh.getUI();
            bqlkh.setNorthPane(null);
            //Remove surrounding borders
            qlkh.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            qlkh.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
            //Show jInternalFrame
            jDesktopPane1.add(qlkh);
            qlkh.setVisible(true);
            try {
                qlkh.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập","Cannot access",JOptionPane.WARNING_MESSAGE);
            QLKH.setSelected(false);
        }
        
    }//GEN-LAST:event_QLKHActionPerformed

    private void QLNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNCCActionPerformed
        if(isAccessQLNCC(maquyen))
        {
            jLabel1.setText("Quản lý nhà cung cấp");
            QuanLyNhaCungCap qlncc = new QuanLyNhaCungCap();
            /*Remove title bar*/
            BasicInternalFrameUI bqlncc = (BasicInternalFrameUI)qlncc.getUI();
            bqlncc.setNorthPane(null);
            //Remove surrounding borders
            qlncc.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            qlncc.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
            //Show jInternalFrame
            jDesktopPane1.add(qlncc);
            qlncc.setVisible(true);
            try {
                qlncc.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập","Cannot access",JOptionPane.WARNING_MESSAGE);
            QLKH.setSelected(false);
        }
    }//GEN-LAST:event_QLNCCActionPerformed

    private void QLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSPActionPerformed
        if(isAccessQLSP(maquyen))
        {
            jLabel1.setText("Quản lý sản phẩm");
            QuanLySanPham qlsp = new QuanLySanPham();
            /*Remove title bar*/
            BasicInternalFrameUI bqlsp = (BasicInternalFrameUI)qlsp.getUI();
            bqlsp.setNorthPane(null);
            //Remove surrounding borders
            qlsp.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            qlsp.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
            //Show jInternalFrame
            jDesktopPane1.add(qlsp);
            qlsp.setVisible(true);
            try {
                qlsp.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập","Cannot access",JOptionPane.WARNING_MESSAGE);
            QLKH.setSelected(false);
        }
    }//GEN-LAST:event_QLSPActionPerformed

    private void QLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLHDActionPerformed
        if(isAccessQLHD(maquyen))
        {
            jLabel1.setText("Quản lý hóa đơn");
            QuanLyHoaDon qlhd = new QuanLyHoaDon();
            /*Remove title bar*/
            BasicInternalFrameUI bqlhd = (BasicInternalFrameUI)qlhd.getUI();
            bqlhd.setNorthPane(null);
            //Remove surrounding borders
            qlhd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            qlhd.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
            //Show jInternalFrame
            jDesktopPane1.add(qlhd);
            qlhd.setVisible(true);
            try {
                qlhd.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập","Cannot access",JOptionPane.WARNING_MESSAGE);
            QLKH.setSelected(false);
        }
    }//GEN-LAST:event_QLHDActionPerformed

    private void QLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNVActionPerformed
        if(isAccessQLNV(maquyen))
        {
            jLabel1.setText("Quản lý nhân viên");
            QuanLyNhanVien qlnv = new QuanLyNhanVien();
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
        else
        {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập","Cannot access",JOptionPane.WARNING_MESSAGE);
            QLKH.setSelected(false);
        }
    }//GEN-LAST:event_QLNVActionPerformed

    private void TKBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKBCActionPerformed
        if(isAccessTKBC(maquyen))
        {
            jLabel1.setText("Thống kê báo cáo");
            ThongKeBaoCao tk = new ThongKeBaoCao();
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
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập","Cannot access",JOptionPane.WARNING_MESSAGE);
            QLKH.setSelected(false);
        }
    }//GEN-LAST:event_TKBCActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton QLHD;
    private javax.swing.JToggleButton QLKH;
    private javax.swing.JToggleButton QLNCC;
    private javax.swing.JToggleButton QLNV;
    private javax.swing.JToggleButton QLSP;
    private javax.swing.JToggleButton TKBC;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
