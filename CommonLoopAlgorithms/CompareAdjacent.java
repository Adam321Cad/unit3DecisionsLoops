import java.util.Scanner;

public class CompareAdjacent
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit) ");
        double prevValue = in.nextDouble();
        final double EPSILON = 1e-7;
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if(Math.abs(value - prevValue) < EPSILON)
            {
                System.out.println("Duplicate number");
            }
            
            prevValue = value;
        }
    }

}
