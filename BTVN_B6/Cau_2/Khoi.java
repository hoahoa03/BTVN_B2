package BTVN_B6.Cau_2;

import static BTVN_B6.Cau_2.LopHoc.sc;

public class Khoi 
{
    private String khoi ;

    public Khoi(String khoi) {
        this.khoi = khoi;
    }

    Khoi() {
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    public void input()
    {
        System.out.println("Nhap vao khoi thi cua thi sinh: ") ;
        setKhoi( sc.nextLine() ) ;
    }
    
    public void output()
    {
        System.out.println( khoi ) ;
    }
    
}
