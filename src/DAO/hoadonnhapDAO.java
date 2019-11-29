/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.hoadonnhapDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class hoadonnhapDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM hoadonnhap";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                hoadonnhapDTO hd = new hoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
                hd.mancc= rs.getString("mancc");
                hd.manv= rs.getString("manv");
                hd.ngaynhap= rs.getString("ngaynhap");
                hd.tongtien= Float.valueOf(rs.getString("tongtien"));
                dshd.add(hd);
            }
            con.close();
            return dshd;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM hoadonnhap WHERE mahdn LIKE '%" + tukhoa +"%'"
                                            +" OR mancc LIKE '%" + tukhoa + "%'"
                                            +" OR manv LIKE '%" + tukhoa + "%'"
                                            +" OR tongtien LIKE '%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                hoadonnhapDTO hd = new hoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
                hd.mancc= rs.getString("mancc");
                hd.manv= rs.getString("manv");
                hd.ngaynhap= rs.getString("ngaynhap");
                hd.tongtien= Float.valueOf(rs.getString("tongtien"));
                dshd.add(hd);
            }
            con.close();
            return dshd;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    
    public static ArrayList TimKiemTheoNgay(String tukhoa)
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM hoadonnhap WHERE ngaynhap = '" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                hoadonnhapDTO hd = new hoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
                hd.mancc= rs.getString("mancc");
                hd.manv= rs.getString("manv");
                hd.ngaynhap= rs.getString("ngaynhap");
                hd.tongtien= Float.valueOf(rs.getString("tongtien"));
                dshd.add(hd);
            }
            con.close();
            return dshd;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    
    public static ArrayList TimKiemTheoThang(String tukhoa)
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM hoadonnhap WHERE ngaynhap LIKE '%" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                hoadonnhapDTO hd = new hoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
                hd.mancc= rs.getString("mancc");
                hd.manv= rs.getString("manv");
                hd.ngaynhap= rs.getString("ngaynhap");
                hd.tongtien= Float.valueOf(rs.getString("tongtien"));
                dshd.add(hd);
            }
            con.close();
            return dshd;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        ArrayList a= TimKiemTheoTuKhoa(s);
        if(a.size()>0)
            return true;
        return false;
    }
    
    public static void Them(hoadonnhapDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO hoadonnhap (mahdn, mancc, ngaynhap, manv, tongtien) VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.mahdn);
            pst.setString(2, s.mancc);
            pst.setString(3, s.ngaynhap);
            pst.setString(4, s.manv);
            pst.setFloat(5, s.tongtien);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(hoadonnhapDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE hoadonnhap"
                       +" SET mancc = N'"+s.mancc+"',"
                            +" manv = '"+s.manv+"',"
                            +" ngaynhap = '"+s.ngaynhap+"',"
                            +" tongtien = N'"+s.tongtien+"'"
                       +" WHERE mahdn = '"+s.mahdn+"'";
            PreparedStatement pst = con.prepareStatement(sql);

            /*pst.setString(1, s.ho);
            pst.setString(2, s.ten);
            pst.setString(3, s.sdt);
            pst.setString(4, s.ngaymua);
            pst.setString(5, s.diachi);
            pst.setString(6, s.makh);*/
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Xoa(String s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "DELETE FROM hoadonnhap WHERE mahdn = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
