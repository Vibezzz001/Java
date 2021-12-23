import java.util.*;
class PG_73_5
{
    public static void main()
    {
        System.out.println("To calculate (Tan A - Tan B) / (1 + Tan A * Tan B) .");
        System.out.println("Input of A and B taken from user in degrees.");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the value for A");
        double a = in.nextDouble();
        System.out.println("Please Enter the value for B");
        double b = in.nextDouble();
        double pi = 22.0 / 7.0;
        
        double a_converted = pi * (1 / 180.0) * a;
        double b_converted = pi * (1 / 180.0) * b;
        double tan_a = Math.tan(a_converted);
        double tan_b = Math.tan(b_converted);
        
        double numerator = tan_a - tan_b;
        double denominator = 1.0 + ( tan_a * tan_b );
        double final_ans = numerator / denominator;
        
        System.out.println("The answer to the Expression (Tan A - Tan B) / (1 + Tan A * Tan B) = " + final_ans);
        System.out.println();
    }
}
