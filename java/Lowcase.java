import java.util.*;
class Lowcase
{
	public static void main(String arg[])
	{
		System.out.println("Enter string to lowercase:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		System.out.println(s2);
	}
}
