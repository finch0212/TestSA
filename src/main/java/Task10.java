import java.util.Random;
import java.util.Scanner;

public class Task10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        Random rand = new Random();
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();
        float[] mass = new float[n];
        for (int i = 0; i < n; i++){
            mass[i] = rand.nextInt(100);
            mass[i] += rand.nextFloat();
        }
        while(!exit)
        {
            System.out.println("КОМАНДЫ:\n1. Вывести массив.\n2. Увеличить элемент массива на 10%.\n3. Выход");
            int command = in.nextInt();
            if(command==1)
            {
                System.out.print("Mассив: ");
                for (float i: mass
                        ) {
                    System.out.print(i + " | ");
                }
                System.out.println();
            }
            else if(command==2)
            {
                System.out.print("Введите номер элемента: ");
                int a = in.nextInt();
                if(a<=n) mass[a-1] = mass[a-1]*1.1f;
                System.out.println(a + "й элемент увеличен.");
            }
            else if(command==3)
            {
                System.out.print("Выход из программы.");
                break;
            }
            else
            {
                System.out.println("Введите верную команду.");
            }
        }

    }
}