/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DTO.*;
import DAO.*;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class khachhangBUS {
    public static ArrayList TimKiemTatCa()
    {
        return khachhangDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return khachhangDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return khachhangDAO.kiemTraTonTai(s);
    }
    
    public static void Them(khachhangDTO s)
    {
        khachhangDAO.Them(s);
    }
    
    public static void Sua(khachhangDTO s)
    {
        khachhangDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        khachhangDAO.Xoa(s);
    }
}
