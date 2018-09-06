package mission;

/**
 * Created by nehad on 28/7/18.
 */
public class MaxSongsInTime {

    public static void main(String[] args)
    {
        int[] arr = {2,4,3,5,5,1,4};
        int time = 20;

        System.out.println("Max no. of songs that can be played : " + getMaxSongs(arr, time));
    }

    private static int getMaxSongs(int[] arr, int time)
    {
        int sum = 0, maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if ((sum + arr[i]) <= time)
            {
                sum += arr[i];
                count++;
            }
            else if (sum > 0)
            {
                sum = sum - arr[i-count] + arr[i];
            }
            System.out.println("i is " + i + " sum = " + sum);
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

}
