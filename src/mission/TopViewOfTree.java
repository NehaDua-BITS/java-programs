package mission;

import java.util.*;

/**
 * Created by nehad on 27/7/18.
 */
public class TopViewOfTree {

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
        //group nodes by same horizontal distance and print first among them
        //do level order traversal

        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.left.left = new Node(20);
        root.left.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(2);
        root.right.right.right = new Node(1);

        printTopView(root);
    }

    private static class QNode
    {
        Node node;
        int hd;

        QNode(Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }

    private static void printTopView(Node root)
    {
        Queue<QNode> queue = new LinkedList<>();
        queue.add(new QNode(root, 0));
        HashSet<Integer> set = new HashSet<>();

        while (!queue.isEmpty())
        {
            QNode qNode = queue.remove();

            if (!set.contains(qNode.hd))
            {
                set.add(qNode.hd);
                System.out.println(qNode.node.data);
            }

            if (qNode.node.left != null)
                queue.add(new QNode(qNode.node.left, qNode.hd - 1));
            if (qNode.node.right != null)
                queue.add(new QNode(qNode.node.right, qNode.hd + 1));

        }
    }
}
