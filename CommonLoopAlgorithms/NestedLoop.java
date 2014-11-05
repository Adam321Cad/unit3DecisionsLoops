
public class NestedLoop
{

    public static void main(String[] args)
    {
        int x = 1;
        int y = 1;
         do {
             y = 1;
         do{
             System.out.println(x+" "+y);
             y++;
            }while (y <5);
        x++;
        }while ( x<3);
    }
}
