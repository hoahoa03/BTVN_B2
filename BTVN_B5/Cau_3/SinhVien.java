package BTVN_B5.Cau_3;

import java.util.Scanner;

public class SinhVien 
{
    private static int dem ;
    private int maSV ;
    private String hoTen ;
    private String diaChi ;
    private String soDT ;
    private float diem ;
    
    public SinhVien()
    {
        this.maSV = dem++;
    }

    public SinhVien(int maSV, String hoTen, String diaChi, String soDT, int diem) {
        this.maSV = dem++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.diem = diem;
    }

    public static int getDem() {
        return dem;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public float getDiem() {
        return diem;
    }

    public static void setDem(int dem) {
        SinhVien.dem = dem;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in) ;
        do
        {
            System.out.println("Nhap vao ho ten sinh vien: ") ;
            hoTen = sc.nextLine() ;
        }
        while ( !hoTen.contains(" ") ) ;
         
        System.out.println("Nhap vao dia chi sinh vien: ") ;
        diaChi = sc.nextLine() ;
        
          do
        {
            System.out.println("Nhap vao so dien thoai sinh vien: ") ;
            soDT = sc.nextLine() ;
        }
        while( soDT.length() != 7 || soDT.matches(" .* [ ^0 - 9 ] .* ") ) ;
                  
        do
        {
            System.out.println("Nhap vao diem sinh vien: ") ;
            diem = sc.nextFloat() ;
        }
        while ( diem < 0 || diem > 10 ) ;
        
        System.out.println("------------------------------------") ;
        sc.nextLine() ;
    }
    
    public void output()
    {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" , maSV , hoTen , diaChi , soDT , diem ) ;       
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDT=" + soDT + ", diem=" + diem + '}';
    }
    
    
    
    
}
