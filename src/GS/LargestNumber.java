package GS;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by nehad on 19/7/18.
 */
public class LargestNumber {

    public static void main(String[] args)
    {
        Integer[] arr =  {544, 546, 548, 60, 600, 88, 99}; //{60, 600}; //
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = String.valueOf(o1) + String.valueOf(o2);
                String str2 = String.valueOf(o2) + String.valueOf(o1);
                return str2.compareTo(str1);
            }
        };

        Arrays.sort(arr, comparator);

        System.out.println("Sorted array is : " + Arrays.toString(arr));

        StringBuilder sb = new StringBuilder();
        for (Integer num : arr)
        {
            sb.append(num);
        }

        System.out.println("Largest num : " + sb.toString());

    }
}
