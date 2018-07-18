import java.util.*;

/**
 * Created by nehad on 20/6/18.
 */
public class Trial
{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(20);
        set.add(null);
        set.add(5);
        set.add(10);

        Integer[] arr = new Integer[5];
        set.toArray(arr);

        System.out.println("Hashset is : " + set.toString() + " array : " + Arrays.toString(arr));

        Set treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(5);
        treeSet.add(2);

        System.out.println("Treeset is : " + treeSet.toString());

        LinkedHashSet hashSet = new LinkedHashSet();
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(12);
        hashSet.add(20);
        hashSet.add(null);


        System.out.println("Linked hash set is : " + hashSet.toString());

    }
}
