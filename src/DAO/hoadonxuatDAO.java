/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.hoadonxuatDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class hoadonxuatDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM hoadonxuat";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                hoadonxuatDTO hd = new hoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.makh= rs.getString("makh");
                hd.manv= rs.getString("manv");
                hd.ngayhd= rs.getString("ngayhd");
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
            
            String sql= "SELECT * FROM hoadonxuat WHERE mahdx LIKE '%" + tukhoa +"%'"
                                            +" OR makh LIKE '%" + tukhoa + "%'"
                                            +" OR manv LIKE '%" + tukhoa + "%'"
                                            +" OR tongtien LIKE '%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                hoadonxuatDTO hd = new hoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.makh= rs.getString("makh");
                hd.manv= rs.getString("manv");
                hd.ngayhd= rs.getString("ngayhd");
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
            
            String sql= "SELECT * FROM hoadonxuat WHERE ngayhd = '" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                hoadonxuatDTO hd = new hoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.makh= rs.getString("makh");
                hd.manv= rs.getString("manv");
                hd.ngayhd= rs.getString("ngayhd");
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
            
            String sql= "SELECT * FROM hoadonxuat WHERE ngayhd LIKE '%" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                hoadonxuatDTO hd = new hoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.makh= rs.getString("makh");
                hd.manv= rs.getString("manv");
                hd.ngayhd= rs.getString("ngayhd");
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
    
    public static void Them(hoadonxuatDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO hoadonxuat (mahdx, makh, manv, ngayhd, tongtien) VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.mahdx);
            pst.setString(2, s.makh);
            pst.setString(3, s.manv);
            pst.setString(4, s.ngayhd);
            pst.setFloat(5, s.tongtien);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(hoadonxuatDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE hoadonxuat"
                       +" SET makh = N'"+s.makh+"',"
                            +" manv = '"+s.manv+"',"
                            +" ngayhd = '"+s.ngayhd+"',"
                            +" tongtien = N'"+s.tongtien+"'"
                       +" WHERE mahdx = '"+s.mahdx+"'";
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
            String sql = "DELETE FROM hoadonxuat WHERE mahdx = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
