package designpatterns.singleton;

/**
 * Created by nehad on 26/7/18.
 */
class Singleton {

   private static Singleton obj = new Singleton();

    private Singleton()
    {

    }

    static Singleton getInstance()
    {
        return obj;
    }

    @Override
    public String toString()
    {
        return "I am singleton class object";
    }
}

class Demo {

    public static void main(String[] args)
    {
        Singleton object = Singleton.getInstance();
        System.out.println("object is : " + object);
    }
}