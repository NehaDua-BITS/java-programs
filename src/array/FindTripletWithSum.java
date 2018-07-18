package array;

import java.util.Arrays;

/**
 * Created by nehad on 22/6/18.
 */
public class FindTripletWithSum {

    public static void main(String[] args)
    {
        int[] arr = new int[]{12,3,4,1,6,9};
        int sum = 24;
        boolean found = false;

        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 2; i++)
        {
            int subsum = sum - arr[i];
            for (int l = i + 1, r = arr.length - 1; l < r;)
            {
                if (arr[l] + arr[r] == subsum)
                {
                    System.out.println("Triplet found : ( " + arr[i] + " , " + arr[l] + " , " + arr[r] + " )");
                    found = true;
                    break;
                }
                else if (arr[l] + arr[r] < subsum)
                    l++;
                else if (arr[l] + arr[r] > subsum)
                    r--;
            }

            if (found)  break;
        }

        if (!found)
        {
            System.out.println("Triplet not found");
        }
    }
}
