import java.util.*;

class Wordsearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		System.out.println("Enter the String");
		s1=sc.nextLine();
		System.out.println("Enter the word to be searched");
		s2=sc.nextLine();
		int n =s1.indexOf(s2);
		if(n==-1)
		{
			System.out.println("NOT FOUND!");
		}
		else
		{
			System.out.print("FOUND AT INDEX:"+n);
		}
	}
}
