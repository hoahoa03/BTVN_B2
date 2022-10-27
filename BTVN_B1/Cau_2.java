package BTVN_B1;

import java.util.Scanner;

public class Cau_2 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in) ;
		int a[] = new int[ 4 ] ;
		for( int i = 0 ; i < 4 ; i++ )
                {
                    System.out.println("Nhap vao 4 so nguyen: ");
                    a[ i ] = sc.nextInt() ;
		}
		for( int i = 0 ; i < 4 ; i++ ) 
                {
			for( int j = i + 1 ; j < 4 ; j++ ) 
                        {
				if ( a[ i ] < a[ j ] ) 
                                {
					int temp = a[ i ] ; 
					a[ i ] = a[ j ] ;
					a[ j ] = temp ;
				}
			}
		}
		if( a[ 0 ] == a[ 3 ] ) 
                    System.out.print("Khong ton tai so lon thu hai goi, huhu!!! \n") ;
		else 
                    System.out.print( "So lon thu hai trong day so la: " + a[ 1 ] + "\n" ) ;
    }

    
}
