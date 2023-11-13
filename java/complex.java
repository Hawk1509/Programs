//prorgam to display sum of two complex numbers 
class comp
{
	int i,r;
	comp()
	{
		i = 0;
		r = 0;
	}
	comp(int a,int b)
	{
		i = a;
		r = b;
	}
	comp add(comp c)
	{
		comp c3 = new comp();
		c3.i = i + c.i;
		c3.r = r + c.r;
		return c3;
	}
}
class complex
{
	public static void main(String [] args)
	{
		comp c1 = new comp(5,5);
		comp c2 = new comp(4,4);
		comp c3 = c1.add (c2);
		System.out.println("SUM IS: "+c3.r+"+i"+c3.r);
	}
}
/*
OUTPUT
SUM IS: 9+i9
*/
