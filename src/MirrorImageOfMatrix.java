import java.util.Arrays;

/**
 * Created by nehad on 19/7/18.
 */
public class MirrorImageOfMatrix {

    public static void main(String[] args)
    {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println("Matrix is : ");
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0, k = matrix[i].length-1; j < k; j++, k--)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        System.out.println("\nMirror matrix is : ");
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

    }
}
