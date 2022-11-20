package BTVN_B5.Cau_3;

import java.util.Scanner;

public class SinhVienDemo 
{
    public static void sapXepDiem( SinhVien[] sv , int n )
    {
        for ( int i = 0 ; i < n - 1 ; i++ )
        {
            for ( int j = i + 1 ; j < n ; j++ )
            {
                if ( sv[ i ].getDiem() >  sv[ i ].getDiem() )
                {
                    SinhVien temp = sv[ i ] ;
                    sv[ i ] = sv [ j ] ;
                    sv[ j ] = temp ;
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Nhap vao so luong sinh vien can hien thi: ") ;
        int n = sc.nextInt() ;
        
        System.out.println("Thong tin " + n + " sinh vien nhu sau: ") ;
        System.out.println() ;
        
        SinhVien[] sv = new SinhVien[ n ] ;
        for ( int i = 0 ; i < n ; i++ )
        {
            System.out.println("Nhap vao thong tin sinh vien thu: " + ( i + 1 ) ) ;
            sv [ i ] = new SinhVien() ;
            sv [ i ].input(); ;
        }
        
        do
        {
            System.out.println("DANH SACH CAC LUA CHON") ;
            System.out.println("1- Sap xep theo diem!") ;
            System.out.println("2- Tim kiem theo ten!") ;
            System.out.println("3- Sap xep theo ten!") ;
            System.out.println("4- Thoat khoi chuong trinh") ;
            System.out.println("Moi nhap lua chon: ") ;
            System.out.println("-------------------------") ;
            
            int a = sc.nextInt() ;
            switch ( a )
            {
                case 1:
                    System.out.println("DANH SACH SINH VIEN DUOC XEP THEO CHIEU TANG DAN DIEM") ;
                    sapXepDiem( sv , n ) ;
                    output ( sv , n ) ;
                    break ;
                case 2: 
                    System.out.println("DANH DUOC TIM KIEM THEO TEN") ;
                    break ;
                case 3:
                    System.out.println("DANH SACH SINH VIEN DUOC SAP SEP THEO TEN") ;
                    break ;
                case 4:
                    System.exit( 0 );
                    break ;
                default:
                    System.out.println("LUA CHON KHONG DUOC CHAP NHAN") ;
                    break ;
            }
            
        }
        while ( true ) ;             
}

    private static void output(SinhVien[] sv, int n) {
        System.out.println("----------DANH SACH SINH VIEN----------") ;
        
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" , "Ma sinh vien" , "Ho va ten" , "Dia chi" , "So dien thoai" , "Diem" ) ;
        for ( int i = 0 ; i < n ; i++ )
        {
            sv [ i ].output(); ;
        }
    }
    
    
}
 