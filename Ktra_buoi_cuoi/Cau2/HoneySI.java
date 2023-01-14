package Ktra_buoi_cuoi.Cau2;

import java.util.* ;
import static jdk.nashorn.internal.runtime.Debug.id;

public class HoneySI implements HoneyS
{
    static Scanner sc  = new Scanner(System.in) ;
    
    private List<Honey> list ;

    public HoneySI( List<Honey> list ) 
    {
        this.list = list ;
    }

    static Honey d = new Honey() ;
    
    @Override
    public void addHoney() 
    {        
        for ( Honey honey : list ) 
        {
            if ( honey.getId().compareTo(d.getId()) == 0 ) 
            {
                System.out.println("Honey da co san data!!!") ;
                return ;
            }
        }
        list.add( d ) ;
        d.input() ;
    }

    @Override
    public void showAllHoneys() 
    {
        d.xuat() ;
    } 

    @Override
    public void deleteHoneyById() 
    {
        for ( Honey honey : list ) 
        {
            String id = null ;
            if ( honey.getId().compareTo( id ) == 0 ) 
            {
                list.remove( honey ) ;
                return ;
            }
            d.input() ;
        }
        System.out.println("Honey khong tim thay data!!!") ;
    }

    @Override
    public void editHoneyById() 
    {        
        Honey d = new Honey() ;
        for ( Honey honey : list ) 
        {
            String id = null ;
            if ( honey.getId().compareTo( id ) == 0 ) 
            {
                d = honey ;
                break ;
            }
        }
        
        System.out.println("Cac lua chon trong chuong trinh!") ;
        System.out.println("1 -  Chinh sua ten!") ;
        System.out.println("2 -  Chinh sua tuoi!") ;
        System.out.println("3 -  Chinh sua SDT!") ;
        System.out.println("4 -  Chinh sua status!") ;
        System.out.print("Moi nhap lua chon cua ban: ") ;
        int choose = sc.nextInt() ;
        sc.nextLine() ;
        switch ( choose ) 
        {
            case 1:
                System.out.print("Nhap ten: ") ;
                String name = sc.nextLine() ;
                d.setName( name ) ;
            case 2:
                System.out.print("Nhap tuoi: ") ;
                int age = sc.nextInt() ;
                sc.next() ;
                d.setAge( age ) ;
            case 3:
                System.out.print("Nhap SDT: ") ;
                String phone = sc.nextLine() ;
                d.setPhone( phone ) ;
            case 4:
                System.out.print("Nhap status: ") ;
                String status = sc.nextLine() ;
                d.setStatus( status ) ;
        }
    }
        
    @Override
    public void addFavoriteByHoneyId() 
    {
        Favorite d = new Favorite() ;
        for ( Honey honey : list ) 
        {
            String id = null ;
            if ( honey.getId().compareTo( id ) == 0 ) 
            {
                honey.getListF().add( d ) ;
                return ;
            }
        }
        d.input();
    }

    @Override
    public void sortByName()
    {
        list.sort( ( h1 , h2 ) -> h2.getName().compareTo( h1.getName() ) ) ;
        System.out.println("Honeys sap xep thanh cong!!!") ;
        d.xuat();
    }
    
    
        
    

    
    
    
    

    
    
    
    
}
