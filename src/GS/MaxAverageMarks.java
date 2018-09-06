package GS;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nehad on 18/7/18.
 */
class Wrapper
{
    int count;
    int total;

    public Wrapper(int count, int total) {
        this.count = count;
        this.total = total;
    }

    public String toString()
    {
        return " count:" + count + " total:" + total;
    }
}

public class MaxAverageMarks {

    public static void main(String[] args)
    {
        Object[][] students = new Object[][]{
                {"neha", 20},
                {"ashu", 10},
                {"ashu", 50},
                {"neha", 100},
                {"dua", 50},
                {"ashu",90},
                {"parth", 100}
        };


        HashMap<String, Wrapper> map = new HashMap<>();
        for (int i = 0; i < students.length; i++)
        {
            if(map.containsKey(students[i][0]))
            {
                Wrapper obj = map.get(students[i][0]);
                obj.count++;
                obj.total += (int) students[i][1];
            }
            else
            {
                map.put((String) students[i][0], new Wrapper(1, (Integer) students[i][1]));
            }
        }

        System.out.println("Map is : " + map.toString());

        int maxAverage = -1;
        String maxKey = null;
        for (Map.Entry<String, Wrapper> entry : map.entrySet())
        {
            Wrapper obj = entry.getValue();
            int avg = obj.total / obj.count;
            if (avg > maxAverage) {
                maxAverage = avg;
                maxKey = entry.getKey();
            }
        }

        System.out.println("Max Average : " + maxAverage + " for student = " + maxKey);
    }
}
