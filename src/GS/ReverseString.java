package GS;

import java.util.Scanner;

/**
 * Created by nehad on 4/7/18.
 */
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        System.out.println("Entered string is : " + input);

        ReverseString obj = new ReverseString();
        System.out.println("Reversed string is : " + obj.reverseUsingBytes(input));

        System.out.println("Reversed string using string builder : " + obj.reverseStringUsingStringBuilder(input));

        System.out.println("Reversed string using string buffer : " + obj.reverseStringUsingStringBuffer(input));

        System.out.println("Reversed string using string recursion : " + obj.reverseStringUsingRecursion(input));

        System.out.println("Reversed string using char array : " + obj.reverseStringUsingCharArray(input));

        System.out.println("Reversed words in string : ");
        obj.reverseWordsInString(input);
    }

    private String reverseUsingBytes(String input)
    {
        byte[] bytes = input.getBytes();
        byte[] reversedBytes = new byte[bytes.length];
        int j = 0;
        for (int i = bytes.length-1; i >= 0; i--)
            reversedBytes[j++] = bytes[i];

        return new String(reversedBytes);
    }

    private String reverseStringUsingStringBuilder(String str)
    {
        StringBuilder stringBuilder = new StringBuilder(str);
        String result = stringBuilder.reverse().toString();
        return result;
    }

    private String reverseStringUsingStringBuffer(String str)
    {
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    private String reverseStringUsingRecursion(String str)
    {
        if (str == null || (str.length() <= 1))
            return str;

        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);

        //return str.charAt(str.length()-1) + reverseStringUsingRecursion(str.substring(0, str.length()-1));
    }

    private String reverseStringUsingCharArray(String str)
    {
        char[] charArray = str.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--)
        {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }

    private void reverseWordsInString(String str)
    {
        String[] words = str.split(" ");
        System.out.println("length : " + words.length);
        for (int i = words.length-1; i >= 0; i--)
            System.out.print(words[i]);
    }
}
