import java.util.Random;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[] mass = new int[10];
        for(int i = 0; i < 10;i++)
        {
            mass[i] = rand.nextInt(100);
        }
        for (int i: mass)
        {
            System.out.print(i + " ");
        }
        sort(mass);
        System.out.print("\n");
        for (int i: mass)
        {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
