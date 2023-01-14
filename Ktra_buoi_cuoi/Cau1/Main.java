package Ktra_buoi_cuoi.Cau1;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        String a = sc.nextLine() ;
        int count1 = 0 ; 
        int count2 = 0 ;
        for ( int i = 0 ; i < a.length(); i++ ) 
        {
            if ( a.charAt( i ) == '(' )
            {
                count1++ ;
            }
            else
            {
                if ( count1 > 0 )
                {
                    count1-- ;
                } 
                else
                {
                    count2++ ;
                }
            }
        }
        System.out.println( count1 + count2 ) ;
    }
    
}
