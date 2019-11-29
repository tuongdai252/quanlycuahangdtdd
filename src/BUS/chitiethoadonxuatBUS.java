/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.chitiethoadonxuatDAO;
import DTO.chitiethoadonxuatDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class chitiethoadonxuatBUS {
    public static ArrayList TimKiemTatCa()
    {
        return chitiethoadonxuatDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoMa(String tukhoa)
    {
        return chitiethoadonxuatDAO.TimKiemTheoMa(tukhoa);
    }
    
    public static ArrayList TimKiemTheoNgay(String tukhoa)
    {
        return chitiethoadonxuatDAO.TimKiemTheoNgay(tukhoa);
    }
    
    public static ArrayList TimKiemTheoThang(String tukhoa)
    {
        return chitiethoadonxuatDAO.TimKiemTheoThang(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return chitiethoadonxuatDAO.kiemTraTonTai(s);
    }
    
    public static void Them(chitiethoadonxuatDTO s)
    {
        chitiethoadonxuatDAO.Them(s);
    }
    
    public static void Xoa(String s)
    {
        chitiethoadonxuatDAO.Xoa(s);
    }
}
