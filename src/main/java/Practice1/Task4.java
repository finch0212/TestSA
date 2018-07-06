package Practice1;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String n = in.next();
        int res = 0;
        for(int i = 0; i < n.length(); i++)
        {
            res += Integer.parseInt("" + n.charAt(i));
        }
        System.out.println("Сумма чисел: " + res);



    }
}
