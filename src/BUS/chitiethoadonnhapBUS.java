/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.chitiethoadonnhapDAO;
import DTO.chitiethoadonnhapDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class chitiethoadonnhapBUS {
    public static ArrayList TimKiemTatCa()
    {
        return chitiethoadonnhapDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoMa(String tukhoa)
    {
        return chitiethoadonnhapDAO.TimKiemTheoMa(tukhoa);
    }
    
    public static ArrayList TimKiemTheoNgay(String tukhoa)
    {
        return chitiethoadonnhapDAO.TimKiemTheoNgay(tukhoa);
    }
    
    public static ArrayList TimKiemTheoThang(String tukhoa)
    {
        return chitiethoadonnhapDAO.TimKiemTheoThang(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return chitiethoadonnhapDAO.kiemTraTonTai(s);
    }
    
    public static void Them(chitiethoadonnhapDTO s)
    {
        chitiethoadonnhapDAO.Them(s);
    }
    
    public static void Xoa(String s)
    {
        chitiethoadonnhapDAO.Xoa(s);
    }
}
