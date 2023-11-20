//mulitlevel inheritance
class name
	{
	void names()
		{
		System.out.println("Name = Ram");
		}
	}
class age extends name
	{
	void ages()
		{
		System.out.println("Age = 19");
		}
	}
class fee extends age
	{
	void fees()
		{
		System.out.println("Fee = 75K");
		}
	}
class try
	{
	public static void main(String args[])
		{
		fee f=new fee();
		f.names();
		f.ages();
		f.fees();
		}
	}

