//program put command line args
class parse
{
	public static void main(String [] args)
	{
		int a, b;
		System.out.println("Enter values: \n");
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		System.out.println(a+" "+b);
	}
}
