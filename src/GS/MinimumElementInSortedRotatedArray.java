package GS;

/**
 * Created by nehad on 19/7/18.
 */
public class MinimumElementInSortedRotatedArray
{
    public static void main(String[] args)
    {
        int[] arr = {5,6,9, 10,12, -3, -2, 0, 1, 3,4};

        System.out.println("Min element binary is : " + findMin(arr));
        System.out.println("Min element linear is : " + findMinLinear(arr));
    }

    //linear search
    private static int findMinLinear(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
                return arr[i+1];
        }

        return -1;
    }

    //binary search
    private static int findMin(int[] arr) {
        int low  = 0, high = arr.length - 1;

        while (low < high)
        {
            int mid = (low + high) / 2;

            if (mid > low && arr[mid] < arr[mid-1])
                return arr[mid];

            if (mid < high && arr[mid] > arr[mid+1])
                return arr[mid+1];

            if (arr[mid] < arr[high])
                high = mid-1;
            else
                low = mid + 1;
        }

        if (low == high)
            return arr[low];

        return -1;
    }
}
