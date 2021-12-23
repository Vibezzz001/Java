import java.util.*;
class PG_94_12
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        double showp , nowp = 0.0;
        int t;
        
        System.out.println(" Enter the showroom price of the car. ");
        showp = in.nextInt();
        System.out.println(" How old is the car ( in years ) ?");
        t = in.nextInt();
        
        System.out.println(" ");
        
        switch (t)
        {
            case 1:
                nowp = 0.9 * showp;
                break;
            
            case 2:
                nowp = 0.8 * showp;
                break;
                
            case 3:
                nowp = 0.7 * showp;
                break;
                
            case 4:
                nowp = 0.5 * showp;
                break;    
        }
        
        if(t >= 5){
            nowp = 0.4 * showp;
        }
        
        System.out.println(" Showroom Price = " + showp);
        System.out.println(" Number of years the car is used = " + t);
        System.out.println(" Depreciated Price = " + nowp);
    }
}