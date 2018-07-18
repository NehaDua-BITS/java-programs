package GE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nehad on 14/7/18.
 */
public class RemoveVowels {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Entered string is : " + str);
        System.out.println("String after removing vowels is : " + new RemoveVowels().removeVowels(str));
    }

    private String removeVowels(String str)
    {
        Character[] arr = new Character[]{'a', 'e', 'i', 'o', 'u'};
        List<Character> vowels = Arrays.asList(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            if(!vowels.contains(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
