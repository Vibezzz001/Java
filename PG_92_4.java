import java.util.*;
class PG_92_4
{
    public  static void main()
    {
        System.out.println(" To display if the roots of a quadratic eqquation are real or imaginary ");
        System.out.println(" Standerd Form of Quadraticc Equation : ax^2 + bx +c =0 ");
        System.out.println(" Discriminant = b^2 -4ac ");
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        
        double a , b ,c ,d ,r1 , r2 , sqrt_d;
        
        System.out.println(" Enter the value for the variable 'a'.");
        a = in.nextDouble();
        System.out.println("");
        
        System.out.println(" Enter the value for the variable 'b'.");
        b = in.nextDouble();
        System.out.println("");
        
        System.out.println(" Enter the value for the variable 'c'.");
        c = in.nextDouble();
        System.out.println("");
        
        d = Math.pow(b,2) - (4 * a * c);
        
        if(d >= 0)
        { System.out.println(" Root of this Quadratic Equation are Real.\n"); }
        else { System.out.println(" Root of this Quadratic Equation are Imaginary.\n"); }
        
        sqrt_d = Math.sqrt(d);
        
        r1 = (-b + sqrt_d) / (2 * a) ;
        r2 = (-b - sqrt_d) / (2 * a) ;
        
        System.out.println(" Roots of the Equation are = ");
        System.out.println(" (1) "+ r1);
        System.out.println(" (2) "+ r2);
    }
}