import java.util.*;
class PG_73_1
{
    public static void main()
    {
        System.out.println("Program to Calculate (1/a^2) + (2/b^2) + (3/c^2) \n Taking Input from User \n");
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a Number for variable a.");
        double a = in.nextDouble();
        System.out.println("Please Enter a Number for variable b.");
        double b = in.nextDouble();
        System.out.println("Please Enter a Number for variable c.");
        double c = in.nextDouble();
        
        double Sq_a = Math.pow(a,2);
        double Sq_b = Math.pow(b,2);
        double Sq_c = Math.pow(c,2);
        
        double ans = (1/Sq_a) + (2/Sq_b) + (3/Sq_c);
        double ans_round = Math.round(ans);
        System.out.println("\n Answer to the expression = "+ans);
        System.out.println("\n Answer to the expression rounded off to nearest Interger = "+ans_round);
    }
}