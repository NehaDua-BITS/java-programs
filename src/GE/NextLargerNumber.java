package GE;

/**
 * Created by nehad on 15/7/18.
 */
import java.util.*;

public class NextLargerNumber {

    // Driver Program
    public static void main(String args[])
    {
        int num = 12345;
        System.out.println(nextGreaterNum(num));
    }

    private static String nextGreaterNum(int num)
    {
        String numString = String.valueOf(num);
        char[] chars = numString.toCharArray();

        int pos = -1;
        for (int i = chars.length - 2; i >=0 ; i--)
        {
            if (chars[i] < chars[i+1])
            {pos = i;
                break;}
        }

        if (pos == -1)
        {
            System.out.println("not possible");
            return null;
        }

        int minIndex = -1;
        for (int i = pos+1; i < chars.length; i++)
        {
            if (chars[i] > chars[pos] && (minIndex == -1 || chars[i] < chars[minIndex]))
            {
                minIndex = i;
            }
        }

        char temp = chars[minIndex];
        chars[minIndex] = chars[pos];
        chars[pos] = temp;

        Arrays.sort(chars, pos+1, chars.length);

        return String.valueOf(chars);
    }


}
// This code is contributed by Sumit Ghosh
