package designpatterns.singleton;

/**
 * Created by nehad on 26/7/18.
 */
public class DoubleCheckedSingleton {
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

class C {
    static C object;

    private C()
    {
        System.out.println("Object created");
    }

    public static C getInstance()
    {
        if (object == null) {
            synchronized(C.class) {
                if (object == null)
                    object = new C();
            }
        }

        return object;
    }
}