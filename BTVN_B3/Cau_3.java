package BTVN_B3;

import java.util.Scanner;

public class Cau_3 
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
        
        System.out.println("Nhap vao cac phan tu cua mang: ") ;
        int [] arr = new int[ n ] ;
        for ( int i = 0 ; i < n ; i++ )
        {
            arr[ i ] = sc.nextInt() ;
        }
              
        int length = 1 , max = 0 ;
	for( int i = 1 ; i < n ; i++ )
	{
            if ( arr[ i ] >= arr [ i - 1 ] ) length++ ;
            else length = 1 ;
            if ( length > max ) max = length ;
	}
	if ( length > max ) max = length ; 
	System.out.println( "Mang con lien tiep co do dai lon nhat la: " + max ) ;
        
    }
    
     
}
