import java.util.*;
class PG_59_3
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int salary , food , rent , misc , save;
        
        System.out.println(" Enter your Salary. ");
        salary = in.nextInt();
        
        food =  salary / 2 ;
        rent = salary / 15;
        misc = salary / 10;
        save = salary - ( food + rent + misc );
        
        System.out.println(" Money spent on food = "+ food);
        System.out.println(" Money spent on rent = "+ rent);
        System.out.println(" Money spent on miscellaneous = "+ misc);
        System.out.println(" Money saved = "+ save);
        
    }
}