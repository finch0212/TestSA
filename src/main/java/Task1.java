import java.util.*;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();
        int[] mass = new int[n];
        for(int i = 0; i < n;i++)
        {
            mass[i] = rand.nextInt(100);
        }

        for (int i: mass)
        {
            System.out.print(i + " ");
        }

        for(int i = 0; i < n/2;i++)
        {
            int tmp = mass[i];
            mass[i] = mass[n-1-i];
            mass[n-1-i] = tmp;
        }
        System.out.print("\n");
        for (int i: mass)
        {
            System.out.print(i + " ");
        }
    }
}