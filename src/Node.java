import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nehad on 15/6/18.
 */
class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}