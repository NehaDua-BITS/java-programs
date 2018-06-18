import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nehad on 15/6/18.
 */
public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    private int getHeightRecursive(Node node)
    {
        if (node == null)
            return 0;

        return 1 + Math.max(getHeightRecursive(node.leftChild), getHeightRecursive(node.rightChild));
    }

    public int getHeight()
    {
        return getHeightRecursive(root);
    }

    public void printLevelOrderTraversal()
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            Node node = queue.poll();
            System.out.println(node.data);
            if (node.leftChild != null) queue.add(node.leftChild);
            if (node.rightChild != null) queue.add(node.rightChild);
        }
    }

    private void printNodesAtGivenLevel(Node node, int level)
    {
        if ((node != null) && level == 1)
            System.out.println(node.data);
        else
        {
            printNodesAtGivenLevel(node.leftChild, level - 1);
            printNodesAtGivenLevel(node.rightChild, level - 1);
        }
    }

    public void printLevelOrderIterative()
    {
        int height = this.getHeight();

        for (int i = 1; i <= height; i++)
        {
            printNodesAtGivenLevel(root, i);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree(new Node(40));
        tree.root.leftChild = new Node(10);
        tree.root.rightChild = new Node(20);
        tree.root.leftChild.leftChild = new Node(5);
        tree.root.leftChild.rightChild = new Node(23);
        tree.root.rightChild.leftChild = new Node(6);
        tree.root.rightChild.leftChild.leftChild = new Node(8);

        tree.printLevelOrderTraversal();

        System.out.println("Height of tree = " + tree.getHeight());

        System.out.println("Iterative level order traversal : ");
        tree.printLevelOrderIterative();
    }
}

