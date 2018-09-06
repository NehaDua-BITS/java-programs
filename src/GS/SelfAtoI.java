package GS;

/**
 * Created by nehad on 7/8/18.
 */
public class SelfAtoI {
    public static void main(String[] args)
    {
        String str = "12333";
        int num = atoi(str);

        System.out.println("String = " + str + " Number = " + num);
    }

    private static int atoi(String str)
    {
        if (str == null || str.length() == 0)
            return 0;

        int num = 0;
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            isNegative = true;
        }

        for (int i = isNegative ? 1 : 0; i < str.length(); i++)
        {
            if (!(str.charAt(i) >= '0' && str.charAt(i)<='9'))
                return 0;

            num = num*10 +  (str.charAt(i) - '0');
        }

        return num * (isNegative ? -1 : 1);
    }
}

