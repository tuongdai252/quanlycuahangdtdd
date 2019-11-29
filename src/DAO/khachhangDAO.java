/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.khachhangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class khachhangDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dskh = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM khachhang";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
               khachhangDTO kh = new khachhangDTO();
                kh.makh= rs.getString("makh");
                kh.ho= rs.getString("ho");
                kh.ten= rs.getString("ten");
                kh.sdt= rs.getString("sdt");
                kh.diachi= rs.getString("diachi");
                dskh.add(kh);
            }
            con.close();
            return dskh;
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
            ArrayList dskh = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM khachhang WHERE makh LIKE '%" + tukhoa +"%'"
                                            +" OR ho LIKE '%" + tukhoa + "%'"
                                            +" OR ten LIKE '%" + tukhoa + "%'"
                                            +" OR sdt LIKE '%" + tukhoa + "%'"
                                            +" OR diachi LIKE '%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
               khachhangDTO kh = new khachhangDTO();
                kh.makh= rs.getString("makh");
                kh.ho= rs.getString("ho");
                kh.ten= rs.getString("ten");
                kh.sdt= rs.getString("sdt");
                kh.diachi= rs.getString("diachi");
                dskh.add(kh);
            }
            con.close();
            return dskh;
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
    
    public static void Them(khachhangDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO khachhang (makh, ho, ten, sdt, diachi) VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.makh);
            pst.setString(2, s.ho);
            pst.setString(3, s.ten);
            pst.setString(4, s.sdt);
            pst.setString(5, s.diachi);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(khachhangDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE khachhang"
                       +" SET ho = N'"+s.ho+"',"
                            +" ten = N'"+s.ten+"',"
                            +" sdt = '"+s.sdt+"',"
                            +" diachi = N'"+s.diachi+"'"
                       +" WHERE makh = '"+s.makh+"'";
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
            String sql = "DELETE FROM khachhang WHERE makh = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
