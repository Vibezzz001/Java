import java.util.*;
class PG_73_2
{
    public static void main()
    {
        System.out.println("If m>1 then 2m , m^2 - 1 , m^2 + 1 form a Pythagorean Triplet ");
        System.out.println("Taking input from user form the value 'm' \n");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value for 'm'. m should be greater than 1. ");
        int m= in.nextInt();
            
        double n1 = 2*m;
        double n2 = Math.pow(m,2) - 1;
        double n3 = Math.pow(m,2) + 1;
        
        System.out.println("Thus " + n1 + " , " + n2 + " , " + n3 + " form a Pythagorean Triplet");
    }
}