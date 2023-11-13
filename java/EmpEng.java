//program to display engineer salary and employee class
class employee
{
	 void display()
	{
		System.out.println("class name is: employee");
	}
	void calcSalary()
	{
		System.out.println("Salary is 1000");
	}
}
class engineer extends employee
{
	void calcSalary()
	{
		super.calcSalary();
		System.out.println("Salary is 2000");
	}
}
class EmpEng
{
	public static void main(String [] args)
	{
		engineer ob = new engineer();
		employee ob1;
		ob1 = ob;
		ob.display();
		ob.calcSalary();
		System.out.println("🤓️🤗️😍️");
	}
}
/* OUTPUT
class name is: employee
Salary is 1000
Salary is 2000
🤓️🤗️😍️
*/
