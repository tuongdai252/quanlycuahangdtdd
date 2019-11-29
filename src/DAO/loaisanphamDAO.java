/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.loaisanphamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class loaisanphamDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dsl = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM loaisanpham";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                loaisanphamDTO l = new loaisanphamDTO();
                l.maloai= rs.getString("maloai");
                l.tenloai= rs.getString("tenloai");
                dsl.add(l);
            }
            con.close();
            return dsl;
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
            ArrayList dsl = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM loaisanpham WHERE maloai LIKE '%" + tukhoa +"%'"
                                            +" OR tenloai LIKE N'%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                loaisanphamDTO l = new loaisanphamDTO();
                l.maloai= rs.getString("maloai");
                l.tenloai= rs.getString("tenloai");
                dsl.add(l);
            }
            con.close();
            return dsl;
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
    
    public static void Them(loaisanphamDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO loaisanpham (maloai, tenloai) VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.maloai);
            pst.setString(2, s.tenloai);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(loaisanphamDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE loaisanpham"
                       +" SET tenloai = N'"+s.tenloai+"'"
                       +" WHERE maloai = '"+s.maloai+"'";
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
            String sql = "DELETE FROM loaisanpham WHERE maloai = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
