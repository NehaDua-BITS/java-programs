package GS;

/**
 * Created by nehad on 6/7/18.
 */

import java.util.Scanner;

public class MergeStrings {

    private String mergeStrings(String s1, String s2)
    {
        if (s1 == null || s1.length() == 0)
            return s2;
        if (s2 == null || s2.length() == 0)
            return s1;

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        char[] result = new char[s1Array.length + s2Array.length];

        int i = 0, j = 0 , k = 0;
        boolean first = true;
        while(i < s1Array.length && j < s2Array.length)
        {
            result[k++] = first ? s1Array[i++] : s2Array[j++];
            first = !first;
        }

        while(i < s1Array.length)
            result[k++] = s1Array[i++];

        while(j < s2Array.length)
            result[k++] = s2Array[j++];

        return new String(result);
    }

    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        MergeStrings obj = new MergeStrings();
        for (int i = 0; i < N; i++)
        {
            String str = scanner.nextLine();
            String[] arr = str.split("\\s");
            System.out.print(obj.mergeStrings(arr[0], arr[1]));
            if ( i < N-1)
                System.out.println();
        }
    }
}