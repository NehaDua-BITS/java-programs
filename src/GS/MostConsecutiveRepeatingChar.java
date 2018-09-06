package GS;

/**
 * Created by nehad on 19/7/18.
 */
public class MostConsecutiveRepeatingChar {

    public static void main(String[] args)
    {
        String str = "abccccdddeeeeee";
        System.out.println("Most consecutive repeating character : ");
        find(str);
    }

    private static void find(String str)
    {
        int max = 1;
        int index = -1;
        char prev = str.charAt(0);
        int count = 1;
        int i = 1;
        while (i < str.length())
        {
            while(i < str.length() && str.charAt(i) ==  prev)
            {
                count++;
                i++;
            }

            if (count > max)
            {
                max = count;
                index = i-1;
            }

            if (i < str.length()) {
                prev = str.charAt(i);
                count = 1;
            }

            i++;
        }

        System.out.println(index == -1 ? -1 : String.valueOf(str.charAt(index)));
    }
}
