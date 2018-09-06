package GS;

/**
 * Created by nehad on 19/7/18.
 */
public class SmallestSumSubarray {

    public static void main(String[] args)
    {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int sum = 51;
        System.out.println("min length sub-array = " + getMinLength(arr, sum));
        System.out.println("min length sub-array better = " + getMinLengthBetter(arr, sum));

        int arr2[] = {1, 10, 5, 2, 7};
        System.out.println("min length sub-array = " + getMinLength(arr2, 9));
        System.out.println("min length sub-array better = " + getMinLengthBetter(arr2, 9));

        int arr3[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        System.out.println("min length sub-array = " + getMinLength(arr3, 280));
        System.out.println("min length sub-array better = " + getMinLengthBetter(arr3, 280));
    }

    //simple O(n^2)
    private static int getMinLength(int[] arr, int sum)
    {
        int minLen = arr.length + 1;

        for (int start = 0; start < arr.length; start++)
        {
            int total = 0;
            for (int end = start; end < arr.length; end++)
            {
                total += arr[end];
                if (total > sum)
                {
                    if (end - start + 1 < minLen)
                        minLen = end-start+1;

                    break;
                }
            }
        }

        return minLen;
    }

    private static int getMinLengthBetter(int[] arr, int sum)
    {
        int start = 0, end = 0;
        int total = 0;
        int minLength = arr.length + 1;

        while (end < arr.length)
        {
            while (total <= sum && end < arr.length)
                total += arr[end++];

            while (total > sum && start < arr.length)
            {
                if (end - start < minLength)
                    minLength = end-start;
                total -= arr[start++];
            }
        }

        return minLength;
    }
}
