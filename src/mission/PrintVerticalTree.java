package mission;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nehad on 27/7/18.
 */
public class PrintVerticalTree {

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.left.left = new Node(20);
        root.left.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(2);
        root.right.right.right = new Node(1);

        printVerticalTree(root);
    }

    private static void printVerticalTree(Node root)
    {
        if (root == null)
            return;

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        traverseTreee(root, map, 0);

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }

    private static void traverseTreee(Node root, TreeMap<Integer, ArrayList<Integer>> map, int dist)
    {
        if (root == null)
            return;

        ArrayList<Integer> list = map.get(dist);
        if (list == null)
            list = new ArrayList<>();
        list.add(root.data);
        map.put(dist, list);

        traverseTreee(root.left, map, dist-1);
        traverseTreee(root.right, map, dist+1);
    }
}
