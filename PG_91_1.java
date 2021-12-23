import java.util.*;
class PG_91_1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        int a , b , c;
        
        System.out.println("Enter 3 number ( Positive or Negative )");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if(a == b && b == c && c == a){
            System.out.println(" All numbers are Equal. ");
        }
        else if(a > b && a > c){
            System.out.println(" "+ a + " is the greatest number. ");
        }
        else if(b > c && b > a){
            System.out.println(" "+ b + " is the greatest number. ");
        }
        else if(c > b && c > a){
            System.out.println(" "+ c + " is the greatest number. ");
        }
        
        if(a > 0 && b > 0 && c > 0){
            System.out.println(" Entered numbers are Positive. ");
        }
        else if(a < 0 && b < 0 && c < 0){
            System.out.println(" Entered numbers are Negative. ");
        }
        else{
            System.out.println(" Entered numbers are Mixed Numbers. ");
        }
    }
}