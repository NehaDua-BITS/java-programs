package GS;

import java.util.Scanner;

/**
 * Created by nehad on 18/7/18.
 */
public class DistanceBetweenWords {

    public static void main(String[] args)
    {
        System.out.println("Enter contents : ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        System.out.println("Enter words : ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println("Distance between words : " + findDistance(data, word1, word2));
    }

    private static int findDistance(String data, String word1, String word2)
    {
        int index1 = data.indexOf(word1);
        int index2 = data.indexOf(word2);
        System.out.println("index 1 = " + index1 + " index 2  = " + index2);
        int count = Math.abs(index2 - index1);
        return count == 0 ? 0 : count - 1;
    }
}
