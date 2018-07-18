package GS;

import java.util.Scanner;

/**
 * Created by nehad on 4/7/18.
 */
public class SquareRoot {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("Entered number is : " + num);

        int i = 2;
        for (; i*i <= num; i++);

        System.out.println("Square Root of " + num + " is : " + (i-1));

        System.out.println("Square root using binary search : " + new SquareRoot().squareRootUsingBinarySearch(num));
    }

    private int squareRootUsingBinarySearch(int num)
    {
        if (num <= 1)
            return num;

        int low = 1;
        int high = num;
        int mid = -1;

        while(low <= high)
        {
            mid = (low + high) / 2;
            int result = mid * mid;

            if (result == num)
                return mid;
            else if (result < num)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return (mid * mid) > num ? mid-1 : mid;
    }
}
