import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by nehad on 10/7/18.
 */
public class StaticTesting {

    static int value ;

    static {
        value = 10;
        System.out.println("im static block  : " + value);
    }

    public static void main(String[] args)
    {
        value = 5;
        System.out.println("im in main method : " + value);

        PriorityQueue pq = new PriorityQueue();
        new ArrayDeque<>();

        Deque dq = new LinkedBlockingDeque();
    }
}
