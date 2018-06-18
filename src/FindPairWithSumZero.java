import java.util.Arrays;

/**
 * Created by nehad on 16/6/18.
 */
public class FindPairWithSumZero {

    public static void main(String[] args)
    {
        int[] arr = new int[]{60, -10, 70, -80, -2, -1, 85, -6};
        System.out.println("Original Array : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));

        int sum;
        int minL = -1, minR = -1;
        int l = 0, r = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        while(l < r)
        {
            sum = arr[l] + arr[r];
            if (Math.abs(sum) < Math.abs(minSum))
            {
                minSum = sum;
                minL = l;
                minR = r;
            }

            if (sum < 0)
                l++;
            else
                r--;
        }

        System.out.println("Pair : (" + arr[minL] + " , " + arr[minR] + ") Sum = " + minSum);

    }
}
