package BTVN_B5.Cau_2;

import java.util.Scanner;

public class OtoDemo 
{
    public static void sapXep( Oto[] oto , int n )
    {
        for ( int i = 0 ; i < n ; i++ )
        {
            for ( int j = i +1 ; j < n ; j++ )
            {
                if ( oto [ i ].giaTriHienTai() < oto [ i ].giaTriHienTai() )
                {
                    Oto temp = oto [ i ] ;
                    oto [ i ] = oto [ j ] ;
                    oto [ j ] = temp ;
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in ) ;
        
        System.out.println("-----DANH SACH MUA OTO CUA CONG TY-----") ;
        System.out.println() ;
        
        System.out.println("Nhap vao so oto can hien thi: ") ;
        int n = sc.nextInt() ;
        
        System.out.println() ;
        
        System.out.println("Nhap vao " + n + " oto : ") ;
        System.out.println() ;
        
        Oto[] oto = new Oto[ n ] ;
        for( int i = 0 ; i < n ; i++ )
        {
            System.out.println("Nhap thong tin oto thu " + ( i + 1 ) ) ;
            System.out.println() ;
            oto[ i ] = new Oto() ;
            oto[ i ].input() ;            
        }
        
        System.out.println("-----DANH SACH CAC XE OTO-----") ;
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n" , "Chu so huu" , "Ten xe" , "Hang" , "Gia" , "Nam su dung" , "Gia tri hien dai") ;
        for ( int i = 0 ; i < n ; i++)
        {
            oto [ i ].output() ;           
        }
        
        System.out.println("-----DANH SACH CAC XE OTO DA HET GIA TRI-----") ;
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n" , "Chu so huu" , "Ten xe" , "Hang" , "Gia" , "Nam su dung" , "Gia tri hien dai") ;
       
        for ( int i = 0 ; i < n ; i++ )
        {
            if ( oto [ i ].giaTriHienTai() <= 0 )
            {
                oto [ i ].output() ;
            }
        }
                    
    }
}
