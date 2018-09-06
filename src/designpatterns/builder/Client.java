package designpatterns.builder;

/**
 * Created by nehad on 26/7/18.
 */
public class Client {
    public static void main(String[] args)
    {
        PhoneBuilder phoneBuilder = new PhoneBuilder().setOs("android").setProcessor("snapdragon").setRam(4);
        Phone phone = phoneBuilder.getPhone();
        System.out.println("Phone is : " + phone);
    }

    @Override
    public boolean equals(Object obj)
    {
        return true;
    }
}
