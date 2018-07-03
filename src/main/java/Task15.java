import java.util.Random;
import java.util.Scanner;

public class Task15
{
    static byte[][] num0 = {{0,0,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,0,1,1,0,0}};
    static byte[][] num1 = {{0,0,0,1,0,0},
                            {0,0,1,1,0,0},
                            {0,0,0,1,0,0},
                            {0,0,0,1,0,0},
                            {0,0,0,1,0,0},
                            {0,0,0,1,0,0},
                            {0,0,1,1,1,0}};
    static byte[][] num2 = {{0,0,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,0,0,0,1,0},
                            {0,0,0,1,0,0},
                            {0,0,1,0,0,0},
                            {0,1,0,0,0,0},
                            {0,1,1,1,1,0}};
    static byte[][] num3 = {{0,0,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,0,0,0,1,0},
                            {0,0,0,1,1,0},
                            {0,0,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,0,1,1,0,0}};
    static byte[][] num4 ={ {0,0,0,1,0,0},
                            {0,0,1,1,0,0},
                            {0,1,0,1,0,0},
                            {1,0,0,1,0,0},
                            {1,1,1,1,1,0},
                            {0,0,0,1,0,0},
                            {0,0,0,1,0,0}};
    static byte[][] num5 = {{0,1,1,1,1,0},
                            {0,1,0,0,0,0},
                            {0,1,0,0,0,0},
                            {0,1,1,1,0,0},
                            {0,0,0,0,1,0},
                            {0,0,0,0,1,0},
                            {0,1,1,1,0,0}};
    static byte[][] num6 = {{0,0,1,1,1,0},
                            {0,1,0,0,0,0},
                            {0,1,0,0,0,0},
                            {0,1,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,0,1,1,0,0}};
    static byte[][] num7 = {{0,1,1,1,1,0},
                            {0,0,0,0,1,0},
                            {0,0,0,0,1,0},
                            {0,0,0,1,0,0},
                            {0,0,1,0,0,0},
                            {0,0,1,0,0,0},
                            {0,0,1,0,0,0}};
    static byte[][] num8 = {{0,0,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,0,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,0,1,1,0,0}};
    static byte[][] num9 = {{0,0,1,1,0,0},
                            {0,1,0,0,1,0},
                            {0,1,0,0,1,0},
                            {0,0,1,1,1,0},
                            {0,0,0,0,1,0},
                            {0,0,0,0,1,0},
                            {0,0,1,1,0,0}};

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = in.next();
        //char c = '\u2B51';
        char c2 = ' ';
        char c = '*';
        for(int k = 0; k < 7;k++)
        {
            for(int i = 0; i < number.length(); i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    if(Select(number.charAt(i))[k][j]==1)System.out.print(c);
                    else System.out.print(c2);
                }
            }
            System.out.print("\n");
        }

    }

    static byte[][] Select(char c)
    {
        switch (c)
        {
            case '0': return num0;
            case '1': return num1;
            case '2': return num2;
            case '3': return num3;
            case '4': return num4;
            case '5': return num5;
            case '6': return num6;
            case '7': return num7;
            case '8': return num8;
            case '9': return num9;
            default: return num6;
        }
    }
}
