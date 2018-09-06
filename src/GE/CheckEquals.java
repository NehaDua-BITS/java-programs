package GE;

/**
 * Created by nehad on 26/7/18.
 */
public class CheckEquals {

    public static void main(String[] args)
    {
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        int i = 5;
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i));
        System.out.println("i1 hashcode : " + i1.hashCode());
        System.out.println("i2 hashcode : " + i2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        System.out.println("sring1.equals(string2) = " + str1.equals(str2));
        System.out.println("sring1.equals(string3) = " + str1.equals(str3));
        System.out.println("sring1 == string2 : " + (str1 == str2));
        System.out.println("sring1 == string3 : " + (str1 == str3));
        System.out.println("str1 hashcode : " + str1.hashCode());
        System.out.println("str2 hashcode : " + str2.hashCode()) ;
        System.out.println("str3 hashcode : " + str3.hashCode()) ;
        String str = null;
        System.out.println("null " + str.equals(null));
    }

}
