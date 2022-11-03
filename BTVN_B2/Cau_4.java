package BTVN_B1;

import java.util.Scanner;

public class Cau_4 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in) ;
		int n ;
		do 
                {
			System.out.print("Nhap vao n > 0: ") ;
			n=sc.nextInt() ;
		}
                while( n <= 0 ) ;
                int a = n % 4 ;
                int b = n / 2 ;
		if ( n > 0 && a == 0 && b == 0 ) 
                {
                    System.out.print( "Vay " + n + " la so chinh phuong chan!!!") ;
                }
                else if ( n > 0 && a == 1 && b == 1 )
                {
                    System.out.println("Vay" + n + " la so chinh phuong le!!!") ;
                }
                else
                {
                    System.out.println("NO - " + n + " khong la so chinh phuong!!!") ;
                }
    }
                
}
    

