import java.util.*;
class PG_92_2
{
    public  static void main()
    {
        Scanner in = new Scanner(System.in);
        
        double a , b , c , peri , area , s;
        
        System.out.println(" Enter the lenth of the first Side of the triangle. ");
        a = in.nextInt();
        System.out.println(" Enter the lenth of the second Side of the triangle. ");
        b = in.nextInt();
        System.out.println(" Enter the lenth of the third Side of the triangle. ");
        c = in.nextInt();
        
        peri = a + b + c;
        s = peri / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        if(area == peri){
            System.out.println(" It is an Equable Triangle. ");
        }
        else{
            System.out.println(" It is not an Equable Triangle. ");
        }
    }
}