import java.util.HashMap;
import java.util.Map;

/**
 * Created by nehad on 16/6/18.
 */
public class UnionIntersectionOfList {

    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        ListNode head1 = new ListNode(10);
        list1.setHead(head1);
        head1.next = new ListNode(12);
        head1.next.next = new ListNode(15);

        System.out.println("List 1 is : ");
        list1.display();

        LinkedList list2 = new LinkedList();
        ListNode head2 = new ListNode(15);
        list2.setHead(head2);
        head2.next = new ListNode(10);
        head2.next.next = new ListNode(11);

        System.out.println("List 2 is : ");
        list2.display();

        UnionIntersectionOfList obj = new UnionIntersectionOfList();

        System.out.println("The union of list is : ");
        LinkedList unionList = obj.getUnionOfLists(list1, list2);
        if (unionList != null) unionList.display();

        System.out.println("The intersection of list is : ");
        LinkedList intersectionList = obj.getIntersectionOfLists(list1, list2);
        if (intersectionList != null) intersectionList.display();
    }

    public LinkedList getUnionOfLists(LinkedList list1, LinkedList list2)
    {
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        LinkedList unionList = new LinkedList();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (ListNode curr = list1.getHead(); curr != null; curr = curr.next)
        {
            if (!hashMap.containsKey(curr.data))
                hashMap.put(curr.data, 1);
        }

        for (ListNode curr = list2.getHead(); curr != null; curr = curr.next)
        {
            if (!hashMap.containsKey(curr.data))
                hashMap.put(curr.data, 1);
        }

        ListNode prev = null;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
        {
            ListNode node = new ListNode(entry.getKey());
            if (prev == null) {
                unionList.setHead(node);
            }
            else {
                prev.next = node;
            }
            prev = node;
        }

        return unionList;
    }

    public LinkedList getIntersectionOfLists(LinkedList list1, LinkedList list2)
    {
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        LinkedList intersectionList = new LinkedList();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (ListNode curr = list1.getHead(); curr != null; curr = curr.next)
        {
            if (!hashMap.containsKey(curr.data))
                hashMap.put(curr.data, 1);
        }

        ListNode prev = null;
        for (ListNode curr = list2.getHead(); curr != null; curr = curr.next) {
            if (hashMap.containsKey(curr.data)) {
                ListNode node = new ListNode(curr.data);
                if (prev == null) {
                    intersectionList.setHead(node);
                } else {
                    prev.next = node;
                }
                prev = node;
            }
        }

        return intersectionList;
    }

}
