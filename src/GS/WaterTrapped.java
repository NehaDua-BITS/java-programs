package GS;

/**
 * Created by nehad on 19/7/18.
 */
public class WaterTrapped
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int total = 0;
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];

        left[0] = arr[0];
        for (int i = 1; i < length; i++)
        {
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[length-1] = arr[length-1];
        for (int i = length - 2; i >= 0; i--)
        {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        for (int i = 0; i < length; i++)
        {
            total += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println("total water trapped = " + total);
    }
}
