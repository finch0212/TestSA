package Practice1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Task7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int n = in.nextInt();
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(new Long(0));
        arr.add(new Long(1));
        for(int i = 2; i < n; i++)
        {
            arr.add(arr.get(i-1) + arr.get(i-2));
        }
        for(Long i : arr) {
            System.out.println(i + " ");
        }


    }
}
