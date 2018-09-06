package mission;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nehad on 29/7/18.
 */
public class LRUCache {

    static Queue<Integer> queue = new LinkedList<>();
    static int capacity;

    public static boolean isPresent(int pageNo)
    {
        if (queue.contains(pageNo))
        {
            queue.remove(pageNo);
            queue.add(pageNo);    //put in end when referred to make it most recently used
            return true;
        }

        return false;
    }

    public static void insertInCache(int pageNo)
    {
        if (queue.size() == capacity) {
            System.out.println("cache is full. Removing element.");
            queue.remove();
        }
        queue.add(pageNo);
    }

    public static void main(String[] args)
    {
        int[] pages = {10,3,5,2,10,3,1,8,3,2,9};
        int cacheSize = 4;
        capacity = cacheSize;

        int hits = 0;
        for (int i = 0; i < pages.length; i++)
        {
            if (isPresent(pages[i]))
            {
                hits++;
            }
            else
            {
                insertInCache(pages[i]);
            }
            System.out.println("Now cache is : " + queue.toString());
        }
        System.out.println("No. of hits = " + hits);
    }
}
