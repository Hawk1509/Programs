import java.util.*;

class Reverse
{
	public static void main(String args[])
	{
		String s1 = "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s1=sc.nextLine();
		char[] a = s1.toCharArray();
		char[] b = new char[a.length];
		for(int i=(a.length)-1,j=0;i>=0;j++,i--)
		{
			b[j]=a[i];
		}
		String s = new String(b);
		System.out.println("Reversed : "+s);
		
	}
}
