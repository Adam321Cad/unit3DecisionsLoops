import java.util.Scanner;

public class FindFirstMatch
{
    
    private int x;

    
    public FindFirstMatch()
    {
        
        x = 0;
    }

    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string. ");
        String str=in.nextLine();
        
        boolean found = false;
        int index = 0;
        
        while(!found && index < str.length())
        {
            char ch = str.charAt(index);
            if (ch == ' ')
            {
                found = true;
                break;
            }
            index++;
        }
        if (found)
        {
            System.out.println("Index of first space: " + index);
        }

    }
}
