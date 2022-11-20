package BTVN_B5.Cau_1;

import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;

public class NhanVienDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("-----DANH SACH NHAN VIEN CUA CONG TY-----") ;
        System.out.println() ;
        
        System.out.println("Nhap vao so nhan vien can hien thi: ") ;
        int n =  sc.nextInt() ;
        
        System.out.println() ;
        
        System.out.println("Nhap " + n + " thong tin nhan vien vao danh sach: ") ;
        System.out.println() ;
        
        NhanVien[] nv = new NhanVien[ n ] ;
        for ( int i = 0 ; i < n ; i++ )
        {
            System.out.println("Nhap thong tin nhan vien thu " + ( i + 1 ) ) ;
            nv [ i ] = new NhanVien() ;
            nv [ i ].input() ; 
        }
        
        System.out.printf("%-5s %-20s %-20s %-15s %-15s %-15s %-15s %-15s %n" , "id" , "Ho va ten" , "Kieu nhan vien" , "So ngay lam" ,"Nam vao lam" , "Luong", "Phu cap" , "Tong tien luong") ;
        for ( int i = 0 ; i < n ; i++ )
        {
            nv [ i ].output() ; 
            System.out.println() ;
        }
    }
}
