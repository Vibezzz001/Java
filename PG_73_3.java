import java.util.*;
class PG_73_3
{
    public static void main()
    {
        /*PROGRAM TO CALCULATE SQRT AND CBRT AND ROUNDING OFF*/
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int n= in.nextInt(); /*TAKING INPUT*/
        
        double n_sqrt = Math.sqrt(n);
        double n_cbrt = Math.cbrt(n);
        long n_sqrt_round = Math.round(n_sqrt);
        long n_cbrt_round = Math.round(n_cbrt);
        
        /*DISPLAYING RESULT*/
        System.out.println("Square root of" + n + " = " + n_sqrt);
        System.out.println("Rounded form = " + n_sqrt_round);
        System.out.println("Cube root of" + n + " = " + n_cbrt);
        System.out.println("Rounded form = " + n_cbrt_round);
    }
}