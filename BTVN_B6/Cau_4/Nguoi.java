package BTVN_B6.Cau_4;

import java.util.Scanner;

public class Nguoi 
{
    private String hoTen ;
    private int tuoi ;
    private String queQuan ;
    private String maSoGV ;
    private CBGV cbGV = new CBGV() ;

    public Nguoi(String hoTen, int tuoi, String queQuan, String maSoGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGV = maSoGV;
    }

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getMaSoGV() {
        return maSoGV;
    }

    public CBGV getCbGV() {
        return cbGV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setMaSoGV(String maSoGV) {
        this.maSoGV = maSoGV;
    }

    public void setCbGV(CBGV cbGV) {
        this.cbGV = cbGV;
    }

    static Scanner sc = new Scanner(System.in) ;
    
    public void input()
    {
        System.out.println("Nhap vao ho ten giao vien: ") ;
        setHoTen( sc.nextLine() ) ;
        
        System.out.println("Nhap vao tuoi cua giao vien: ") ;
        setTuoi( sc.nextInt() ) ;
        sc.nextLine() ;
        
        System.out.println("Nhap vao que quan cua giao vien: ") ;
        setQueQuan( sc.nextLine() ) ;
        
        System.out.println("Nhap vao ma so giao vien: ") ;
        setMaSoGV( sc.nextLine() ) ;
        
        cbGV.input() ;
    }
    
    public void output()
    {
        System.out.printf("%15s %15d %15s %15s %15f %15f %15f %20f \n" , getHoTen() , getTuoi() , getQueQuan() , getMaSoGV() , cbGV.getLuongCung() , cbGV.getLuongThuong() , cbGV.getLuongPhat() , luongThucLinh() ) ;
//        cbGV.output() ;
        System.out.println() ;
    }
    
    double luongThucLinh = 0 ;
    public double luongThucLinh()
    {
        luongThucLinh = (double) cbGV.getLuongCung() + cbGV.getLuongThuong() - cbGV.getLuongPhat() ;
        return luongThucLinh ;
    }
    
}
