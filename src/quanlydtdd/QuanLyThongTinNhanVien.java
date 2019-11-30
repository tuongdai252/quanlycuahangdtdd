/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydtdd;

import BUS.nhanvienBUS;
import BUS.quyenBUS;
import DTO.nhanvienDTO;
import DTO.quyenDTO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QuanLyThongTinNhanVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyThongTinNhanVien
     */
    String [] columns = new String [] {"Mã nhân viên","Họ","Tên","Điện thoại","Địa chỉ","Ngày vào làm","Chức vụ","Lương","Quyền"};
    DefaultTableModel modeltable = new DefaultTableModel(null, columns);
    DefaultComboBoxModel modelcombobox1 = new DefaultComboBoxModel();
    
    void HienThiQuyen(ArrayList dsq)
    {
        for (int i = 0; i< dsq.size(); i++) {
            quyenDTO a = (quyenDTO) dsq.get(i);
            modelcombobox1.addElement(a.quyen);
        }
        QuyenComboBox.setModel(modelcombobox1);
    }
    
    void HienThiDS(ArrayList ds) 
    {
        modeltable.getDataVector().removeAllElements();
        for (int i = 0; i < ds.size(); i++) {
            nhanvienDTO a = (nhanvienDTO) ds.get(i);
            ArrayList dsq = quyenBUS.TimKiemTheoMa(a.maquyen);
            quyenDTO b = (quyenDTO) dsq.get(0);
            modeltable.insertRow(i, new Object[]{a.manv, a.ho, a.ten, a.sdt, a.diachi, a.ngayvaolam, a.chucvu, String.format("%.0f", a.luong), b.quyen});
        }
        jTable1.setModel(modeltable);
    }
    
    public QuanLyThongTinNhanVien() {
        initComponents();
        ArrayList dsq = quyenBUS.TimKiemTatCa();
        HienThiQuyen(dsq);
        ArrayList dsnv = nhanvienBUS.TimKiemTatCa();
        HienThiDS(dsnv);
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
        MaNVLabel = new javax.swing.JLabel();
        MaNVText = new javax.swing.JTextField();
        HoLabel = new javax.swing.JLabel();
        NgayVaoLamText = new javax.swing.JTextField();
        TenLabel = new javax.swing.JLabel();
        TenText = new javax.swing.JTextField();
        SDTLabel = new javax.swing.JLabel();
        HoText = new javax.swing.JTextField();
        DiaChiLabel = new javax.swing.JLabel();
        SDTText = new javax.swing.JTextField();
        NgayVaoLamLabel = new javax.swing.JLabel();
        ChucVuLabel = new javax.swing.JLabel();
        LuongLabel = new javax.swing.JLabel();
        DiaChiText = new javax.swing.JTextField();
        LuongText = new javax.swing.JTextField();
        ThemButton = new javax.swing.JButton();
        SuaButton = new javax.swing.JButton();
        XoaButton = new javax.swing.JButton();
        TuKhoaLabel = new javax.swing.JLabel();
        TuKhoaText = new javax.swing.JTextField();
        TimButton = new javax.swing.JButton();
        DanhSachButton = new javax.swing.JButton();
        QuyenLabel = new javax.swing.JLabel();
        QuyenComboBox = new javax.swing.JComboBox<>();
        ChucVuText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        MaNVLabel.setText("Mã nhân viên:");

        MaNVText.setEditable(false);
        MaNVText.setEnabled(false);
        MaNVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaNVTextActionPerformed(evt);
            }
        });

        HoLabel.setText("Họ:");

        NgayVaoLamText.setEnabled(false);
        NgayVaoLamText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayVaoLamTextActionPerformed(evt);
            }
        });

        TenLabel.setText("Tên:");

        TenText.setEnabled(false);
        TenText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenTextActionPerformed(evt);
            }
        });

        SDTLabel.setText("Điện thoại:");

        HoText.setEnabled(false);
        HoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoTextActionPerformed(evt);
            }
        });

        DiaChiLabel.setText("Địa chỉ:");

        SDTText.setEnabled(false);
        SDTText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDTTextActionPerformed(evt);
            }
        });

        NgayVaoLamLabel.setText("Ngày vào làm:");

        ChucVuLabel.setText("Chức vụ:");

        LuongLabel.setText("Lương:");

        DiaChiText.setEnabled(false);
        DiaChiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiTextActionPerformed(evt);
            }
        });

        LuongText.setEnabled(false);
        LuongText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuongTextActionPerformed(evt);
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

        QuyenLabel.setText("Quyền:");

        QuyenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        QuyenComboBox.setEnabled(false);

        ChucVuText.setEnabled(false);

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
                .addGap(50, 50, 50)
                .addComponent(TuKhoaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TuKhoaText, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DanhSachButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDTLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SDTText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNVText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(LuongLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LuongText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ChucVuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NgayVaoLamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(QuyenLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(NgayVaoLamText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(QuyenComboBox, 0, 150, Short.MAX_VALUE)
                                            .addComponent(ChucVuText))))))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(DiaChiText, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiaChiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaNVLabel)
                            .addComponent(MaNVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HoLabel)
                            .addComponent(HoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LuongText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LuongLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NgayVaoLamLabel)
                            .addComponent(NgayVaoLamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenLabel)
                    .addComponent(TenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChucVuLabel)
                    .addComponent(ChucVuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDTLabel)
                    .addComponent(SDTText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuyenLabel)
                    .addComponent(QuyenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaChiLabel)
                    .addComponent(DiaChiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemButton)
                    .addComponent(SuaButton)
                    .addComponent(XoaButton)
                    .addComponent(TuKhoaLabel)
                    .addComponent(TuKhoaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimButton)
                    .addComponent(DanhSachButton))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ChucVuLabel, DiaChiLabel, DiaChiText, HoLabel, HoText, LuongLabel, LuongText, MaNVLabel, MaNVText, NgayVaoLamLabel, NgayVaoLamText, SDTLabel, SDTText, TenLabel, TenText});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nv", "Họ", "Tên", "Điện thoại", "Địa chỉ", "Ngày vào làm", "Lương", "Chức vụ", "Quyền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaNVTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaNVTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaNVTextActionPerformed

    private void NgayVaoLamTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayVaoLamTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayVaoLamTextActionPerformed

    private void TenTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenTextActionPerformed

    private void HoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoTextActionPerformed

    private void SDTTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDTTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SDTTextActionPerformed

    private void DiaChiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiTextActionPerformed

    private void LuongTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuongTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LuongTextActionPerformed

    private void SuaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaButtonActionPerformed
        if(MaNVText.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã nhân viên!!!!","Missing information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(HoText.getText().trim().isEmpty() || TenText.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đầy đủ họ tên nhân viên!!!!","Missing information",JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhanvienDTO nv = new nhanvienDTO();
        nv.manv = MaNVText.getText();
        nv.ho = HoText.getText();
        nv.ten = TenText.getText();
        nv.sdt = SDTText.getText();
        nv.diachi = DiaChiText.getText();
        nv.ngayvaolam = NgayVaoLamText.getText();
        nv.chucvu = ChucVuText.getText();
        nv.luong = Float.valueOf(LuongText.getText());
        String quyen = QuyenComboBox.getSelectedItem().toString();
        ArrayList dsq = quyenBUS.TimKiemTheoTen(quyen);
        quyenDTO a = (quyenDTO) dsq.get(0);
        nv.maquyen = a.maquyen;
        nhanvienBUS.Sua(nv);
        JOptionPane.showMessageDialog(null, "Sửa thành công","Success",JOptionPane.INFORMATION_MESSAGE);
        ArrayList dsnv = nhanvienBUS.TimKiemTatCa();
        HienThiDS(dsnv);
    }//GEN-LAST:event_SuaButtonActionPerformed

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        ThemNhanVien a = new ThemNhanVien();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        //Refresh jTable
        a.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                ArrayList dsnv = nhanvienBUS.TimKiemTatCa();
                HienThiDS(dsnv);
            }
        });
    }//GEN-LAST:event_ThemButtonActionPerformed

    private void XoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButtonActionPerformed
        String s = MaNVText.getText();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            nhanvienBUS.Xoa(s);
            JOptionPane.showMessageDialog(null, "Xóa thành công","Success",JOptionPane.INFORMATION_MESSAGE);
            ArrayList dsnv = nhanvienBUS.TimKiemTatCa();
            HienThiDS(dsnv);
            MaNVText.setText("");
            HoText.setText("");
            TenText.setText("");
            SDTText.setText("");
            DiaChiText.setText("");
            NgayVaoLamText.setText("");
            LuongText.setText("");
            ChucVuText.setText("");
            MaNVText.enable(false);
            HoText.enable(false);
            TenText.enable(false);
            SDTText.enable(false);
            DiaChiText.enable(false);
            NgayVaoLamText.enable(false);
            LuongText.enable(false);
            ChucVuText.enable(false);
            QuyenComboBox.setEnabled(false);
            SuaButton.setEnabled(false);
            XoaButton.setEnabled(false);
        }
    }//GEN-LAST:event_XoaButtonActionPerformed

    private void TimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimButtonActionPerformed
        String tukhoa = TuKhoaText.getText();
        ArrayList dsnv = nhanvienBUS.TimKiemTheoTuKhoa(tukhoa);
        HienThiDS(dsnv);
        if(dsnv.isEmpty()){
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả!!!","Not found",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TimButtonActionPerformed

    private void DanhSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhSachButtonActionPerformed
        ArrayList dsnv = nhanvienBUS.TimKiemTatCa();
        HienThiDS(dsnv);
    }//GEN-LAST:event_DanhSachButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String manv = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 0);
        String ho = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 1);
        String ten = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 2);
        String sdt = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 3);
        String diachi = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 4);
        String ngayvaolam = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 5);
        String chucvu = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 6);
        String luong = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 7);
        String quyen = (String) modeltable.getValueAt(jTable1.getSelectedRow(), 8);
        MaNVText.setText(manv);
        HoText.setText(ho);
        TenText.setText(ten);
        SDTText.setText(sdt);
        DiaChiText.setText(diachi);
        NgayVaoLamText.setText(ngayvaolam);
        ChucVuText.setText(chucvu);
        LuongText.setText(luong);
        for (int i = 0; i< QuyenComboBox.getItemCount(); i++) {
            if(quyen.equals(QuyenComboBox.getItemAt(i)))
                QuyenComboBox.setSelectedIndex(i);
        }
        QuyenComboBox.setModel(modelcombobox1);
        MaNVText.enable();
        HoText.enable();
        TenText.enable();
        SDTText.enable();
        DiaChiText.enable();
        NgayVaoLamText.enable();
        LuongText.enable();
        ChucVuText.enable();
        QuyenComboBox.setEnabled(true);
        SuaButton.setEnabled(true);
        XoaButton.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChucVuLabel;
    private javax.swing.JTextField ChucVuText;
    private javax.swing.JButton DanhSachButton;
    private javax.swing.JLabel DiaChiLabel;
    private javax.swing.JTextField DiaChiText;
    private javax.swing.JLabel HoLabel;
    private javax.swing.JTextField HoText;
    private javax.swing.JLabel LuongLabel;
    private javax.swing.JTextField LuongText;
    private javax.swing.JLabel MaNVLabel;
    private javax.swing.JTextField MaNVText;
    private javax.swing.JLabel NgayVaoLamLabel;
    private javax.swing.JTextField NgayVaoLamText;
    private javax.swing.JComboBox<String> QuyenComboBox;
    private javax.swing.JLabel QuyenLabel;
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
