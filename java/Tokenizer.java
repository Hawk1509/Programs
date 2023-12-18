//program to read line of intergers and display each integer and sum of all integers
import java.util.*;
class Tokenizer
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String of digits: ");
		String digit = sc.nextLine();
		StringTokenizer token = new StringTokenizer(digit);
		int dig = 0,sum = 0;
		while(token.hasMoreTokens())
		{
			String s = token.nextToken();
			dig = Integer.parseInt(s);
			System.out.println(+dig);
			sum+=dig;
		}
		System.out.println("The sum is: "+sum);
		
	}
}
/*OUTPUT
Enter String of digits: 
1 2 3 4 5 6
1
2
3
4
5
6
The sum is: 21
 */
