import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String n = in.next();
        boolean pol = true;

        for(int i = 0; i < n.length()/2; i++)
        {
            if(n.charAt(i) == n.charAt(n.length()-1-i))
            {
                continue;
            }
            else
                {
                    pol = false;
                    break;
                }
        }

        if(pol == true)
        {
            System.out.println("Палиндром!");
        }
        else
        {
            System.out.println("Не палиндром!");
        }



    }
}
