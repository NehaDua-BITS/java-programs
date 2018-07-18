package GS;

/**
 * Created by nehad on 18/7/18.
 */

// Program to find n-th stair
// using step size 1 or 2 or 3.

public class ReachNthStep{

    // Returns count of ways to reach
    // n-th stair using 1 or 2 or 3 steps.
    public static int findStep(int n)
    {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;

        else
            return findStep(n - 3) +
                    findStep(n - 2) +
                    findStep(n - 1);
    }

    //using DP
    public static int findStepDP(int n)
    {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <=n ; i++)
            dp[i] = dp[n-1] + dp[n-2] + dp[n-3];

        return dp[n];
    }

    // Driver function
    public static void main(String argc[]){
        int n = 4;
        System.out.println(findStep(n));
        System.out.println("By DP : " + findStepDP(n));

    }
}

/* This code is contributed by Sagar Shukla */
