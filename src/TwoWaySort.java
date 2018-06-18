import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by nehad on 15/6/18.
 */
public class TwoWaySort
{
    private Integer[] arr;

    public TwoWaySort(Integer[] arr)
    {
        this.arr = arr;
    }

    public static void main(String[] args)
    {
        TwoWaySort twoWaySort = new TwoWaySort(new Integer[]{10,8,5,3,12,1,2,13, 4,25});
        System.out.println("Array is : " + Arrays.toString(twoWaySort.arr));

        twoWaySort.sortArrayUsingPartitioning();

        twoWaySort = new TwoWaySort(new Integer[]{6,9,10,12,8,15,18,16,11,22,2,3,1});
        twoWaySort.sortArrayUsingNegativeMultiplication();
    }

    public void sortArrayUsingNegativeMultiplication()
    {
        int length = arr.length;
        System.out.println("the length of array = " + length);

        for (int i = 0; i < length; i++)
        {
            if (arr[i]%2 != 0) //if odd make negative
            {
                arr[i] = arr[i] * -1;
            }
        }

        Arrays.sort(arr);
        System.out.println("sorted array : " + Arrays.toString(arr));

        for (int i = 0; i < length; i++)
        {
            if (arr[i] <= 0)
                arr[i] = arr[i] * -1;
            else
                break;
        }

        System.out.println("Final sorted array : " + Arrays.toString(arr));
    }

    public void sortArrayUsingPartitioning()
    {
        Integer numOfOdds = partitionArrayIntoOddEven();
        System.out.println("Array after partitioning is : " + Arrays.toString(arr));
        System.out.println("no. of odds = " + numOfOdds);

        Arrays.sort(arr, 0, numOfOdds, Collections.reverseOrder());
        System.out.println("Sorted Odd no.s (desc): " + Arrays.toString(arr));

        Arrays.sort(arr, numOfOdds, arr.length);
        System.out.println("Sorted Even no.s also (asc): " + Arrays.toString(arr));

    }

    private int partitionArrayIntoOddEven()
    {
        Integer numOfOdds = 0;
        for (int l = 0, r = arr.length - 1; l < r && r < arr.length; l++,r--) {
            //find first even no. on left
            while (arr[l] % 2 != 0 && (l < r))
            {
                numOfOdds++;
                l++;
            }

            //find first odd no. on right
            while(this.arr[r]%2 == 0 && (r > l))
                r--;

            //swap odd and even no.s
            if(l < r)
            {
                numOfOdds++;
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        return numOfOdds;
    }
}
