import java.util.Arrays;

/**
 * Created by nehad on 16/6/18.
 */
public class SortLinkList {

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        LinkedList list = new LinkedList(head);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(1);

        System.out.println("The list is : ");
        list.display();

/*
        new SortLinkList().sortList(list);
        System.out.println("\nSorted list is : ");
        list.display();
*/
        list.setHead(new SortLinkList().sortListByChangingLinks(list));
        list.display();
    }

    private void sortList(LinkedList list)
    {
        ListNode head = list.getHead();
        int[] count = new int[]{0, 0, 0};

        ListNode curr = head;
        while (curr != null)
        {
            count[curr.data]++;
            curr = curr.next;
        }

        curr = head;
        int index = 0;
        while(curr != null)
        {
            if (count[index] > 0)
            {
                curr.data = index;
                count[index]--;
                curr = curr.next;
            }
            else
                index++;
        }

    }

    private ListNode sortListByChangingLinks(LinkedList list)
    {
        ListNode head = list.getHead();
        ListNode[][] listPtrArray = new ListNode[3][2];
        System.out.println("\nArray : " + Arrays.toString(listPtrArray));


        for (ListNode curr = head; curr != null; curr = curr.next)
        {
            ListNode tailPtr = listPtrArray[curr.data][1];
            if (tailPtr != null) {
                tailPtr.next = curr;
            }

            if (listPtrArray[curr.data][0] == null) //set head if null
            {
                listPtrArray[curr.data][0] = curr;
            }

            listPtrArray[curr.data][1] = curr;  //update tail
        }

        System.out.println("Length of array : " + listPtrArray.length);

        int i = 0;
        for (; i < listPtrArray.length - 1; i++)
        {
            listPtrArray[i][1].next = listPtrArray[i+1][0];
        }

        listPtrArray[i][1].next = null;

        return listPtrArray[0][0];
    }
}
