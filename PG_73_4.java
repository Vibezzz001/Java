import java.util.*;
class PG_73_4
{
public static void main()
{
System.out.println("Program to Calculate Radius of the sphere");
System.out.println("Taking Volume as input \n");

Scanner in = new Scanner(System.in);
System.out.println("Please Enter a the volume of the sphere");
double vol = in.nextDouble();
double pi = 22.0 / 7.0;

double cal = Math.cbrt(vol * (3.0 / 4.0) * (1/pi) );
double r = Math.round(cal);
System.out.println("");
System.out.println("The Radius of the Sphere = " +r);
}
}