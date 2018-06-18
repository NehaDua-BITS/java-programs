import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by nehad on 14/6/18.
 */
public class MaxStruct
{
    private class Height
    {
        int feet;
        int inches;

        public Height(int feet, int inches)
        {
            this.inches = inches;
            this.feet = feet;
        }

        public int getHeightInInches()
        {
            return 12*feet + inches;
        }

        @Override
        public String toString()
        {
            return "Height : " + feet + " feet " + inches + " inches";
        }
    }

    public static void main(String[] args)
    {
        MaxStruct maxStructObj = new MaxStruct();
        MaxStruct.Height[] heightArray = new MaxStruct.Height[5];
        heightArray[0] = maxStructObj.new Height(5, 2);
        heightArray[1] = maxStructObj.new Height(5, 5);
        heightArray[2] = maxStructObj.new Height(10, 7);
        heightArray[3] = maxStructObj.new Height(10, 6);
        heightArray[4] = maxStructObj.new Height(2, 10);

        maxStructObj.printMaxHeight(heightArray);

        Integer[] intArray = new Integer[]{1, 23, 12, 9, 30, 2, 50};
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Sorted array : " + Arrays.toString(intArray));
    }

    void printMaxHeight(MaxStruct.Height[] heightArray)
    {
        int maxIndex = -1;
        int maxHeight = 0;
        for (int i = 0; i < heightArray.length; i++)
        {
            int currentHeight = heightArray[i].getHeightInInches();
            if (currentHeight > maxHeight)
            {
                maxHeight = currentHeight;
                maxIndex = i;
            }
        }

        System.out.println("Max height : " + heightArray[maxIndex]);
    }
}
