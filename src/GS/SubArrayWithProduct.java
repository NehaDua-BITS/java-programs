package GS;

/**
 * Created by nehad on 19/7/18.
 */
public class SubArrayWithProduct {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        int k = 10;

        System.out.println("No.of sub arrays with product less than k : " + getNumOfArrays(arr, k));

       int[] arr2 = {1, 9, 2,8,6,4,3};
        System.out.println("No.of sub arrays with product less than k : " + getNumOfArrays(arr2, 100));
    }

    private static int getNumOfArrays(int[] arr, int k) {
        int product = 1;
        int n = arr.length;
        int count = 0;

        for (int start = 0, end = 0; end < n; end++)
        {
            product *= arr[end];

            while (start < n && product >= k)
                product /= arr[start++];

            if (product < k)
            {
                count += end-start+1;
            }
        }

        return count;
    }
}
