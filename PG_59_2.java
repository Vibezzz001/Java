import java.util.*;
class PG_59_2
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        double price , price_disc , price_GST;
        
        System.out.println(" Enter the printed price of the product. ");
        price = in.nextDouble();
        
        price_disc = 0.9 * price;
        price_GST = 1.09 * price_disc;
        
        System.out.println(" The total price to be paid by the customer = "+ price_GST);
    }
}