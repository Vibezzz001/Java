import java.util.*;
class PG_92_5
{
    public static void main()
    {
        System.out.println(" Program to calculate the fare to be paid. ");
        System.out.println(" Input ( Distance Travelled ) Given by user \n ");
        
        Scanner in = new Scanner(System.in);
        
        int fixed ,extra , amt , dist;
        
        System.out.println(" Enter the Distance Travelled ( in km )");
        dist = in.nextInt();
        amt = 0;
        fixed = 80;
        extra = 0;
        if(dist <= 10){
            extra = fixed;
        }
        
        if(dist >= 11 && dist <= 20){
           extra = 6 * (dist-10);
        }
        
        if(dist >= 21 && dist <= 30){
            extra = (6 * 10) + (5 * (dist - 20));
        }
        
        if(dist >= 31){
            extra = (6 * 10) + (5 * 10) + (4 * (dist - 30) );
        }
        System.out.println(" Total Fare = "+(fixed + extra));
    }
}