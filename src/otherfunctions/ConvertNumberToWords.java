/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otherfunctions;

/**
 *
 * @author ASUS
 */
public class ConvertNumberToWords {
    private static final String[] so = {
        "không",
        "một",
        "hai",
        "ba",
        "bốn",
        "năm",
        "sáu",
        "bảy",
        "tám",
        "chín",
        "mười",
        "mười một",
        "mười hai",
        "mười ba",
        "mười bốn",
        "mười lăm",
        "mười sáu",
        "mười bảy",
        "mười tám",
        "mười chín",
    };
    
    private static final String[] sodv = {
        "",
        "mốt",
        "hai",
        "ba",
        "bốn",
        "lăm",
        "sáu",
        "bảy",
        "tám",
        "chín"
    };
    
    private static final String[] donvi = {
        " lẻ",
        " mươi",
        " trăm",
        " nghìn",
        " triệu"
    };
    
    public static String NumToWords(int x)
    {
        if(x<20)
            return so[x];
        else if(x<100)
            return so[x/10] + donvi[1] + ((x%10>0) ? (" " + sodv[x%10]) : "");
        else if(x<1000)
            return so[x/100] + donvi[2]+ ((x%100>9) ? (" " + NumToWords(x%100)) : ((x%100>0) ? (""+donvi[0]+" "+so[x%100]) : ""));
        else if(x<1000000)
            return NumToWords(x/1000) + donvi[3] + ((x%1000!=0 && x%1000<100) ? " "+so[0]+donvi[2] : "") + ((x%1000>9) ? (" "+NumToWords(x%1000)) : ((x%1000>0) ? (""+donvi[0]+" "+so[x%1000]) : "")) ;
        return NumToWords(x/1000000) + donvi[4] + ((x%1000000!=0 && x%1000000<100000) ? " "+so[0]+donvi[2] : "") + ((x%1000000!=0 && x%1000000<100) ? " "+so[0]+donvi[2] : "") + ((x%1000000>9) ? (" "+NumToWords(x%1000000)) : ((x%1000000>0) ? (""+donvi[0]+" "+so[x%1000]) : "")) ;
    }
}
