package Ktra_buoi_cuoi.Cau2;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    static Scanner sc = new Scanner(System.in) ;    
    
    public static void main(String[] args) 
    {
        List<Honey> list = new ArrayList<>() ;
        HoneyS pd = new HoneySI( list ) ;
        
        int choose;
        
        do 
        {
            System.out.println("Cac lua chon trong chuong trinh!!!") ;
            System.out.println("1. Them Honey") ;
            System.out.println("2. Xoa Honey") ;
            System.out.println("3. Sua Honey") ;
            System.out.println("4. Hien thi Honey") ;
            System.out.println("5. Them so thich") ;
            System.out.println("6. Sap xep ten Honey") ;
            System.out.println("7. Thoat chuong trinh") ;
            System.out.print("Choose: ") ;
            choose = sc.nextInt() ;
            sc.nextLine() ;
            
            Honey d = new Honey() ;
            
            switch (choose) 
            {
                case 1:                   
                    pd.addHoney() ;
                    break ;
                case 2:
                    pd.deleteHoneyById() ;
                    d.xuat();
                    break ;
                case 3:
                    pd.editHoneyById() ;
                    d.xuat();
                    break ;
                case 4:
                    pd.showAllHoneys() ;
                    break ;
                case 5:
                    pd.addFavoriteByHoneyId() ;
                    d.xuat();
                    break ;
                case 6:
                    pd.sortByName() ;
                    break ;
                case 7:
                    System.out.println("Chao ban iu nhe, hen gap lai lan sau a!!!") ;
                    System.exit( 0 ) ;                                      
            }
        } 
        while ( choose != 7 ) ;
        System.out.println("Khum co lua chon do, moi ban chon lai a!!!") ;
    }
        
        
    
    
}
