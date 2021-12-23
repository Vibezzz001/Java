import java.util.*;
class PG_93_7
{
    public static void main()
    {
        
        Scanner in = new Scanner(System.in);
        
        double roi_g , roi_sr , i = 0.0, p;
        int t , age;
        
        System.out.println(" Enter Your Age ");
        age = in.nextInt();
        System.out.println("");
        
        System.out.println(" Enter Term of Deposit. ");
        t = in.nextInt();
        System.out.println("");
        
        System.out.println(" Enter Amount to be Deposited. ");
        p = in.nextInt();
        System.out.println("");
            
        if( age >= 60 )
        {
            if(t == 1){
            i = ( p * t * 8.0) / 100; 
            } else if( t == 2){
                i = ( p * t * 9.0) / 100;
            }else if( t == 3){
                i = ( p * t * 10.0) / 100;
            }else if(t>3){
            i = ( p * t * 11.0) / 100;
            }
        }
        else if(age <= 60 && age != 0)
        {
        if (t == 1){
        i = ( p * t * 7.5) / 100;
        } else if( t == 2){
        i = ( p * t * 8.5) / 100;
        } else if(t == 3){
        i = ( p * t * 9.5) / 100;
        }else if(t > 3){
        i = ( p * t * 10.0) / 100;
        }
        }
        
        
    }
}