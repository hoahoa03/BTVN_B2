package BTVN_B5.Cau_2;

import java.io.PrintStream;
import java.util.Scanner;

public class Oto 
{
    private String chuSoHuu ;
    private String tenXe ;
    private String hang ;
    private double gia ;
    private int namMua ;
    
    public Oto()
    {
        
    }

    public Oto(String chuSoHuu, String tenXe, String hang, double gia, int namMua) {
        this.chuSoHuu = chuSoHuu;
        this.tenXe = tenXe;
        this.hang = hang;
        this.gia = gia;
        this.namMua = namMua;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public String getTenXe() {
        return tenXe;
    }

    public String getHang() {
        return hang;
    }

    public double getGia() {
        return gia;
    }

    public int getNamMua() {
        return namMua;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setNamMua(int namMua) {
        this.namMua = namMua;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Nhap vao chu so huu cua xe: ") ;
        chuSoHuu = sc.nextLine() ;        
        System.out.println("Nhap vao ten cua xe: ") ;
        tenXe = sc.nextLine() ;
        System.out.println("Nhap vao hang cua xe: ") ;
        hang = sc.nextLine() ;
        System.out.println("Nhap vao gia mua xe: ") ;
        gia = sc.nextDouble() ;
        System.out.println("Nhap vao nam mua xe: ") ;
        namMua = sc.nextInt() ;
        System.out.println("Nhap vao nam hien tai ") ;
        namHT = sc.nextInt() ;
        System.out.println("----------------------------") ;
        sc.nextLine() ;        
    }
    
    public void output()
    {
        int namSuDung = namHT - namMua ;
        System.out.printf( "%-15s %-15s %-15s %-15s %-15s %-15s %n" , chuSoHuu , tenXe , hang , gia , namSuDung , giaTriHienTai() ) ;
        System.out.println() ;
    }
    
    int namHT ;
    double giaTriHienTai = 0;
    public double giaTriHienTai()
    {
        if ( gia > 0 && gia < 1000000000 )
        {
            double giaTriHienTai = gia - ( gia * ( 7 / 100 ) * ( namHT - namMua ) ) ; 
        }
        else if ( gia >= 1000000000 && gia <= 2000000000 )
        {
            double giaTriHienTai = gia - ( gia * ( 5 / 100 ) * ( namHT - namMua ) ) ; 
        }
        else
        {
            double giaTriHienTai = gia - ( gia * ( 3 / 100 ) * ( namHT - namMua ) ) ; 
        }
        return giaTriHienTai ;
    }
    
    
    
     
        
            
    
        
    
}
