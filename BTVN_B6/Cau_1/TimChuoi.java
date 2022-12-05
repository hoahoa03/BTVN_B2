package BTVN_B6.Cau_1;

import java.util.ArrayList;
import java.util.Scanner;

public class TimChuoi 
{
    public static Scanner sc = new Scanner(System.in) ;
    
    private String hoTen ;

    public TimChuoi(String hoTen) {
        this.hoTen = hoTen;
    }

    TimChuoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
        
    public void input()
    {
        System.out.println("Nhap vao mot ten bat ky: ") ;
        setHoTen( sc.nextLine() ) ;
    }
    
    public void output()
    {
        System.out.printf("%15s \n" , getHoTen() ) ;
        System.out.println() ;
    }
    
}
