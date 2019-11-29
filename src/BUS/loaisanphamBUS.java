/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.loaisanphamDAO;
import DTO.loaisanphamDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class loaisanphamBUS {
    public static ArrayList TimKiemTatCa()
    {
        return loaisanphamDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return loaisanphamDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return loaisanphamDAO.kiemTraTonTai(s);
    }
    
    public static void Them(loaisanphamDTO s)
    {
        loaisanphamDAO.Them(s);
    }
    
    public static void Sua(loaisanphamDTO s)
    {
        loaisanphamDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        loaisanphamDAO.Xoa(s);
    }
}
