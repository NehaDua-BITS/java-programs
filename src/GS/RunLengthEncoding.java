package GS;

/**
 * Created by nehad on 8/8/18.
 */
public class RunLengthEncoding {

    public static void main(String[] args)
    {
        String str = "aaabbccccddee";
        System.out.println("Run length encoding of string : " + getRunLengthEncoding(str));

    }

    private static String getRunLengthEncoding(String str)
    {
        if (str == null || str.length() == 0)
            return str;

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++)
        {
            if (i < str.length() && (str.charAt(i) == str.charAt(i-1)))
            {
                count++;
            }
            else
            {
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }

        return sb.toString();
    }
}
