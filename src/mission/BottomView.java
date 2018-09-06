package mission;

import java.util.*;

/**
 * Created by nehad on 29/7/18.
 */
class ViewNode {
    Node node;
    int hd;

    public ViewNode(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BottomView {
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println("Level order traversal is : ");
        levelOrderTraversal(root);

    }

    private static void levelOrderTraversal(Node root)
    {
        Queue<ViewNode> queue = new LinkedList<>();
        queue.add(new ViewNode(root, 0));
        Map<Integer, Integer> map = new TreeMap<>();

        while (!queue.isEmpty())
        {
            ViewNode vnode = queue.remove();
            int hd = vnode.hd;
            System.out.println("hd " + hd + " value : " + vnode.node.data);
            map.put(hd, vnode.node.data);

            if (vnode.node.left != null)
                queue.add(new ViewNode(vnode.node.left, hd-1));

            if (vnode.node.right != null)
                queue.add(new ViewNode(vnode.node.right, hd+1));
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }

}
