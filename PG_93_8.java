import java.util.*;
class PG_93_8
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        int w;
        String E , O;
        
        System.out.println(" Enter the Weight of the parcel. ");
        w = in.nextInt();
        System.out.println("");
        
        System.out.println(" S NAHI TAKLA COMPILER  ");
        String choice = in.next();
        System.out.println("");
        
        if(choice == "E")
        {
            
            
            if(w <= 100)
            {
                System.out.println("100");
            }
            else
            {
                if(w >= 101 && w <= 500)
                {
                    System.out.println("200");
                }
                else
            {
                if(w >= 501 && w <= 1000)
                {
                    System.out.println("250");
                }
                else
                System.out.println("300");
            }
        }
        }
        else{ if(choice == "O")
        {if(w <= 100)
            {
                System.out.println("80");
            }
            else
            {
                if(w >= 101 && w <= 500)
                {
                    System.out.println("150");
                }
                else
            {
                if(w >= 501 && w <= 1000)
                {
                    System.out.println("210");
                }
                else
                System.out.println("250");
            }
        }
        }
    }
        }
    }
