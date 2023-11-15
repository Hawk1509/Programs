//program to illustrate the use of try, catch, throw, throws, finally
class tryCatch
{
	public static void main(String [] args)
	{
		try
		{
			int a = 10;
			int c = a/0;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
