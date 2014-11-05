import java.util.Random;

public class MontyHall
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int door1 = 0;
        int door2=0;
        int door3=0;
        int pick = 0;
        int counter1 = 0;
        for ( int i =0; i<1000;i++)
        {
            counter1 = 0;
            pick = r.nextInt(3)+1;
            door1 = r.nextInt(2)+1;
            door2 = r.nextInt(2)+1;
            door3 = r.nextInt(2)+1;
            // if ((door1 == door2 && (door1 == 2)) ||( door1
            if (door1 == 1){
                counter1 +=1;
            }
            if (door2 == 1){
                counter1 +=1;
            }
            if (door3 == 1){
                counter1 +=1;
            }
            if (counter1 >1){
                while (counter1 !=1){
                    counter1 = counter1 - 1;
                    int counter = r.nextInt(2)+1;
                    if (counter == 1){
                        door1 = 2;
                    }
                    if (counter == 2){
                        door2 = 2;
                    }
                    if (counter == 3){
                        door3 =2;
                    }
                }

            }
            System.out.println(door1+" "+door2+" "+door3);
        }
    }
}