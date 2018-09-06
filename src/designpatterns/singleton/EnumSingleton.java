package designpatterns.singleton;

/**
 * Created by nehad on 26/7/18.
 */
public class EnumSingleton {
    public static void main(String[] args)
    {
        EnumClass obj = EnumClass.INSTANCE;
        obj.setI(5);
        System.out.println("INSTANCE is : " + obj);
        System.out.println("obj1 i is :" + obj);

        EnumClass obj2 = EnumClass.INSTANCE;
        obj2.setI(10);

        System.out.println("obj1 i is :" + obj);
        System.out.println("obj2 i is :" + obj2);

    }


}

enum  EnumClass {
    INSTANCE("i am singleton");

    private String value;
    EnumClass(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }

    private int i;

    public void setI(int i)
    {
        this.i = i;
    }

    public int getI()
    {
        return i;
    }

    @Override
    public String toString() {
        return "EnumClass{" +
                "value='" + value + '\'' +
                ", i=" + i +
                '}';
    }
}
