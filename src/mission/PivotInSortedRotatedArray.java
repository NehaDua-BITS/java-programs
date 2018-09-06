package mission;

import java.util.Arrays;

/**
 * Created by nehad on 27/7/18.
 */
public class PivotInSortedRotatedArray {

    public static void main(String[] args)
    {
        int[] arr = {5,6,7,8,9,10,15,16,17,18,19,20,50, -2, 2,3,4};
        System.out.println("Array is : " + Arrays.toString(arr));

        //Linear Search
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length -1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                System.out.println("Pivot is : " + arr[i+1] + " Found in time : " + (System.nanoTime() - startTime));
                break;
            }
        }

        startTime = System.nanoTime();
        int pivot = binarySearchPivot(arr);
        System.out.println("Binary Search Pivot is : " + pivot + " Found in time : " + (System.nanoTime() - startTime));
    }

    private static int binarySearchPivot(int[] arr)
    {
        //Binary Search
        int low = 0, high = arr.length - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if (mid > 0 && arr[mid] < arr[mid-1])
                return arr[mid];
            else if ((mid < arr.length -1) && arr[mid] > arr[mid+1])
                return arr[mid+1];
            else
            {
                if (arr[mid] > arr[arr.length-1])
                    low = mid+1;
                else
                    high = mid-1;
            }

        }

        return -1;
    }
}
