/**
 * Created by nehad on 16/6/18.
 */
class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private ListNode head;

    public LinkedList() {
    }

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void display()
    {
        ListNode curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
