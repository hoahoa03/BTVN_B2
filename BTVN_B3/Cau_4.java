package BTVN_B3;

import java.util.Scanner;

public class Cau_4 
{    
    
    public static boolean checkSoNt( int n )
    {
        if ( n == 2 ) return true ;
        if ( n < 2 || n % 2 == 0 ) return false ;
        for( int i = 3 ; i <= Math.sqrt( n ) ; i ++ )
        {
            if( n % i == 0 ) return false ;
        }
        return true ;            
    }
    
    public static boolean checkSoSieuNt( int n )
    {
        if( checkSoNt( n ) )
        {
            while( n > 0 )
            {
                if( !checkSoNt ( n % 10) )
                {   
                    return false ;
                }
                n /= 10 ;
            }
        }
        else return false ;
        return true ;
    }
    
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
        int []arr = new int [ n ] ;
        
        for ( int i = 0 ; i < n ; i++ )
        {
            arr[ i ] = sc.nextInt() ;
        }  
        
        for ( int i = 0 ; i < n ; i++ )
        {
            for ( int j = i + 1; j < n ; j++ )
            {
                if ( arr [ i ] > arr [ j ] )
                {
                    int temp = arr [ i ] ;
                    arr [ i ] = arr [ j ] ;
                    arr[ j ] = temp ;
                }
            }
        }
        
        int dem = 0 ;        
	for(int i=0; i<n; i++) 
        {
            if( checkSoNt ( arr[ i ] ) == true && checkSoSieuNt ( arr[ i ] ) == true ) 
            {
		System.out.print(arr[ i ]+ " ") ;
		dem++ ;
            }
	} 
        
	if( dem == 0 )
        {
            System.out.print("NO") ;
        }
        
        System.out.println() ;
    }
    
}
