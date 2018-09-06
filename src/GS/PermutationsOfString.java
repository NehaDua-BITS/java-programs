package GS;

/**
 * Created by nehad on 19/7/18.
 */
public class PermutationsOfString {

    public static void main(String[] args)
    {
        String str = "ABCD";
        printPermutationsOfString(str);
    }

    private static void printPermutationsOfString(String str) {
        printPermutationsOfStringRec(str, 0, str.length()-1);
    }

    private static void printPermutationsOfStringRec(String str, int start, int end) {

        if (start >= end)
        {
            System.out.println(str);
            return;
        }

        for (int i = start; i <= end ; i++)
        {
            String newStr = swap(str, start, i);
            //System.out.println("newStr = " + newStr + " i = " + i + " start = " + start);
            printPermutationsOfStringRec(newStr, start+1, end);
        }
    }

    private static String swap(String str, int start, int i) {
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(i));
        sb.setCharAt(i, temp);
        return sb.toString();
    }


}
