package BTVN_B6.Cau_4;

import static BTVN_B6.Cau_2.LopHoc.sc;

public class CBGV 
{
    private double luongCung ;
    private double luongThuong ;
    private double luongPhat ;

    public CBGV(double luongCung, double luongThuong, double luongPhat) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
    }

    public CBGV() {
    }

    public double getLuongCung() {
        return luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public double getLuongPhat() {
        return luongPhat;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public void setLuongPhat(double luongPhat) {
        this.luongPhat = luongPhat;
    }

    public void input()
    {
        System.out.println("Nhap vao luong cung cua CBGV: ") ;
        setLuongCung( sc.nextDouble() ) ;
        
        System.out.println("Nhap vao luong thuong cua CBGV: ") ;
        setLuongCung( sc.nextDouble() ) ;
        
        System.out.println("Nhap vao luong phat cua CBGV: ") ;
        setLuongCung( sc.nextDouble() ) ;     
    }
    
//    public void output()
//    {
//        System.out.printf("%15f %15f %15f %15f\n" , getLuongCung() , getLuongThuong() , getLuongPhat() ) ;
//        System.out.println() ;
//    }
    
    
    
}
