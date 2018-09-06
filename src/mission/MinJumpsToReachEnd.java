package mission;

/**
 * Created by nehad on 29/7/18.
 */
public class MinJumpsToReachEnd {

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 6, 1, 0, 9};
        System.out.println("Min jumps required : " + minJumps(arr, 0, arr.length-1));
        System.out.println("Min jumps required using DP: " + minJumpsDP(arr));
        System.out.println("Min jumps required using DP 2: " + minJumpsDP2(arr));
    }

    private static int minJumps(int[] arr, int source, int target) {

        if (source == target)
            return 0;

        if (arr[source] == 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int i = 1; (source + i <= target) && i <= arr[source]; i++)
        {
            int jumps = minJumps(arr, source + i, target);
            if (jumps!= Integer.MAX_VALUE && (jumps +1) < min)
            {
                min = jumps + 1;
            }
        }

        return min;
    }

    //using dynamic programming
    private static int minJumpsDP(int[] arr)
    {
        int[] jumps = new int[arr.length];

        jumps[0] = 0;

        for (int i = 1; i < arr.length; i++)
        {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++)
            {
                if ((i <= j+ arr[j]) && (jumps[j] != Integer.MAX_VALUE))
                {
                    jumps[i] = jumps[j]+1;
                    break;
                }
            }
        }

        return jumps[arr.length-1];
    }

    //using DP from right to left
    private static int minJumpsDP2(int[] arr)
    {
        int[] jumps = new int[arr.length];
        jumps[arr.length-1] = 0;

        for (int i = arr.length - 2; i >=0; i--)
        {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = i+1; j < arr.length; j++) {
                if ((j <= arr[i] + i) && (jumps[j] != Integer.MAX_VALUE)) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                }
            }
        }

        return jumps[0];
    }

}
