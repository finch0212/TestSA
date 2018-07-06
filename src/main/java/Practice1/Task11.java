package Practice1;

import java.util.Random;
import java.util.Scanner;

public class Task11
{
    public static void main(String[] args)
    {
        char[] mass= new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        char c = mass[rand.nextInt(23)];
        System.out.print("буквa: " + c);
        String str = "";
        char otv = '7';
        while(c != otv)
        {
            System.out.print("Введите букву: ");
            str = in.next();
            str = str.toUpperCase();
            otv = str.charAt(0);
            System.out.println();
            if (c != otv)
            {
                System.out.print("Неверный ответ! Попробуйте еще: ");
            }
        }
        System.out.println("Правильный ответ! Поздравляем!");
    }
}