package mission;

import java.util.*;

/**
 * Created by nehad on 28/7/18.
 */
public class WidthOfTree {

    public static void main(String[] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(20);
        root.left.right = new Node(5);
        root.right.left = new Node(80);
        root.right.right = new Node(100);
        root.right.right.right = new Node(10);
        root.right.right.right.left = new Node(3);

        System.out.println("Max width using level order traversal (queue) : " + maxWidthUsingLevelOrder(root));

        System.out.println("Max width using count array : " + maxWidthUsingCountArray(root));

    }

    private static int maxWidthUsingLevelOrder(Node root) {
        if (root == null)
            return 0;

        int max = -1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int numOfElementsInLevel = queue.size();
            if (numOfElementsInLevel > max)
                max = numOfElementsInLevel;

            for (int i = 0; i < numOfElementsInLevel; i++)
            {
                Node node = queue.remove();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return max;
    }

    private static int maxWidthUsingCountArray(Node root) {
        if (root == null)
            return 0;

        int height = getHeight(root);
        //System.out.println("Height of tree = " + height);
        int count[] = new int[height];
       // System.out.println("size of array = " + count.length + " " + Arrays.toString(count));

        getCountAtEachLevel(root, count, 0);

        int max = -1;
        for (int val : count)
        {
            if (val > max)
                max = val;
        }

        return max;
    }

    private static void getCountAtEachLevel(Node root, int[] count, int level)
    {
        if (root != null)
        {
            count[level]++;
            getCountAtEachLevel(root.left, count, level+1);
            getCountAtEachLevel(root.right, count, level+1);
        }
    }

    private static int getHeight(Node root)
    {
        if (root == null)
            return 0;

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
