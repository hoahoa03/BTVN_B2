package BTVN_B3;

import java.util.Scanner;

public class Cau_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        
        int n ;
        do
        {
            System.out.println("Nhap vap so phan tu cua mang: ") ;
            n = sc.nextInt() ;   
        }
        while ( n <= 0 ) ;
        
        System.out.println("Nhap vao cac phan tu trong mang: ") ;
        int []arr = new int[ n ] ;
        for ( int i = 0 ; i < n ; i++ )
        {
            arr[ i ] = sc.nextInt() ;
        }
        
        int dem = 0 ;  
        System.out.println("Phan tu con thieu con day la: ") ;
        for ( int i = 1 ; i < n ; ++i )
        {
            int ptThieu = arr [ i - 1 ] + 1 ;            
            if ( ptThieu != arr [ i ] )
            {
                System.out.print( ptThieu + " ") ;
                dem++ ;
            }
        }        
        
        if ( dem == 0 )
        {
            System.out.println("YES") ;
        }
                
        System.out.println() ;
    }
}
