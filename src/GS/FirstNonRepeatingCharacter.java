package GS;

/**
 * Created by nehad on 19/7/18.
 */

class CountIndexPair
{
    int count;
    int index;

    public CountIndexPair(int count, int index)
    {
        this.count = count;
        this.index = index;
    }

    public void incCount()
    {
        count++;
    }
}

public class FirstNonRepeatingCharacter {

    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println("First non-repeating char : ");
        int index = getFirstNonRepeatingChar(str);
        if (index >= str.length())
            System.out.println("-1");
        else {
            Character ch = str.charAt(index);
            System.out.println(ch);
        }

        CountIndexPair pair = getNonRepeatingChar(str);
        System.out.println(pair.index);
        System.out.println("First non-repeating char : " + (pair == null ? -1 : str.charAt(pair.index)));
    }

    private static int getFirstNonRepeatingChar(String str)
    {
        int length = str.length();
        int[][] charArray = new int[256][2];

        for (int i = 0; i < length; i++)
        {
            if (charArray[str.charAt(i)][0] == 0)
                charArray[str.charAt(i)][1] = i;
            charArray[str.charAt(i)][0]++;
        }

        int index = length + 1;
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i][0] == 1 && charArray[i][1] < index)
                index = charArray[i][1];
        }

        return index;
    }

    private static CountIndexPair getNonRepeatingChar(String str)
    {
        CountIndexPair[] charArray = new CountIndexPair[256];
        for (int i = 0; i < str.length(); i++)
        {
            if (charArray[i] == null)
            {
                charArray[i] = new CountIndexPair(1, i);
            }
            else
            {
                charArray[i].incCount();
            }
        }

        CountIndexPair pair = null;
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] != null && charArray[i].count == 1 && (pair == null || charArray[i].index < pair.index))
                pair = charArray[i];
        }

        return pair;
    }
}
