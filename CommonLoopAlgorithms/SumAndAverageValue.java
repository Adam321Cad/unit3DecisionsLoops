import java.util.Scanner;

public class SumAndAverageValue
{

    private int x;


    public SumAndAverageValue()
    {

        x = 0;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter multiple numbers or 'q' to quit. ");
        
        
        double total = 0;
        int count = 0;
        
        while (in.hasNextDouble()){
            Double value = in.nextDouble();
            total += value;
            count++;
        }
        
        double average = total /count;
        
        System.out.println("Total; " +total + "Average: " + average);
        
    }
            
        
}
