import java.util.*;
class PG_93_11
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        int v1 , v2 , l1 , l2 , lt , vt , t , ch;
        
        System.out.println(" ********** MENU LIST ********** ");
        System.out.println(" 1. Trains Travelling in Opposite Directions. ");
        System.out.println(" 2. Trains Travelling in Same Directions. \n");
        
        System.out.println(" Enter your choice. \n");
        ch = in.nextInt();
        
        switch (ch)
        {
            case 1:
                System.out.println(" Enter the Velocity of Train 1 ");
                v1 = in.nextInt();
                System.out.println(" Enter the Velocity of Train 2 ");
                v2 = in.nextInt();
                System.out.println(" Enter the Length of Train 1 ");
                l1 = in.nextInt();
                System.out.println(" Enter the Length of Train 2 ");
                l2 = in.nextInt();
                lt = l1 + l2;
                vt = v1 + v2;
                t = lt / vt;
                System.out.println(" The 2 trains will take " + t + " seconds to cross each other ");
                break;
            
            case 2:
                System.out.println(" Enter the Velocity of Train 1 ");
                v1 = in.nextInt();
                System.out.println(" Enter the Velocity of Train 2 ");
                v2 = in.nextInt();
                System.out.println(" Enter the Length of Train 1 ");
                l1 = in.nextInt();
                System.out.println(" Enter the Length of Train 2 ");
                l2 = in.nextInt();
                lt = l1 + l2;
                vt = v1 - v2;
                if(v1 > v2){
                vt = v1 - v2;
                } else {
                vt = v2 - v1;
                }
                t = lt / vt;
                System.out.println(" The 2 trains will take " + t + " seconds to cross each other ");
                break;
        }
    }
}