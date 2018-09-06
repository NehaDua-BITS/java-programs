package designpatterns.singleton;

/**
 * Created by nehad on 26/7/18.
 */
public class ThreadSafeSingleton {
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                B obj1 = B.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                B obj1 = B.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class B {
    static B object;

    private B()
    {
        System.out.println("Object created");
    }

    public synchronized static B getInstance()
    {
        if (object == null)
            object = new B();

        return object;
    }
}
