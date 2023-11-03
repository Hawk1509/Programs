import java.util.*;
class AreaCalc
{
	double area;
	AreaCalc(int length,int breadth)
	{
		area=length*breadth;
		System.out.println("Area of the rectangle is "+area);
                                                                            	}
	AreaCalc(int i)
	{
		area=i*i;
		System.out.println("Area of the square is "+area);
	}
	AreaCalc(double r)
	{
		area=3.14*r*r;
		System.out.println("Area of the circle is "+area);
	}
}
class AreaCons
{
	public static void main(String []args)
	{
		int length,breadth;
		double radius;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		length=scan.nextInt();
		breadth=scan.nextInt();
		AreaCalc myRect=new AreaCalc(length,breadth);
		
		System.out.println("Enter the length of a square");
		length=scan.nextInt();
		AreaCalc mySq=new AreaCalc(length);
		
		System.out.println("enter the radius of the circle");
		radius=scan.nextInt();
		AreaCalc myCir=new AreaCalc(radius);
	}
}
