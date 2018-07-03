import java.util.Random;
import java.util.Scanner;

public class Task8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите A: ");
        int a = in.nextInt();
        System.out.println("Введите B: ");
        int b = in.nextInt();
        if(b>a)
        System.out.print(rand.nextInt((b-a)+1)+a);
        else System.out.print("B<=A");
    }
}
