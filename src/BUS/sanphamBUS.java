/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.sanphamDAO;
import DTO.sanphamDTO;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class sanphamBUS {
    public static ArrayList TimKiemTatCa()
    {
        return sanphamDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return sanphamDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return sanphamDAO.kiemTraTonTai(s);
    }
    
    public static void Them(sanphamDTO s)
    {
        sanphamDAO.Them(s);
    }
    
    public static void Sua(sanphamDTO s)
    {
        sanphamDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        sanphamDAO.Xoa(s);
    }
}
