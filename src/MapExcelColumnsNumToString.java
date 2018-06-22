import java.util.Scanner;

/**
 * Created by nehad on 20/6/18.
 */
public class MapExcelColumnsNumToString
{
    private String getExcelColumnName(int n)
    {
        StringBuilder stringBuilder = new StringBuilder();
        int rem = -1;

        while (n > 0)
        {
            rem = n % 26;
            n = n / 26;

            if (rem == 0) {  //if it's Z
                stringBuilder.append('Z');
                n--;  //cz their counting starts with 1
            }
            else {
                stringBuilder.append((char)('A' + rem - 1));
            }
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a excel column number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("The number entered is : " + num);

        System.out.println("Excel column name for given number is : " + new MapExcelColumnsNumToString().getExcelColumnName(num));
    }
}
