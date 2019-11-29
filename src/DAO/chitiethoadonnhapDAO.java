/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.chitiethoadonnhapDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import otherfunctions.ConvertNumberToWords;

/**
 *
 * @author ASUS
 */
public class chitiethoadonnhapDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dshd = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM chitiethoadonnhap";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                chitiethoadonnhapDTO hd = new chitiethoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
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
            
            String sql= "SELECT * FROM chitiethoadonnhap WHERE mahdn LIKE '%" + tukhoa +"%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                chitiethoadonnhapDTO hd = new chitiethoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
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
            
            String sql= "SELECT * FROM chitiethoadonnhap as ct " +
                        "JOIN hoadonnhap as hd ON ct.mahdn = hd.mahdn " +
                        "WHERE hd.ngaynhap = '" + tukhoa + "'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                chitiethoadonnhapDTO hd = new chitiethoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
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
            
            String sql= "SELECT * FROM chitiethoadonnhap as ct " +
                        "JOIN hoadonnhap as hd ON ct.mahdn = hd.mahdn " +
                        "WHERE hd.ngaynhap LIKE '%" + tukhoa + "'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                chitiethoadonnhapDTO hd = new chitiethoadonnhapDTO();
                hd.mahdn= rs.getString("mahdn");
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
    
    public static void Them(chitiethoadonnhapDTO s)
    {
        int tongtien = (int)s.dongia * s.soluong;
        ConvertNumberToWords c = new ConvertNumberToWords();
        String thanhtien = c.NumToWords(tongtien);
        try
        {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO chitiethoadonnhap (mahdn, masp, soluong, dongia, thanhtien) VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.mahdn);
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
            String sql = "DELETE FROM chitiethoadonnhap WHERE mahdn = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
