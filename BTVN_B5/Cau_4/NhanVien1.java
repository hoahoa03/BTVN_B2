package BTVN_B5.Cau_4;

import java.util.Scanner;

public class NhanVien1 
{
    private String hoTen ;
    private int tuoi ;
    private String gioiTinh ;
    private String diaChi ;
    private float soGioLam ;
    private double hourlyRate ;
    private double luong ;
    private double tax ;
    
    public NhanVien1()
    {
        
    }

    public NhanVien1(String hoTen, int tuoi, String gioiTinh, String diaChi, float soGioLam, double hourlyRate, double luong, double tax) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soGioLam = soGioLam;
        this.hourlyRate = hourlyRate;
        this.luong = luong;
        this.tax = tax;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public float getSoGioLam() {
        return soGioLam;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getLuong() {
        return luong;
    }

    public double getTax() {
        return tax;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoGioLam(float soGioLam) {
        this.soGioLam = soGioLam;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    
    public void input()
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Nhap vao ho ten cua nhan vien: ") ;
        hoTen = sc.nextLine() ;
        System.out.println("Nhap vao tuoi cua nhan vien: ") ;
        tuoi = sc.nextInt() ;
        System.out.println("Nhap vao gioi tinh cua nhan vien: ") ;
        gioiTinh = sc.nextLine() ;
        System.out.println("Nhap vao dia chi cua nhan vien: ") ;
        diaChi = sc.nextLine() ;
        System.out.println("Nhap vao so gio lam viec cua nhan vien: ") ;
        soGioLam = sc.nextFloat() ;
        System.out.println("Nhap vao so tien tra 1 gio cho nhan vien: ") ;
        hourlyRate = sc.nextDouble();
        System.out.println("--------------------------------------------") ;
        sc.nextLine() ;
        
    }
    
    public void output()
    {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %n" , hoTen , tuoi , gioiTinh , diaChi , soGioLam , hourlyRate , luong , tax ) ;
    }
    
    public double hoursWorker ()
    {
        if ( soGioLam >= 45 )
          return  soGioLam = 45 + ( soGioLam - 45 ) * ( 3 / 2 ) ;
        else
            return soGioLam ;    
    }
    
    public double salary()
    {
        return hoursWorker() * hourlyRate ;
    }
    
    public double tax()
    {
        if ( salary() > 300 ) 
            return tax = salary() * ( float ) ( 20 / 100 ) ;
        else
            return 0 ;
    }

    @Override
    public String toString() {
        return "NhanVien1{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", soGioLam=" + soGioLam + ", hourlyRate=" + hourlyRate + ", luong=" + luong + ", tax=" + tax + '}';
    }

    

    
    
}
