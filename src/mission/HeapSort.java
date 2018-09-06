package mission;

import java.util.Arrays;

/**
 * Created by nehad on 28/7/18.
 */
public class HeapSort {

    public static void main(String[] args)
    {
        int[] arr = {10,13,12,18,20,25,82,1,9,11};
        sort(arr);
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        //heapify
        for (int i = n/2-1; i>=0; i--)
        {
            heapify(arr, n, i);
        }

        //max heap is built
        //now extract max element each time and heapify
        int k = 4;
        for (int i = n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            if (k == 1)
                System.out.println("kth largest : " + arr[i]);
            k--;
            heapify(arr, i, 0);
        }
    }


    private static void heapify(int[] arr, int n, int pos)
    {
        int largest = pos;
        int left = 2*pos + 1;
        int right = 2*pos + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != pos)
        {
            int temp = arr[pos];
            arr[pos] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
