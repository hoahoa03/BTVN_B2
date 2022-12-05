package BTVN_B6.Cau_3;

import static BTVN_B6.Cau_3.HocSinh.sc;
import java.util.ArrayList;

public class Main 
{
    static ArrayList<HocSinh> hocSinh = new ArrayList<>() ;
    
    public static void main(String[] args) 
    {
        do
        {
            System.out.println("DANH SACH CAC LUA CHON") ;
            System.out.println("1- Them hoc sinh moi") ;
            System.out.println("2- Xuat ra thong tin cac hoc sinh") ;
            System.out.println("3- Hien thi cac hoc sinh 20 tuoi") ;
            System.out.println("4- Cho biet so luong cac hoc sinh co tuoi la 23 va o DN") ;
            System.out.println("5- Sap xep hoc sinh tang dan theo que quan") ;
            System.out.println("6- Ket thuc lua chon") ;
            System.out.println("Moi nhap lua chon cua ban: ") ;
            
            int choese = sc.nextInt() ;
            sc.nextLine() ;
            switch ( choese )
            {
                case 1:
                    System.out.println("Nhap vao thong tin hoc sinh: " ) ;
                    nhap() ;
                    break ;
                case 2:
                    System.out.println("Thong tin hoc sinh nhu sau: ") ;
                    xuat() ;
                    break ;
                case 3: 
                    System.out.println("Danh sach hoc sinh 20 tuoi: ") ;
                    dsHS20() ;
                    break ;
                case 4:
                    hsDN() ;
                    break ;
                case 5:
                    System.out.println("Sap xep hoc sinh theo chieu tang dan que quan") ;
                    sapXep() ;
                    break ;
                case 6:
                    System.out.println("Ket thuc chuong trinh") ;
                    System.exit( 0 ) ;
                    break ;
                default:
                    System.out.println("LUA CHON KHONG DUOC CHAP NHAN") ;
                    break ;
            }
            
        }
        while ( true ) ;      
        
    }

    private static void nhap() 
    {
        HocSinh newHocSinh = new HocSinh() ;
        newHocSinh.input() ;
        hocSinh.add(newHocSinh) ;
    }

    private static void xuat() 
    {
//        System.out.println(hocSinh) ;
        if ( listEmpty() )
        {
            title() ;
            for( int i = 0 ; i <hocSinh.size() ; i++ )
            {           
                hocSinh.get( i ).output();
            }
        }
        else
        {
            System.out.println("Chua co hoc sinh nao!") ;
        }
        
    }
    
    private static void title()
    {
        System.out.printf("%15s %15s %15s %15s %15s \n" , "Ho Ten" , "Tuoi" , "Que Quan" , "Ma Lop" , "Ten Lop") ;
    }

    private static void dsHS20()
    {
        if ( listEmpty() )
        {
            int dem = 0 ;
            for ( int i = 0 ; i < hocSinh.size() ; i++ )
            {
                if ( hocSinh.get( i ).getTuoi() == 20 )
                {
                    title() ;
                    hocSinh.get( i ).output() ;
                    dem++ ;
                }
            }
            if ( dem == 0 )
            {
                System.out.println("Khong co hs 20 tuoi!") ;
            }
        }
        else
        {
            System.out.println("Chua co hoc sinh nao!") ;
        }
        
    }

    private static void hsDN() 
    {
        if ( listEmpty() )
        {
            int dem = 0 ;
            for ( int i = 0 ; i < hocSinh.size() ; i++ )
            {
                if ( hocSinh.get( i ).getTuoi() == 23 && hocSinh.get( i ).getQueQuan().compareTo("Da Nang") == 0 )
                {
                    dem++ ;
                }
            }
            System.out.println("So hoc sinh 23 tuoi va que quan o Da Nang la: " +dem ) ;
        }
        else
        {
            System.out.println("Chua co hoc sinh nao!") ;
        }
        
    }

    private static void sapXep() 
    {
        if ( hocSinh.size() >= 2 )
        {
            for ( int i = 0 ; i < hocSinh.size() - 1 ; i++ )
            {
                for ( int j = i + 1 ; j < hocSinh.size() ; j++ )
                {
                    if ( hocSinh.get( i ).getQueQuan().compareTo( hocSinh.get( i ).getQueQuan() ) > 0 )
                    {
                        HocSinh item = hocSinh.get( i ) ;
                        hocSinh.set( i , hocSinh.get( j ) ) ;
                        hocSinh.set( j , item ) ;
                    }
                }
            }
            xuat() ;
        }
        else
        {
            System.out.println("Khong du 2 hoc sinh tro len!") ;
        }
        
    }
    
    public static boolean listEmpty()
    {
        if ( hocSinh.size() != 0 ) return true ;
        else return false ;
    }

    
    
}
