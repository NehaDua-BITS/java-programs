package mission;

import java.util.Arrays;

/**
 * Created by nehad on 29/7/18.
 */
class MaxSumPath
{
    int max;
}

public class MaxSumPathRightTriangle {

    static int[] rowMoves = {1, 1};
    static int[] colMoves = {0, 1};

    public static void main(String[] args)
    {
        int[][] triangle = {{1}, {1,2}, {4,1,2}, {2,3,1,1}};
        System.out.println("Max sum path = " + findMaxSumPath(triangle));

        triangle = new int[][]{{1}, {1,2}, {4,1,2}, {2,3,1,1}};
        System.out.println("Max sum path using backtracking = " + findMaxSumUsingBacktracking(triangle));

        triangle = new int[][]{{2}, {4,1}, {1,2,7}};
        System.out.println("Max sum path = " + findMaxSumPath(triangle));

        triangle = new int[][]{{2}, {4,1}, {1,2,7}};
        System.out.println("Max sum path using backtracking = " + findMaxSumUsingBacktracking(triangle));
    }

    private static int findMaxSumPath(int[][] triangle) {
        int max = -1;

        for (int i = 1; i < triangle.length; i++)
        {
            triangle[i][0] += triangle[i-1][0];
            triangle[i][i] += triangle[i-1][i-1];

            for (int j = 1; j < i; j++)
            {
                triangle[i][j] = Math.max(triangle[i][j] + triangle[i-1][j], triangle[i][j] + triangle[i-1][j-1]);
            }
        }

        System.out.println("Final triangle is : " + Arrays.deepToString(triangle));

        for (int i = 0; i < triangle.length; i++)
        {
            if (triangle[triangle.length-1][i] > max)
                max = triangle[triangle.length-1][i];
        }

        return max;
    }

    private static int findMaxSumUsingBacktracking(int[][] triangle)
    {
        int[][] visited = new int[triangle.length][triangle.length];
        visited[0][0] = 1;
        MaxSumPath sum = new MaxSumPath();
        findMaxRec(triangle, 0, 0, triangle[0][0], sum , visited);

        return sum.max;
    }

    private static void findMaxRec(int[][] triangle, int i, int j, int sumTillNow, MaxSumPath max, int[][] visited)
    {
        if (i == triangle.length-1)
        {
            if (max.max < sumTillNow)
                max.max = sumTillNow;
            return;
        }

        for (int k = 0; k < rowMoves.length; k++)
        {
            int row = i + rowMoves[k];
            int col = j + colMoves[k];
            if (isSafe(triangle, row, col, visited))
            {
                visited[row][col] = 1;
                findMaxRec(triangle, row, col, sumTillNow + triangle[row][col], max, visited);
                visited[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int[][] triangle, int i, int j, int[][] visited)
    {
        if (i>=0 && i < triangle.length && j>=0 && j <= i && (visited[i][j]==0))
            return true;

        return false;
    }

}
