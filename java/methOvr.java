import java.util.*;
class Area
{
	double a;
	void area(int l,int b)
	{
		a=l*b;
		System.out.println("Area of the rectangle is "+ a);
	}
	void area(int i)
	{
		a=i*i;
		System.out.println("Area of the square is "+ a);
	}
	void area(double r)
	{
		a=3.14*r;
		System.out.println("Area of the circle is "+ a);
	}
}
class aream
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		AreaCalc myRec=new AreaCalc();
		AreaCalc mySq=new AreaCalc();
		AreaCalc myCir=new AreaCalc();
		myRec.area(7,8);
		mySq.area(5);
		myCir.area(4);
	}
}
