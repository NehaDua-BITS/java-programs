package GS;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nehad on 18/7/18.
 */
public class FindNthClosingParenthesis {

    public static void main(String[] args)
    {
        System.out.println("Enter string : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Entered string is : " + str);

        System.out.println("Enter N : ");
        int N = scanner.nextInt();
        System.out.println("N is : " + N);

        System.out.println("Closing parenthesis index is : " + findPosition(str, N));
    }

    private static int findPosition(String str, int N)
    {
        int count  = 0;
        int i = 0;
        for (; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                count++;
            if (count == N)
                break;
        }

        //System.out.println("left position = " + i);

        if (count == N)
        {
            Stack<Character> stack = new Stack<>();
            stack.push('(');
            for (int j = i+1; j < str.length(); j++)
            {
                //System.out.println("char is : "+ str.charAt(j));
                if (str.charAt(j) == '(')
                    stack.push('(');
                else if (str.charAt(j) == ')') {
                    if (stack.isEmpty()) //if unbalanced
                        return -1;
                    stack.pop();
                    if (stack.isEmpty())  //if found
                        return j;
                }
            }
        }

        return -1;
    }

}
