import java.util.*;
class PG_92_6
{
    public static void main()
    {
        System.out.println(" Program to display which Stream should a student choose for Class XI ");
        System.out.println(" Marks of English , Maths , Science taken from user ");
        
        Scanner in = new Scanner(System.in);
        
        int eng , sci ,math ;
        
        System.out.println(" Enter Marks scored in English. ");
        eng = in.nextInt();
        System.out.println("");
        
        System.out.println(" Enter Marks Scored in Maths. ");
        math = in.nextInt();
        System.out.println("");
        
        System.out.println(" Enter Marks Scored in Science. ");
        sci = in.nextInt();
        System.out.println("");
        
        if(eng >= 80 && math >= 80 && sci >= 80)
            System.out.println(" You should choose Pure Science Stream. ");
        
        else
            { if(sci >= 80 && eng >= 80 && math >= 60)
            System.out.println(" You should choose Bio. Science Stream. ");
        
        else
            {if(eng >= 60 && math >= 60 && sci >= 60)
            System.out.println(" You should choose Commerce Stream. ");}
        }
    }
}
