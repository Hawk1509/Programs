//program to create abstract class of shapes
abstract class shape
{
	abstract void numberofsides();
}
class rectangle extends shape
{
	void numberofsides()
	{
		System.out.println("\nRECTANGLE HAS 4 SIDES");
	}
}
class triangle extends shape
{
	void numberofsides()
	{
		System.out.println("\nTRIANGLE HAS 3 SIDES");
	}
}
class hexagon extends shape
{
	void numberofsides()
	{
		System.out.println("\nHEXAGON HAS 6 SIDES");
	}
}
class abst
{
	public static void main(String [] args)
	{
		rectangle r = new rectangle();
		triangle t = new triangle();
		hexagon h = new hexagon();
		r.numberofsides();
		t.numberofsides();
		h.numberofsides();
	}
}
/* OUTPUT

RECTANGLE HAS 4 SIDES

TRIANGLE HAS 3 SIDES

HEXAGON HAS 6 SIDES
*/
