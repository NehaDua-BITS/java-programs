package GS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by nehad on 18/7/18.
 */
public class Catalog {

    public static void main(String[] args)
    {
        int[] oldCatalog  = new int[]{ 10, 11, 14, 15, 16};
        int[] newCatalog =  new int[]{ 10, 12 , 13, 14, 15, 17, 18, 16 };

        int[] positions = getPositions(oldCatalog, newCatalog);
        System.out.println("Positions are : " + Arrays.toString(positions));
    }

    public static int[] getPositions(int[] oldCatalog, int[] newCatalog)
    {
        int[] positions = new int[oldCatalog.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < newCatalog.length; i++)
        {
            map.put(newCatalog[i], i);
        }

        for (int i = 0; i < oldCatalog.length; i++)
        {
            if(map.containsKey(oldCatalog[i]))
                positions[i] = map.get(oldCatalog[i]) - i;
            else
                positions[i] = -1;
        }

        return positions;
    }
}
