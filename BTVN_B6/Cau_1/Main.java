package BTVN_B6.Cau_1;

import static BTVN_B6.Cau_1.TimChuoi.sc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    static ArrayList<TimChuoi> timKiem = new ArrayList<>() ;
    
    public static void main(String[] args) 
    {
        do
        {
            System.out.println("DANH SACH CAC LUA CHON") ;
            System.out.println("1- Nhap vap chuoi") ;
            System.out.println("2- Hien thi chuoi vua nhap") ;
            System.out.println("3- Dua ra chuoi can tim kiem") ;
            
            int choese = sc.nextInt() ;
            sc.nextLine() ;
            switch ( choese )
            {
                case 1:
                    nhap() ;
                    break ;
                case 2: 
                    System.out.println("chuoi vua nhap la: ") ;
                    xuat() ;
                    break ;
                case 3:
                    System.out.println("Cac chuoi thoa man la: ") ;
                    timKiemChuoi() ;
                    break ;
            }
        }
        while ( true ) ;                    
    }
    
    private static void nhap()
    {
        TimChuoi newTimChuoi = new TimChuoi() ;
        newTimChuoi.input() ;
        timKiem.add(newTimChuoi) ;       
    }

    private static void title()
    {
        System.out.printf("%15s \n" , "Ho ten") ;
    }

    public static boolean listEmpty()
    {
        if ( timKiem.size() != 0 ) return true ;
        else return false ;
    }

    private static void xuat() 
    {
        if (listEmpty())
        {
            title() ;
            for ( int i = 0 ; i < timKiem.size() ; i++ )
            {
                timKiem.get( i ).output() ;
            }
        }
        else
        {
            System.out.println("Khong co chuoi ten nao duoc thanh lap!") ;
        }
    }

    private static void timKiemChuoi()
    {
        if(listEmpty())
        {
            System.out.println("Nhap vao chuoi muon tim: ") ;
            String chuoi = new Scanner(System.in).nextLine() ;
            
            int dem = 0 ;
            for ( int i = 0 ; i < timKiem.size() ; i++ )
            {
                if ( timKiem.get( i ).getHoTen().equals( chuoi ) )
                {
                    dem++ ;
                    title() ;
                    timKiem.get( i ).output() ;
                    break ;
                } 
            }
        }
        else
        {
            System.out.println("Chua co chuoi nao duoc thanh lap!") ;
        }
    }
        
        
}
    

