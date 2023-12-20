import java.util.*;

class Compare
{
	public static void main(String args[])
	{
		String s1 = "Muhammad Nafih";
		String s2 = "Muhammad Rafi";
		System.out.println("Strings equal? :"+s1.equals(s2));
		System.out.println("Region equal? :"+s1.regionMatches(0,s2,0,8));
	}
}
