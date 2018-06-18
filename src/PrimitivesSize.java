import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by nehad on 14/6/18.
 */
public class PrimitivesSize {

    public static void main(String[] args)
    {
        System.out.println("inside main");

        System.out.println("size of primitives : ");
        System.out.println("Integer : " + Integer.SIZE);
        System.out.println("Float : " + Float.SIZE);
        System.out.println("Double : " + Double.SIZE);
        System.out.println("Short : " + Short.SIZE);
        System.out.println("Byte : " + Byte.SIZE);
        System.out.println("Character : " + Character.SIZE + " bytes = " + Character.BYTES);  //it takes 2 bytes due to unicode encoding (for internationalization)

        //Boolean : size of boolean depends on jvm and thus not defined.
    }
}
