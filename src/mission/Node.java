package mission;

/**
 * Created by nehad on 28/7/18.
 */
public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
