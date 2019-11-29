/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.sanphamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class sanphamDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dssp = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM sanpham";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                sanphamDTO sp = new sanphamDTO();
                sp.masp= rs.getString("masp");
                sp.tensp= rs.getString("tensp");
                sp.maloai= rs.getString("maloai");
                sp.mancc= rs.getString("mancc");
                sp.hinhanh= rs.getString("hinhanh");
                sp.soluong = rs.getInt("soluong");
                sp.gia = rs.getFloat("gia");
                dssp.add(sp);
            }
            con.close();
            return dssp;
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
            ArrayList dssp = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM sanpham WHERE masp LIKE '%" + tukhoa +"%'"
                                            +" OR tensp LIKE N'%" + tukhoa + "%'"
                                            +" OR gia LIKE '%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                sanphamDTO sp = new sanphamDTO();
                sp.masp= rs.getString("masp");
                sp.tensp= rs.getString("tensp");
                sp.maloai= rs.getString("maloai");
                sp.mancc= rs.getString("mancc");
                sp.hinhanh= rs.getString("hinhanh");
                sp.soluong = rs.getInt("soluong");
                sp.gia = rs.getFloat("gia");
                dssp.add(sp);
            }
            con.close();
            return dssp;
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
    
    public static void Them(sanphamDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO sanpham (masp, tensp, maloai, mancc, hinhanh, soluong, gia) VALUES(N'"+s.masp+"', N'"+s.tensp+"', N'"+s.maloai+"', N'"+s.mancc+"', N'"+s.hinhanh+"', "+s.soluong+", "+s.gia+")";
            PreparedStatement pst = con.prepareStatement(sql);

            /*pst.setString(1, "N'"+s.masp+"'");
            pst.setString(2, "N'"+s.tensp+"'");
            pst.setString(3, "N'"+s.maloai+"'");
            pst.setString(4, "N'"+s.mancc+"'");
            pst.setString(5, "N'"+s.hinhanh+"'");
            pst.setInt(6, s.soluong);
            pst.setFloat(7, s.gia);*/
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(sanphamDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE sanpham"
                       +" SET tensp = N'"+s.tensp+"',"
                            +" maloai = N'"+s.maloai+"',"
                            +" mancc = N'"+s.mancc+"',"
                            +" hinhanh = N'"+s.hinhanh+"',"
                            +" gia = '"+s.gia+"',"
                            +" soluong = '"+s.soluong+"'"
                       +" WHERE masp = N'"+s.masp+"'";
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
            String sql = "DELETE FROM sanpham WHERE masp = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
