/**
 * Created by nehad on 16/6/18.
 */
public class ReverseLinkList {

    public static void main(String[] args)
    {
        ListNode head = new ListNode(10);
        LinkedList list = new LinkedList(head);
        head.next = new ListNode(3);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(20);
        head.next.next.next.next.next.next = new ListNode(45);

        System.out.println("The list is : ");
        list.display();

        new ReverseLinkList().reverseList(list);
        System.out.println("\nThe reversed list is : ");
        list.display();
    }

    private void reverseList(LinkedList list)
    {
        ListNode head = list.getHead();

        ListNode prev = null, curr = head, next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        list.setHead(prev);
        return;
    }

}
