import java.util.*;
class PG_92_3
{
    public  static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" Input any two digit number. ");
        int n = in.nextInt();
        
        int tens = n / 10;
        int ones = n % 10; 
        
        int sum = tens + ones;
        int product = tens * ones;
        int pro_sum = sum + product;
        
        if(pro_sum == n){
            System.out.println(" It is a Special two - digit number. ");
        }
        else{
            System.out.println(" It is not a Special two - digit number. ");
        }
    }
}
