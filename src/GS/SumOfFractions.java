package GS;

import java.util.Scanner;

/**
 * Created by nehad on 19/7/18.
 */
public class SumOfFractions
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fraction 1 : ");
        String[] fraction1 = scanner.nextLine().split("/");

        System.out.println("Enter fraction 2 : ");
        String[] fraction2 = scanner.nextLine().split("/");

        int num1 = Integer.valueOf(fraction1[0]);
        int den1 = Integer.valueOf(fraction1[1]);

        int num2 = Integer.valueOf(fraction2[0]);
        int den2 = Integer.valueOf(fraction2[1]);

        int den = lcm(den1, den2);

        int sum = (num1 * (den/den1)) + (num2 * (den/den2));

        int hcf = hcf(den, sum);

        System.out.println("Answer : " + (sum/hcf) + "/" + (den/hcf));

    }

    private static int hcf(int x, int y)
    {
        if (x == 0)
            return y;
        return hcf(y % x, x);
    }

    private static int lcm(int x, int y)
    {
        return (x * y) / hcf(x, y);
    }

}
