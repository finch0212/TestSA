package Practice1;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 1000; i++)
        {
            int c = 0;
            for(int j = 1; j < i; j++)
            {
                if(i%j==0) c++;
            }
            if(c==1) System.out.print(i + " ");
        }
    }
}