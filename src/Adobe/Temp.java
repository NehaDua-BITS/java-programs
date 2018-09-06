package Adobe;

/**
 * Created by nehad on 6/8/18.
 */
public class Temp {
    public static void main(String[] args)
    {
        String str = "Bar12345Bar12345Bar12345Bar12345";
        byte[] bytes = str.getBytes();
        System.out.println("length = " + bytes.length + " bytes : " + (8 * str.length()));
    }
}
