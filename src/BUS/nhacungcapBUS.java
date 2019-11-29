/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.nhacungcapDAO;
import DTO.nhacungcapDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class nhacungcapBUS {
    public static ArrayList TimKiemTatCa()
    {
        return nhacungcapDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTen(String tukhoa)
    {
        return nhacungcapDAO.TimKiemTheoTen(tukhoa);
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return nhacungcapDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return nhacungcapDAO.kiemTraTonTai(s);
    }
    
    public static void Them(nhacungcapDTO s)
    {
        nhacungcapDAO.Them(s);
    }
    
    public static void Sua(nhacungcapDTO s)
    {
        nhacungcapDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        nhacungcapDAO.Xoa(s);
    }
}
