import java.util.*;
class PG_93_10
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        double pi , s , l ,  b , h , r , v_cube , v_cuboid , v_s;
        long  v_cube_r , v_cuboid_r , v_s_r;
        String ch;
        
        pi = 22.0 / 7.0;
        
        System.out.println(" ********** MENU LIST ********** ");
        System.out.println(" 1. Volume of Cube ");
        System.out.println(" 2. Volume of Sphere ");
        System.out.println(" 3. Volume of Cuboid \n");
        
        System.out.println(" Enter your choice.");
        ch = in.next();
        
        switch (ch)
        {
            case "a":
                System.out.println(" Enter the length of Side of Cube. ");
                s = in.nextInt();
                v_cube = Math.pow(s,3);
                v_cube_r = Math.round(v_cube);
                System.out.println(" Volume of Cube =  " + v_cube_r);
                break;
                
            case "b":
                 System.out.println(" Enter the radius of the Sphere ");
                 r = in.nextInt();
                 v_s = r * r * r * pi * ( 4.0 / 3.0 );
                 v_s_r = Math.round(v_s);
                 System.out.println(" Volume of Sphere = " + v_s);
                 System.out.println(" Rounded Form = " + v_s_r);
                 break;
                 
            case "c":
                System.out.println(" Enter the Length of the Cuboid ");
                l = in.nextInt();
                System.out.println(" Enter the Breadth of the Cuboid ");
                b = in.nextInt();
                System.out.println(" Enter the Height of the Cuboid ");
                h = in.nextInt();
                v_cuboid = l * b * h;
                v_cuboid_r = Math.round(v_cuboid);
                System.out.println(" Volume of Cuboid = " + v_cuboid_r);
                break;
                
            default:
                System.out.println("Wrong Choice!!");
        }
    }
}