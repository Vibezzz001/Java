import java.util.*;
class PG_93_9
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        double pi , r , side , l , b , a_c , a_s , a_r;
        int ch;
        long  a_c_r , a_s_r , a_r_r;
        
        pi = 22.0 / 7.0;
        
        System.out.println(" ********** MENU LIST ********** ");
        System.out.println(" 1. Area of Circle ");
        System.out.println(" 2. Area of Square ");
        System.out.println(" 3. Area of Rectangle \n");
        
        System.out.println(" Enter your choice. \n");
        ch = in.nextInt();
        
        switch (ch)
        {
            case 1:
                System.out.println(" Enter the Radius of the Circle. ");
                r = in.nextInt();
                a_c = Math.pow(r,2) * pi;
                a_c_r = Math.round(a_c);
                System.out.println(" Area of Circle =  " + a_c_r);
                break;
                
            case 2:
                 System.out.println(" Enter the length of Side of Square ");
                 side = in.nextInt();
                 a_s = Math.pow(side,2);
                 a_s_r = Math.round(a_s);
                 System.out.println(" Area of Square = " + a_s_r);
                 break;
                 
            case 3:
                System.out.println(" Enter the Length of the Rectangle ");
                l = in.nextInt();
                System.out.println(" Enter the Breadth of the Rectangle ");
                b = in.nextInt();
                a_r = l * b;
                a_r_r = Math.round(a_r);
                System.out.println(" Area of Rectangle = " + a_r_r);
                break;
                
            default:
                System.out.println("Wrong Choice!!");
        }
    }
} 