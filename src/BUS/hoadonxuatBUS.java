/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.hoadonxuatDAO;
import DTO.hoadonxuatDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class hoadonxuatBUS {
    public static ArrayList TimKiemTatCa()
    {
        return hoadonxuatDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return hoadonxuatDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static ArrayList TimKiemTheoNgay(String tukhoa)
    {
        return hoadonxuatDAO.TimKiemTheoNgay(tukhoa);
    }
    
    public static ArrayList TimKiemTheoThang(String tukhoa)
    {
        return hoadonxuatDAO.TimKiemTheoThang(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return hoadonxuatDAO.kiemTraTonTai(s);
    }
    
    public static void Them(hoadonxuatDTO s)
    {
        hoadonxuatDAO.Them(s);
    }
    
    public static void Sua(hoadonxuatDTO s)
    {
        hoadonxuatDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        hoadonxuatDAO.Xoa(s);
    }
}
