package designpatterns.singleton;

/**
 * Created by nehad on 26/7/18.
 */
public class LazySingleton {
    public static void main(String[] args)
    {
        A obj1 = A.getInstance();
        A obj2 = A.getInstance();
    }
}

class A {
    static A object;

    private A()
    {
        System.out.println("Object created");
    }

    public static A getInstance()
    {
        if (object == null)
            object = new A();

        return object;
    }
}
