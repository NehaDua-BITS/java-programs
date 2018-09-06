package mission;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by nehad on 27/7/18.
 */
public class Power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = scanner.nextInt();
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        System.out.println("x = " + x + " n = " + n);

        System.out.println("Power is = " + power(x, n));
        System.out.println("Iterative power is = " + power(x, n));

    }


    private static long power(int x, int n) {
        if ((n == 0) || (x == 1))
            return 1;
        else if (n == 1)
            return x;

        long val = power(x, n / 2);
        if (n % 2 == 0)
            return val * val;
        else
            return val * val * x;
    }

    private static float iterativePower(int x, int n) {
        int res = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                res *= x;
            }
            n >>= 1;
            x *= x;
        }

        return res;
    }

}

