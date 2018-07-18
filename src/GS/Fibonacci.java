package GS;

/**
 * Created by nehad on 4/7/18.
 */
public class Fibonacci {

    public static void main(String[] args)
    {
        int num = 8;

        System.out.println("Fibonnaci no. recursive : " + new Fibonacci().getFibonacci(num));

        System.out.println("Fibonnaci no. iterative : " + new Fibonacci().fibonacciIterative(num));
    }

    private int getFibonacci(int num)
    {
        if (num <= 1)
            return num;

        return getFibonacci(num - 1) + getFibonacci(num - 2);
    }

    private int fibonacciIterative(int num)
    {
        int f0 = 0, f1 = 1;
        if (num <= 1)
            return num;

        int sum = -1;
        for (int i = 2; i <= num; i++)
        {
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
        }

        return sum;
    }
}
