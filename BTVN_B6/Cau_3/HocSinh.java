package BTVN_B6.Cau_3;

import java.util.Scanner;

public class HocSinh 
{
    private String hoTen ;
    private int tuoi ;
    private String queQuan ;
    private Lop lop = new Lop() ;

    public HocSinh() {
    }

    public HocSinh(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
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

    public Lop getLop() {
        return lop;
    }

    public static Scanner getSc() {
        return sc;
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

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public static void setSc(Scanner sc) {
        HocSinh.sc = sc;
    }

    static Scanner sc = new Scanner(System.in) ;

    public void input()
    {
        System.out.println("Nhap vao ten hoc sinh: ") ;
        setHoTen( sc.nextLine() ) ;

        System.out.println("Nhap vao tuoi hoc sinh: ") ;
        setTuoi( sc.nextInt() ) ;
        sc.nextLine() ;

        System.out.println("Nhap vao que quan hoc sinh: ") ;
        setQueQuan( sc.nextLine() ) ;
            
        lop.input() ;
    }

    public void output()
    {
        System.out.printf("%15s %15d %15s %15s %15s" , getHoTen() , getTuoi() , getQueQuan()) ;
        lop.output() ;
        System.out.println() ;

    }   

    
}
