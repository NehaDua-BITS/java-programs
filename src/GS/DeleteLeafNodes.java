package GS;

import mission.Node;

/**
 * Created by nehad on 6/8/18.
 */
public class DeleteLeafNodes {

    public static void main(String[] args)
    {
        Node root = new Node(12);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(10);
        root.right.right = new Node(11);
        root.right.left.left = new Node(13);
        root.right.left.right = new Node(16);
        root.right.right.right = new Node(18);
        root.right.left.right.left = new Node(17);

        System.out.println("Tree is : ");
        preOrderTraversal(root);

        root = deleteLeafNodes(root, null);
        System.out.println("Tree after deleting leaf nodes : ");
        preOrderTraversal(root);
    }

    private static void preOrderTraversal(Node root){
        if (root != null)
        {
            System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private static Node deleteLeafNodes(Node curr, Node prev)
    {
        if (curr == null)
            return curr;

        if (curr.left == null && curr.right == null) //is leaf node
        {
            if (prev != null)
            {
                if (prev.left == curr)
                    prev.left = null;
                else
                    prev.right = null;
            }

            return prev;
        }

        deleteLeafNodes(curr.left, curr);
        deleteLeafNodes(curr.right, curr);

        return curr;
    }
}
