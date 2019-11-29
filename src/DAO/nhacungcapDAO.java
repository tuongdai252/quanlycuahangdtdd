/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.nhacungcapDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class nhacungcapDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dsncc = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM nhacungcap";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                nhacungcapDTO ncc = new nhacungcapDTO();
                ncc.mancc= rs.getString("mancc");
                ncc.tenncc= rs.getString("tenncc");
                ncc.sdt= rs.getString("sdt");
                ncc.diachi= rs.getString("diachi");
                dsncc.add(ncc);
            }
            con.close();
            return dsncc;
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
            ArrayList dsncc = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM nhacungcap WHERE tenncc = N'" + tukhoa +"'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                nhacungcapDTO ncc = new nhacungcapDTO();
                ncc.mancc= rs.getString("mancc");
                ncc.tenncc= rs.getString("tenncc");
                ncc.sdt= rs.getString("sdt");
                ncc.diachi= rs.getString("diachi");
                dsncc.add(ncc);
            }
            con.close();
            return dsncc;
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
            ArrayList dsncc = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM nhacungcap WHERE mancc LIKE '%" + tukhoa +"%'"
                                            +" OR tenncc LIKE '%" + tukhoa + "%'"
                                            +" OR sdt LIKE '%" + tukhoa + "%'"
                                            +" OR diachi LIKE '%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                nhacungcapDTO ncc = new nhacungcapDTO();
                ncc.mancc= rs.getString("mancc");
                ncc.tenncc= rs.getString("tenncc");
                ncc.sdt= rs.getString("sdt");
                ncc.diachi= rs.getString("diachi");
                dsncc.add(ncc);
            }
            con.close();
            return dsncc;
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
    
    public static void Them(nhacungcapDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO nhacungcap (mancc, tenncc, sdt, diachi) VALUES(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.mancc);
            pst.setString(2, s.tenncc);
            pst.setString(3, s.sdt);
            pst.setString(4, s.diachi);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(nhacungcapDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE nhacungcap"
                       +" SET tenncc = N'"+s.tenncc+"',"
                            +" sdt = '"+s.sdt+"',"
                            +" diachi = N'"+s.diachi+"'"
                       +" WHERE mancc = '"+s.mancc+"'";
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
            String sql = "DELETE FROM nhacungcap WHERE mancc = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
