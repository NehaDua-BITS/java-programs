package Adobe;

import java.util.Scanner;

/**
 * Created by nehad on 17/7/18.
 */
public class CountSetBits {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        while ((num = scanner.nextInt()) != -1)
        {
            System.out.println("Num =  " + num);
            System.out.println("Set bits = " + countSetBits(num));
            System.out.println("Set bits using algo = " + brianAlgoCountBits(num));
        }
    }

    public static int countSetBits(int num)
    {
        int count = 0;
        while (num > 0)
        {
            if ((num & 1) == 1)
                count++;
            num >>= 1;
        }

        return count;
    }

    //Brian Kernighan’s Algorithm
    //uses logic that when n-1 is done, it toggles all bits from right to left till rightmost 1 is encountered (including that)
    public static int brianAlgoCountBits(int num)
    {
        int count = 0;
        while (num > 0)
        {
            num &= num - 1;
            count++;
        }

        return count;
    }

}
