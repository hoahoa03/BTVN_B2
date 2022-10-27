package BTVN_B1;

public class Cau_3 
{
    public static void main(String[] args) 
    {
	int tt1 , tt2 , tt3 ;
        System.out.println("CAC BO DAP AN THOA MAN LA: ") ;
        System.out.println("------------------------") ;
	for( tt1 = 1 ; tt1 < 20 ; tt1++ )
        {
            for( tt2 = 1 ; tt2 < 33 ; tt2++ )
            {
                tt3 = 100 - ( tt1 + tt2 ) ;
                if( ( ( tt1 + tt2 + tt3 ) == 100 ) && ( tt1 * 5 + tt2 * 3 + tt3 / 3 ) == 100 )
                    {                        
                        System.out.println("So trau's dung's la: " + tt1 ) ;
                        System.out.println("So trau's nam's la: " + tt2 ) ;
                        System.out.println("So trau's gia's la: " + tt3 ) ;
                        System.out.println("--------------------------") ;
                    }
            }
        }
    }
    
}
