import java.util.*;
class Concat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		String s3 = "";
		System.out.println("Enter string 1 :");
		s1=sc.nextLine();
		System.out.println("Enter string 2:");
		s2=sc.nextLine();
		s3=concat(s1,s2);
		System.out.println("After concatenation: "+s3);
		
	}
	public static String concat(String a,String b)
	{
		return a+b;
	}
}
