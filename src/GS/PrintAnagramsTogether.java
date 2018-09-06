package GS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nehad on 19/7/18.
 */
public class PrintAnagramsTogether {

    public static void main (String[] args)
    {
        String[] words = new String[]{"cat", "dog", "tac", "god", "act", "ahen", "dua", "neha"};
        HashMap<String, List<String>> multimap = new HashMap<String, List<String>>();

        for (int i = 0; i < words.length; i++) {
            String str = getKey(words[i]);

            if (multimap.containsKey(str))
                multimap.get(str).add(words[i]);
            else
            {
                List<String> list = new ArrayList<>();
                list.add(words[i]);
                multimap.put(str, list);
            }
        }

        System.out.println("Map is : " + multimap);

        for (int i = 0; i < words.length; i++)
        {
            String key = getKey(words[i]);
            if (multimap.containsKey(key))
            {
                List<String> list = multimap.get(key);
                for(String word : list)
                    System.out.print(word + " ");

                multimap.remove(key);
            }
        }
    }

    private static String getKey(String str)
    {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);
    }
}
