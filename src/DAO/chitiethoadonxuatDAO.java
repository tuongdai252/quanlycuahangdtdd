/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.chitiethoadonxuatDTO;
import otherfunctions.ConvertNumberToWords;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class chitiethoadonxuatDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM chitiethoadonxuat";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                chitiethoadonxuatDTO hd = new chitiethoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.masp= rs.getString("masp");
                hd.soluong= Integer.valueOf(rs.getString("soluong"));
                hd.dongia= Float.valueOf(rs.getString("dongia"));
                hd.thanhtien= rs.getString("thanhtien");
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
    
    public static ArrayList TimKiemTheoMa(String tukhoa)
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM chitiethoadonxuat WHERE mahdx LIKE '%" + tukhoa +"%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                chitiethoadonxuatDTO hd = new chitiethoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.masp= rs.getString("masp");
                hd.soluong= Integer.valueOf(rs.getString("soluong"));
                hd.dongia= Float.valueOf(rs.getString("dongia"));
                hd.thanhtien= rs.getString("thanhtien");
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
            
            String sql= "SELECT * FROM chitiethoadonxuat as ct " +
                        "JOIN hoadonxuat as hd ON ct.mahdx = hd.mahdx " +
                        "WHERE hd.ngayhd = '" + tukhoa + "'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                chitiethoadonxuatDTO hd = new chitiethoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.masp= rs.getString("masp");
                hd.soluong= Integer.valueOf(rs.getString("soluong"));
                hd.dongia= Float.valueOf(rs.getString("dongia"));
                hd.thanhtien= rs.getString("thanhtien");
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
            
            String sql= "SELECT * FROM chitiethoadonxuat as ct " +
                        "JOIN hoadonxuat as hd ON ct.mahdx = hd.mahdx " +
                        "WHERE hd.ngayhd LIKE '%" + tukhoa + "'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                chitiethoadonxuatDTO hd = new chitiethoadonxuatDTO();
                hd.mahdx= rs.getString("mahdx");
                hd.masp= rs.getString("masp");
                hd.soluong= Integer.valueOf(rs.getString("soluong"));
                hd.dongia= Float.valueOf(rs.getString("dongia"));
                hd.thanhtien= rs.getString("thanhtien");
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
        ArrayList a= TimKiemTheoMa(s);
        if(a.size()>0)
            return true;
        return false;
    }
    
    public static void Them(chitiethoadonxuatDTO s)
    {
        int tongtien = (int)s.dongia * s.soluong;
        ConvertNumberToWords c = new ConvertNumberToWords();
        String thanhtien = c.NumToWords(tongtien);
        try
        {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO chitiethoadonxuat (mahdx, masp, soluong, dongia, thanhtien) VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.mahdx);
            pst.setString(2, s.masp);
            pst.setInt(3, s.soluong);
            pst.setFloat(4, s.dongia);
            pst.setString(5, thanhtien);
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
            String sql = "DELETE FROM chitiethoadonxuat WHERE mahdx = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
