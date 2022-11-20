package BTVN_B5.Cau_1;

import java.util.Scanner;

public class NhanVien 
{
    static int dem =1 ;
    private int id ;
    private String hoTen ;
    private String kieuNhanVien ;
    private int soNgayLam ;
    private int namVaoLam ;
    private double phuCap ;
    
    public NhanVien()
    {
        this.id = dem++;
    }

    public NhanVien(int id, String hoTen, String kieuNhanVien, int soNgayLam, int namVaoLam, double phuCap, int namHT) {
        this.id = dem++;
        this.hoTen = hoTen;
        this.kieuNhanVien = kieuNhanVien;
        this.soNgayLam = soNgayLam;
        this.namVaoLam = namVaoLam;
        this.phuCap = phuCap;
        this.namHT = namHT;
    }

    public static int getDem() {
        return dem;
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getKieuNhanVien() {
        return kieuNhanVien;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public int getNamHT() {
        return namHT;
    }

    public static void setDem(int dem) {
        NhanVien.dem = dem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setKieuNhanVien(String kieuNhanVien) {
        this.kieuNhanVien = kieuNhanVien;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public void setNamHT(int namHT) {
        this.namHT = namHT;
    }

    
    
    public void input()
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Nhap vao ho ten nhan vien: ") ;
        hoTen = sc.nextLine() ;
        System.out.println("Nhap vao kieu nhan vien: ") ;
        kieuNhanVien = sc.nextLine() ;
        System.out.println("Nhap vao so ngay lam cua nhan vien: ") ;
        soNgayLam = sc.nextInt() ;
        System.out.println("Nhap vao nam vao lam cua nhan vien: ") ;
        namVaoLam = sc.nextInt() ;
        System.out.println("Nhap vao nam hien tai: ") ;
        namHT = sc.nextInt() ;
        System.out.println("-------------------------------------") ;
        sc.nextLine() ;
    }
    
    public double luong()
    {
        double luong = 0 ;
        if ( kieuNhanVien == "San xuat")
        {
            luong = 350000 * soNgayLam ;
        }
        else
        {
            luong = 400000 * soNgayLam ;
        }
        return luong ;
    }
    
    int namHT ;
    public double tienPhuCap()
    {
        double phuCap = 100000 + ( namHT - namVaoLam ) * 200000 ;
        return phuCap ;
    }
    
    public double tongTienLuong()
    {
        double tongTienLuong = luong() + tienPhuCap() ;
        return tongTienLuong ;
    }
    
    public void output()
    {
        System.out.printf("%-5s %-20s %-20s %-15s %-15s %-15s %-15s %-15s" , id , hoTen , kieuNhanVien , soNgayLam , namVaoLam , luong() , tienPhuCap() , tongTienLuong() ) ;
    }
    
    
    
    
}
