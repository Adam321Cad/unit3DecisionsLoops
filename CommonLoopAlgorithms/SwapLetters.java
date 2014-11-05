import java.util.Random;
import java.util.Scanner;

public class SwapLetters
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String a = s.nextLine();
        Random r = new Random();
        int pos = 0;
        int pos2 = 0;
        String sub = "";
        String sub2 = "";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        for (int x = 0; x<=a.length(); x++){
            
        do{
            pos = r.nextInt(a.length());
            pos2 = r.nextInt(a.length());
        } while(pos2<=pos || pos2 == 0 || pos == 0);
            sub = a.substring(pos-1,pos);
            sub2 = a.substring(pos2-1, pos2);
            
            s1 = a.substring(0,pos-1);
            s2 = a.substring(pos,pos2-1);
            s3 = a.substring(pos2,a.length());
            //System.out.println(s1+sub+s2+sub2+s3);
            a = s1+sub2+s2+sub+s3;
            //System.out.println(a);
        }
        System.out.println(a);
    }

}
