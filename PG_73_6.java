import java.util.*;
class PG_73_6
{
    public static void main ()
    {
        System.out.println("To calculate the value of the discriminant and displaying the output to the nearest whole number");
        System.out.println("Quadratic equation : ax^2 + bx +c where a , b , c are variables.");
        System.out.println("discriminant = b^2 - 4ac ");
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the value for the variable 'a'.");
        double a = in.nextDouble();
        System.out.println("");
        
        System.out.println("Enter the value for the variable 'b'.");
        double b = in.nextDouble();
        System.out.println("");
        
        System.out.println("Enter the value for the variable 'c'.");
        double c = in.nextDouble();
        System.out.println("");
        
        double d = Math.pow(b,2) - ( 4 * a * c );
        double d_r = Math.round(d);
        System.out.println("The Value of the Discriminant is = "+ d);
        System.out.println("Rounded form = " + d_r);
    }
}
