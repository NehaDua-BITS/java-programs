package Adobe;

import java.util.Scanner;

/**
 * Created by nehad on 17/7/18.
 */
public class BinaryToDecimal {

    public static void main(String[] args)
    {
        String binary;
        Scanner scanner = new Scanner(System.in);
        while (!(binary = scanner.nextLine()).equals("end"))
        {
            System.out.println("Binary for " + binary + " = " + toDecimal(binary));
        }
    }

    public static int toDecimal(String binary)
    {
        int num = 0;
        int powerOfTwo = 1;

        for (int i = binary.length() - 1; i >= 0; i--)
        {
            int val = binary.charAt(i) - '0';
            num += val * powerOfTwo;
            powerOfTwo *= 2;
        }

        return num;
    }
}
