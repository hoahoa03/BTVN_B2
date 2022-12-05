package BTVN_B6.Cau_2;

import java.util.Scanner;

public class LopHoc 
{
    private String soBD ;
    private String hoTen ;
    private String diaChi ;
    private String mucUuTien ;
    private Khoi khoi = new Khoi() ;

    public LopHoc() {
    }

    public LopHoc(String soBD, String hoTen, String diaChi, String mucUuTien) {
        this.soBD = soBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBD() {
        return soBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public Khoi getKhoi() {
        return khoi;
    }

    public static Scanner getSc() {
        return sc;
    }

    public void setSoBD(String soBD) {
        this.soBD = soBD;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
    }

    public static void setSc(Scanner sc) {
        LopHoc.sc = sc;
    }
    
    public static Scanner sc = new Scanner(System.in) ;
    
    public void input()
    {
        System.out.println("Nhap vao so bao danh cua thi sinh: ") ;
        setSoBD( sc.nextLine() ) ;
        
        System.out.println("Nhap vao ho ten cua thi sinh: ") ;
        setHoTen( sc.nextLine() ) ;
        
        System.out.println("Nhap vao dia chi cua thi sinh: ") ;
        setDiaChi( sc.nextLine() ) ;
        
        System.out.println("Nhap vao muc uu tien cau thi sinh: ") ;
        setMucUuTien( sc.nextLine() ) ;
        
        khoi.input() ;
    }
    
    public void output()
    {        
        System.out.printf("%15s %15s %15s %15s %15s \n" , getSoBD() , getHoTen() , getDiaChi() , getMucUuTien() , getKhoi() ) ;        
        khoi.output() ;
        System.out.println() ;
    }
    
}
