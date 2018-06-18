/**
 * Created by nehad on 14/6/18.
 */
public class ConvertToBinary {

    public static void main(String[] args)
    {
        int num = 4;
        ConvertToBinary object = new ConvertToBinary();
        System.out.print("Binary representation (recursive) of " + num + " = ");
        object.printBinaryRecursive(num);

        System.out.print("\n\nBinary representation (iterative) of " + num + " = ");
        object.printBinaryIterative(num);

        System.out.print("\n\nBinary representation (iterative 2) of " + num + " = ");
        object.printBinaryRecursive2(num);

    }

    private void printBinaryRecursive(int num)
    {
        if (num <= 0)
            return;

        printBinaryRecursive(num/2);
        System.out.print(num%2);
    }

    private void printBinaryIterative(int num)
    {
        int numOfBits = Integer.SIZE;
        long i = 1L << (numOfBits - 1);
        //int i = 1 << (numOfBits - 2);    -2 because last one is sign bit
        for (; i > 0; i >>= 1)
        {
            System.out.print((num & i) > 0 ? 1 : 0);
        }
    }

    private void printBinaryRecursive2(int num)
    {
        if(num <= 0)
            return;

        printBinaryRecursive2(num>>1);
        System.out.print((num & 1) > 0 ? 1 : 0);
    }
}
