import java.util.HashMap;

/**
 * Created by nehad on 16/6/18.
 */
public class FindPairWithGivenSum {

    public static void main(String[] args)
    {
        int sum = 16;
        int[] arr = new int[]{1, 4, 45, 6, -6, 10, 12, 22};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            int anotherNum = sum - arr[i];
            if (hashMap.containsKey(anotherNum))
            {
                System.out.println("Pair : " + arr[i] + " " + anotherNum);
            }
            hashMap.put(arr[i], 1);
        }
    }
}
