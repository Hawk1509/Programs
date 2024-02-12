//prorgam to perform String tokenizer in java
import java.util.Scanner;
import java.util.StringTokenizer;
class StrTokenizer
{
    public static void main(String [] args)
    {
        int sum = 0;
        String digit;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter String of Integer: ");
        digit = sc.nextLine();
        StringTokenizer e = new StringTokenizer(digit);
        while(e.hasMoreTokens())
        {
            String s = e.nextToken();
            int dig = Integer.parseInt(s);
            sum = sum + dig;
        }
        System.out.println("Entered String: "+digit);
        System.out.println("Sum is: "+sum);

    }
}