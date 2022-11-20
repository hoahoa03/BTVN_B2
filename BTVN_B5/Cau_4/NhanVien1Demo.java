package BTVN_B5.Cau_4;

import java.util.Scanner;

public class NhanVien1Demo 
{
//    Static Scanner sc = new Scanner(System.in) ;
    
    private static NhanVien1[] nv;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Nhap vao so luong nhan vien can hien thi: ") ;
        int n = sc.nextInt() ;
        
        System.out.println("Thong tin " + n + " nhan vien nhu sau: ") ;
        System.out.println() ;
        
        NhanVien1[] sv = new NhanVien1[ n ] ;
        for ( int i = 0 ; i < n ; i++ )
        {
            System.out.println("Nhap vao thong tin sinh vien thu: " + ( i + 1 ) ) ;
            sv [ i ] = new NhanVien1() ;
            sv [ i ].input(); ;
        }
        
        do
        {
            System.out.println("DANH SACH CAC LUA CHON") ;
            System.out.println("1- Them moi nhan vien!") ;
            System.out.println("2- Hien thi danh sach nhan vien!") ;
            System.out.println("3- Top 3 nhan vien lam viec cham chi nhat tinh theo gio lam!") ;
            System.out.println("4- Iim kiem theo ho ten!") ;
            System.out.println("5- Thoat khoi chuong trinh!!!") ;
            System.out.println("Moi nhap lua chon: ") ;
            System.out.println("-------------------------") ;
            
            int a = sc.nextInt() ;
            switch ( a )
            {
                case 1:
                    System.out.println("DANH SACH KHI DUOC THEM MOI NHAN VIEN") ;
                    break ;
                case 2: 
                    System.out.println("HIEN THI DANH SACH THONG TIN NHAN VIEN") ;
                    output( nv , n ) ;
                    break ;
                case 3:
                    System.out.println("DANH SACH TOP 3 LAM VIEC CHAM CHI NHAT THEO GIO LAM") ;
                    break ;
                case 4:
                    System.out.println("DANH SACH NHAN VIEN DUOC TIM KIEM THEO HO TEN") ;
                    break ;
                case 5:
                    System.exit( 0 ) ;
                default:
                    System.out.println("LUA CHON KHONG DUOC CHAP NHAN") ;
                    break ;
            }
            
        }
        while ( true ) ;             
}

    private static void output(NhanVien1[] nv, int n) {
        System.out.println("----------DANH SACH NHAN VIEN----------") ;
        
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %n" , "Ho va ten" , "Tuoi" , "Gioi tinh" , "So gio lam" , "Hourly Rate" , "Luong" , "Tax" ) ;
        for ( int i = 0 ; i < n ; i++ )
        {
            nv [ i ].output();
            System.out.println() ;
        }
       
    }
        
}
