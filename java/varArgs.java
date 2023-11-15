//program to illustrate variable lenght arguments
class varargs
{
	int sum(int... args)
	{
		int s = 0;
		for(int x:args)
		{
			s = s + x;
		}
		return s;
	}
}
class varArgs
{
	public static void main(String [] args)
	{
		varargs ob = new varargs();
		int c  = ob.sum(5,5);
		System.out.println("The sum is: "+c);
	}
}
/*
OUTPUT
The sum is: 10
*/

