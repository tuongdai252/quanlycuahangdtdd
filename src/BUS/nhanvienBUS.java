/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.nhanvienDAO;
import DTO.nhanvienDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class nhanvienBUS {
    public static ArrayList TimKiemTatCa()
    {
        return nhanvienDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return nhanvienDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return nhanvienDAO.kiemTraTonTai(s);
    }
    
    public static void Them(nhanvienDTO s)
    {
        nhanvienDAO.Them(s);
    }
    
    public static void Sua(nhanvienDTO s)
    {
        nhanvienDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        nhanvienDAO.Xoa(s);
    }
}
