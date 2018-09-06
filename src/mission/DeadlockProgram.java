package mission;

/**
 * Created by nehad on 29/7/18.
 */

/*Deadlock program which includes circular wait and hold and wait situations
* */

public class DeadlockProgram {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        Thread t1 = new Thread(new WorkerThread(o1, o2), "t1");
        Thread t2 = new Thread(new WorkerThread(o2, o3), "t2");
        Thread t3 = new Thread(new WorkerThread(o3, o1), "t3");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();
    }
}

class WorkerThread implements Runnable {

    private Object obj1;
    private Object obj2;

    public WorkerThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " acquiring lock on " + obj1);
        synchronized (obj1)
        {
            System.out.println(Thread.currentThread().getName() + " acquired lock on " + obj1);
            work();
            System.out.println(Thread.currentThread().getName() + " acquiring lock on " + obj2);
            synchronized (obj2)
            {
                System.out.println(Thread.currentThread().getName() + " acquired lock on " + obj2);
                work();
            }
            System.out.println(Thread.currentThread().getName() + " released lock on " + obj2);
        }
        System.out.println(Thread.currentThread().getName() + " released lock on " + obj1);
        System.out.println(Thread.currentThread().getName() + " finishing..");
    }

    private void work()
    {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}