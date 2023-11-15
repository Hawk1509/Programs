//program to find are of the given shapes using the concept of interface 
interface poli
{
	void rec(int l,int b);
	void tri(int b,int h);
	void cir(int r);
}
class pol implements poli
{
	public void rec(int l, int b)
	{
		System.out.println("Area of the Rectangle: "+l*b);
	}
	public void tri(int b, int h)
	{
		System.out.println("Area of the Triangle: "+b*h*0.5);
	}
	public void cir(int r)
	{
		System.out.println("Area of the Circle: "+r*r*3.14);
	}
}
class polygon
{
	public static void main(String[] args)
	{
		pol ob = new pol();
		ob.rec(5,5);
		ob.tri(2,5);
		ob.cir(10);
	}
}
/*
OUTPUT
Area of the Rectangle: 25
Area of the Triangle: 5.0
Area of the Circle: 314.0
*/
