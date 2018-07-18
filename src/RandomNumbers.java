import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by nehad on 10/7/18.
 */
public class RandomNumbers {
    public static void main(String[] args)
    {
        // Generate random integers in range 0 to 999
        int rand_int1 = ThreadLocalRandom.current().nextInt(10);
        int rand_int2 = ThreadLocalRandom.current().nextInt(1000);
        int rand_int = ThreadLocalRandom.current().nextInt();

        // Print random integers
        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);
        System.out.println("Random Integers: " + rand_int);

        // Generate Random doubles
        double rand_dub1 = ThreadLocalRandom.current().nextDouble(5.0);
        double rand_dub2 = ThreadLocalRandom.current().nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + rand_dub1);
        System.out.println("Random Doubles: " + rand_dub2);

        // Generate random booleans
        boolean rand_bool1 = ThreadLocalRandom.current().nextBoolean();
        boolean rand_bool2 = ThreadLocalRandom.current().nextBoolean();

        // Print random Booleans
        System.out.println("Random Booleans: " + rand_bool1);
        System.out.println("Random Booleans: " + rand_bool2);

        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int3 = rand.nextInt(1000);
        int rand_int4 = rand.nextInt(1000);

        // Print random integers
        System.out.println("Random Integers: "+rand_int3);
        System.out.println("Random Integers: "+rand_int4);

        // Generate Random doubles
        double rand_dub3 = rand.nextDouble();
        double rand_dub4 = rand.nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: "+rand_dub3);
        System.out.println("Random Doubles: "+rand_dub4);
    }
}
