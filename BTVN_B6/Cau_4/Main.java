package BTVN_B6.Cau_4;

import static BTVN_B6.Cau_2.LopHoc.sc;
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    static ArrayList<Nguoi> nguoi = new ArrayList<>() ;
    
    public static void main(String[] args) 
    {
       do
       {
           System.out.println("DANH SACH LUA CHON") ;
           System.out.println("1- Them can bo giao vien") ;
           System.out.println("2- Hien thi danh sach can bo giao vien");
           System.out.println("3- Xoa can bo giao vien") ;
           System.out.println("4- Ket thuc chuong trinh") ;
           System.out.println("Moi nhap lua chon: ") ;
           
           int choese = sc.nextInt() ;
           sc.nextLine() ;
           switch ( choese )
           {
                case 1:
                    nhap() ;
                    break ;
                case 2:
                    xuat();
                    break ;
                case 3:
                    xoaCB() ;
                    break ;
                case 4:
                    System.out.println("Ket thuc chuong trinh!") ;
                    System.exit( 0 ) ;
                default:
                    System.out.println("Khong co lua chon nhu vay!") ;
                   
           }
       }
       while ( true ) ;
        
    }

    private static void nhap() 
    {
        Nguoi newNguoi = new Nguoi() ;
        newNguoi.input() ;
        nguoi.add(newNguoi) ;
    }
    
    private static void title()
    {
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %20s \n" , "Ho ten" , "Tuoi" , "Que quan" , "Ma so GV" , "Luong cung" , "Luong thuong" , "Luong phat" , "Luong thuc linh") ;
    }
    
    private static boolean listEmpty()
    {
        if ( nguoi.size() != 0 ) return true ;
        else return false ;
    }

    private static void xuat() 
    {
        if ( listEmpty() )
        {
            title() ;
            for ( int i = 0 ; i < nguoi.size() ; i++ )
            {
                nguoi.get(i).output() ;
            }
        }
        else
        {
            System.out.println("Chua co can bo giao vien nao!") ;
        }
    }

    private static void xoaCB() 
    {
        if( listEmpty() )
        {
            System.out.println(" Nhập vào so BD : ");
            String masoGV = new Scanner(System.in).nextLine() ;

            title();
            for ( int i = 0 ; i < nguoi.size() ; i++ ) 
            {
                if( nguoi.get(i).getMaSoGV().compareTo(masoGV) == 0 )
                {
                    nguoi.remove( i ) ;
                }
            }
        }
        else
        {
            System.out.println("Chua co can bo giao vien nao!") ;
        }
    
    }
}