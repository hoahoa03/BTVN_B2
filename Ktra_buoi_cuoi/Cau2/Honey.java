package Ktra_buoi_cuoi.Cau2;

import java.util.ArrayList;
import java.util.List;

public class Honey extends Person
{
    private String id ;
    private String status ;
    private List<Favorite> listF = new ArrayList<>() ;

    public Honey(String id, String status) 
    {
        super() ;
        this.id = id;
        this.status = status;
    }

    public Honey() {
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public List<Favorite> getListF() {
        return listF;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setListF(List<Favorite> listF) {
        this.listF = listF;
    }
    
    public void input()
    {
        super.input() ;
        System.out.println("Nhap ma nguoi yeu: ") ;
        setId( sc.nextLine() ) ;
        System.out.println("Nhap trang thai nguoi yeu: ") ;
        setStatus(sc.nextLine() ) ;
    }
    
    public void output()
    {
        super.output() ; 
        System.out.println("Ma nguoi yeu la: " + getId()) ;
        System.out.println("Trang thai yeu la: " + getStatus()) ;
        sc.nextLine() ;
    }

    @Override
    public String toString() {
        return "Honey{" + "id=" + id + ", status=" + status + '}';
    }
    
    static void title()
    {
        System.out.printf("%15s %15s %15s %15s %15s %15s %\n" , "Id" , "Status" , "Ten ng eo" , "Tuoi ng eo" , "Gioi tinh ng eo" , "SDT ng eo") ;
    }
    
    public void xuat()
    {
        title() ;
        System.out.printf("%15s %15s %15s %15d %15s %15s %\n"  , getId() , getStatus() , getName() , getAge() , getGender() , getPhone() ) ;
    }

   
  
    
    
    
}
