/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.quyenDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class quyenDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dsq = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM quyen";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                quyenDTO q = new quyenDTO();
                q.maquyen= rs.getString("maquyen");
                q.quyen= rs.getString("tenquyen");
                dsq.add(q);
            }
            con.close();
            return dsq;
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
            ArrayList dsq = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM quyen WHERE maquyen = '" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                quyenDTO q = new quyenDTO();
                q.maquyen= rs.getString("maquyen");
                q.quyen= rs.getString("tenquyen");
                dsq.add(q);
            }
            con.close();
            return dsq;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    
    public static ArrayList TimKiemTheoTen(String tukhoa)
    {
        try
        {
            ArrayList dsq = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM quyen WHERE tenquyen = N'" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                quyenDTO q = new quyenDTO();
                q.maquyen= rs.getString("maquyen");
                q.quyen= rs.getString("tenquyen");
                dsq.add(q);
            }
            con.close();
            return dsq;
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
            ArrayList dsq = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM quyen WHERE maquyen LIKE '%" + tukhoa +"%'"
                                            +" OR tenquyen LIKE N'%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                quyenDTO q = new quyenDTO();
                q.maquyen= rs.getString("maquyen");
                q.quyen= rs.getString("tenquyen");
                dsq.add(q);
            }
            con.close();
            return dsq;
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
    
    public static void Them(quyenDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO quyen (maquyen, tenquyen) VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.maquyen);
            pst.setString(2, s.quyen);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(quyenDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE quyen"
                       +" SET tenquyen = N'"+s.quyen+"'"
                       +" WHERE maquyen = '"+s.maquyen+"'";
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
            String sql = "DELETE FROM quyen WHERE maquyen = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
