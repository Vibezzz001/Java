import java.util.*;
class PG_59_1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        double voters , valid_voters , vote_X , vote_Y;
        
        System.out.println(" Enter the number of Voters. ");
        voters = in.nextDouble();
        
        valid_voters = ( 8 / 10 ) * voters ;
        vote_X = ( 6 / 10 ) * valid_voters ;
        vote_Y = ( 4 / 10 ) * valid_voters;
        
        System.out.println(" Number of votes for X = "+ vote_X);
        System.out.println("  Number of votes for Y = "+ vote_Y );
    }
}