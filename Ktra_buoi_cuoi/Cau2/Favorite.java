package Ktra_buoi_cuoi.Cau2;

import static BTVN_B6.Cau_2.LopHoc.sc;

public class Favorite 
{
    private String id ;
    private String name ;

    public Favorite(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Favorite() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void input()
    {
        System.out.println("Nhap ma so thich: ") ;
        setId( sc.nextLine() ) ;
        System.out.println("Nhap so thich nguoi yeu: ") ;
        setName( sc.nextLine() ) ;
    }
    
    public void output()
    {
        System.out.println("Ma so thich: " + getId()) ;
        System.out.println("Ten so thich: " + getName()) ;
        sc.nextLine() ;
    }

    @Override
    public String toString() {
        return "Favorite{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
