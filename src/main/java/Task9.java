import java.util.Random;
import java.util.Scanner;

public class Task9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите Строку: ");
        String str = in.next();
        System.out.println("Введите число: ");
        int n = in.nextInt();
        str = str.substring(0, n-1) + str.substring(n);

        System.out.println(str);
    }
}
