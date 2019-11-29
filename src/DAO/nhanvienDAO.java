/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.nhanvienDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class nhanvienDAO {
    public static ArrayList TimKiemTatCa()
    {
        try
        {
            ArrayList dsnv = new ArrayList();
            Connection con = ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM nhanvien";
            Statement st= con.createStatement();

            ResultSet rs= st.executeQuery(sql);

           
            while(rs.next())
            {
                nhanvienDTO nv = new nhanvienDTO();
                nv.manv= rs.getString("manv");
                nv.ho= rs.getString("ho");
                nv.ten= rs.getString("ten");
                nv.sdt= rs.getString("sdt");
                nv.diachi= rs.getString("diachi");
                nv.ngayvaolam= rs.getString("ngayvaolam");
                nv.chucvu= rs.getString("chucvu");
                nv.maquyen= rs.getString("maquyen");
                nv.luong= rs.getFloat("luong");
                dsnv.add(nv);
            }
            con.close();
            return dsnv;
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
            ArrayList dsnv = new ArrayList();
            Connection con =ConnectionProvider.Connect();
            
            String sql= "SELECT * FROM nhanvien WHERE manv LIKE '%" + tukhoa +"%'"
                                            +" OR ho LIKE '%" + tukhoa + "%'"
                                            +" OR ten LIKE '%" + tukhoa + "%'"
                                            +" OR sdt LIKE '%" + tukhoa + "%'"
                                            +" OR diachi LIKE '%" + tukhoa + "%'"
                                            +" OR ngayvaolam LIKE '%" + tukhoa + "%'"
                                            +" OR chucvu LIKE '%" + tukhoa + "%'"
                                            +" OR luong LIKE '%" + tukhoa + "%'";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while(rs.next())
            {
                nhanvienDTO nv = new nhanvienDTO();
                nv.manv= rs.getString("manv");
                nv.ho= rs.getString("ho");
                nv.ten= rs.getString("ten");
                nv.sdt= rs.getString("sdt");
                nv.diachi= rs.getString("diachi");
                nv.ngayvaolam= rs.getString("ngayvaolam");
                nv.chucvu= rs.getString("chucvu");
                nv.maquyen= rs.getString("maquyen");
                nv.luong= rs.getFloat("luong");
                dsnv.add(nv);
            }
            con.close();
            return dsnv;
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
    
    public static void Them(nhanvienDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "INSERT INTO nhanvien (manv, ho, ten, sdt, diachi, ngayvaolam, chucvu, taikhoan, matkhau, luong, maquyen) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, s.manv);
            pst.setString(2, s.ho);
            pst.setString(3, s.ten);
            pst.setString(4, s.sdt);
            pst.setString(5, s.diachi);
            pst.setString(6, s.ngayvaolam);
            pst.setString(7, s.chucvu);
            pst.setString(8, s.taikhoan);
            pst.setString(9, s.matkhau);
            pst.setFloat(10, s.luong);
            pst.setString(11, s.maquyen);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
    
    public static void Sua(nhanvienDTO s)
    {
         try
         {
            Connection con = ConnectionProvider.Connect();
            String sql = "UPDATE nhanvien"
                       +" SET ho = N'"+s.ho+"',"
                            +" ten = N'"+s.ten+"',"
                            +" sdt = '"+s.sdt+"',"
                            +" diachi = N'"+s.diachi+"',"
                            +" ngayvaolam = '"+s.ngayvaolam+"',"
                            +" chucvu = N'"+s.chucvu+"',"
                            +" luong = '"+s.luong+"',"
                            +" maquyen = '"+s.maquyen+"'"
                       +" WHERE manv = '"+s.manv+"'";
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
            String sql = "DELETE FROM nhanvien WHERE manv = '"+s+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, s);
            pst.executeUpdate();
            con.close();
        }
        catch (Exception ex){
                
        }
    }
}
