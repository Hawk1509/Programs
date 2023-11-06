//Program to display employee details
class employee
{
	String name,phno,adr;
	int age,sal;
	void sal()
	{
		System.out.println("Employee salary is: "+sal);
	}
}
class officer extends employee
{
	String specialization;
}
class manager extends employee
{
	String department;
}
class Employee
{
	public static void main(String[] args)
	{
		officer of = new officer();
		of.name = "LUKE";
		of.age = 15;
		of.phno = "8678-45645-1029";
		of.adr = "DARTH";
		of.sal = 12345;
		of.specialization = "IT";
		
		manager man = new manager();
		man.name = "DARTH VADER";
		man.age = 60;
		man.phno = "98765-456466-4546";
		man.adr = "AMV M416 UZI MRK IV";
		man.sal = 12345;
		man.department = "WORKER";
				System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("\nOFFICER DETAILS\n");
		
		System.out.println("OFFICER NAME: "+of.name);
		System.out.println("OFFICER AGE: "+of.age);
		System.out.println("OFFICER PHONE NUMBER: "+of.phno);
		System.out.println("OFFICER ADDRESS: "+of.adr);
		System.out.println("OFFICER SALARY: "+of.sal);
		System.out.println("OFFICER SPECIALIZATION: "+of.specialization);
		
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("\nMANAGER DETAILS\n");
		System.out.println("MANAGER NAME: "+man.name);
		System.out.println("MANAGER AGE: "+man.age);
		System.out.println("MANAGER PHONE NUMBER: "+man.phno);
		System.out.println("MANAGER ADDRESS: "+man.adr);
		System.out.println("MANAGER SALARY: " +man.sal);
		System.out.println("MANAGER SPECIALIZATION: " +man.department);
	}
}
		
		
		
