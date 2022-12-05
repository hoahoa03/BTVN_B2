package BTVN_B6.Cau_2;

import static BTVN_B6.Cau_2.LopHoc.sc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    static ArrayList<LopHoc> lopHoc = new ArrayList<>() ;
    
    public static void main(String[] args) 
    {
        do
        {
            System.out.println("DANH SACH CAC LUA CHON") ;
            System.out.println("1- Them moi thi sinh") ;
            System.out.println("2- Hien thi thong tin thi sinh va khoi thi") ;
            System.out.println("3- Tim kiem theo so bao danh") ;
            System.out.println("4- Ket thuc chuong trinh!") ;
            System.out.println("Moi nhap lua chon: ") ;
            
            int choese = sc.nextInt() ;
            sc.nextLine() ;
            
            switch ( choese )
            {
                case 1: 
                    nhap() ;
                    break ;
                case 2: 
                    xuat() ;
                    break ;
                case 3:
                    timKiemSoBD() ;
                    break ;
                case 4:
                    System.out.println("Ket thuc chuong trinh!") ;
                    System.exit( 0 ) ;
                default:
                    System.out.println("Lua chon khong co trong danh sach!") ;
            }
        }
        while (true) ;
        
    }
    
    private static void nhap()
    {
       LopHoc newLopHoc = new LopHoc() ; 
       newLopHoc.input() ;
       lopHoc.add( newLopHoc );
    }

    private static void title()
    {
        System.out.printf("%15s %15s %15s %15s %15s \n" , "So bao danh" , "Ho ten" , "Dia chi" , "Muc uu tien" , "Khoi") ;
    }
    
    private static boolean listEmpty()
    {
        if ( lopHoc.size() != 0 ) return true ;
        else return false ;
        
    }
    
    private static void xuat() 
    {
        if ( listEmpty() )
        {
            title() ;
            for ( int i = 0 ; i < lopHoc.size() ; i++ )
            {
                lopHoc.get(i).output() ;
            }
        }
        else
        {
            System.out.println("Chua co thi sinh nao!") ;
        }
    }

    private static void timKiemSoBD() 
    {
        if( listEmpty() )
        {
            System.out.println(" Nhập vào so BD : ");
            String soBD = new Scanner(System.in).nextLine() ;

            for ( int i = 0 ; i < lopHoc.size() ; i++ ) 
            {
                if (lopHoc.get( i ).getSoBD().equals(soBD)) 
                {
                    title();
                    lopHoc.get(i).output() ;
                    break;
                }
            }
        } 
        else 
        {
            System.out.println("Chua co thi sinh naoo!") ; 
        }
    }
    
    
    
    
}
