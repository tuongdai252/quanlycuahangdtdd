/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.hoadonnhapDAO;
import DTO.hoadonnhapDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class hoadonnhapBUS {
    public static ArrayList TimKiemTatCa()
    {
        return hoadonnhapDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return hoadonnhapDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static ArrayList TimKiemTheoNgay(String tukhoa)
    {
        return hoadonnhapDAO.TimKiemTheoNgay(tukhoa);
    }
    
    public static ArrayList TimKiemTheoThang(String tukhoa)
    {
        return hoadonnhapDAO.TimKiemTheoThang(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return hoadonnhapDAO.kiemTraTonTai(s);
    }
    
    public static void Them(hoadonnhapDTO s)
    {
        hoadonnhapDAO.Them(s);
    }
    
    public static void Sua(hoadonnhapDTO s)
    {
        hoadonnhapDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        hoadonnhapDAO.Xoa(s);
    }
}
