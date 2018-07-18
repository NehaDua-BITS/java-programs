package GS;

import java.util.*;

/**
 * Created by nehad on 5/7/18.
 */
public class SecondSmallest
{
    public static void main(String[] args)
    {
        int[] array = new int[]{3,5,1,9,10,3,7,34,13,22};
        System.out.println("Second smallest element : " + new SecondSmallest().getSecondSmallestItem(array));

        HashMap<Character, List<Integer>> map = new HashMap<>();
        String str = "abcdeddecbafhjfi";
        for (int i = 0; i < str.length(); i++)
        {
            Character ch = str.charAt(i);
            if (map.containsKey(ch))
            {
                List<Integer> list = map.get(ch);
                list.set(1, list.get(1) + 1);
            }
            else
                map.put(ch, new ArrayList<>(Arrays.asList(i, 1)));
        }

        int min = str.length() + 1;
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet())
        {
            List<Integer> list = entry.getValue();
            if (list.get(1) == 1)
            {
                if (list.get(0) < min)
                    min = list.get(0);
            }
        }

        System.out.println("First non-repeating character : " + str.charAt(min));
    }

    private int getSecondSmallestItem(int[] arr)
    {
        int max1 = -1, max2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2)
                max2 = arr[i];
        }

        return max2;
    }
}