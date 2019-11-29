/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.quyenDAO;
import DTO.quyenDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class quyenBUS {
    public static ArrayList TimKiemTatCa()
    {
        return quyenDAO.TimKiemTatCa();
    }
    
    public static ArrayList TimKiemTheoMa(String tukhoa)
    {
        return quyenDAO.TimKiemTheoMa(tukhoa);
    }
    
    public static ArrayList TimKiemTheoTen(String tukhoa)
    {
        return quyenDAO.TimKiemTheoTen(tukhoa);
    }
    
    public static ArrayList TimKiemTheoTuKhoa(String tukhoa)
    {
        return quyenDAO.TimKiemTheoTuKhoa(tukhoa);
    }
    
    public static boolean kiemTraTonTai(String s)
    {
        return quyenDAO.kiemTraTonTai(s);
    }
    
    public static void Them(quyenDTO s)
    {
        quyenDAO.Them(s);
    }
    
    public static void Sua(quyenDTO s)
    {
        quyenDAO.Sua(s);
    }
    
    public static void Xoa(String s)
    {
        quyenDAO.Xoa(s);
    }
}
