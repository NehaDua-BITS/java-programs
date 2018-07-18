package GS;

/**
 * Created by nehad on 6/7/18.
 */

import java.util.*;

class FirstRepeatedCharacter {
    private void printFirstRepeatingChar(String str)
    {
        if (str == null || str.length() <= 1)
        {
            System.out.print(-1);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
        {
            Character ch = str.charAt(i);
            if (ch == ' ')
                continue;

            if (map.containsKey(ch))
            {
                Integer count = map.get(ch);
                map.put(ch, count + 1);
            }
            else
                map.put(ch, 1);
        }

        for (int i = 0; i < str.length(); i++)
        {
            if (map.get(str.charAt(i)) > 1)
            {
                System.out.print(str.charAt(i));
                return;
            }

        }

        System.out.print(-1);
    }

    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        FirstRepeatedCharacter obj = new FirstRepeatedCharacter();

        for (int i = 0; i < N; i++)
        {
            String str = scanner.nextLine();
            obj.printFirstRepeatingChar(str);
            if (i < N-1)
                System.out.println();
        }
    }
}
