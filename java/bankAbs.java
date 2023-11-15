//program to create abstract class bankaccount
abstract class bankAcc
{
	abstract void deposit();
	abstract void withdaw();
}
class savings extends bankAcc
{
	void deposit()
	{
		System.out.println("Deposit from Savings");
	}
	void withdaw()
	{
		System.out.println("Withdraw from Savings");
	}
}
class current extends bankAcc
{
	void deposit()
	{
		System.out.println("Deposit from Current");
	}
	void withdaw()
	{
		System.out.println("Withdraw from Current");
	}
}
class bankAbs
{
	public static void main(String[] args)
	{
		savings ob = new savings();
		current ob1 = new current();
		ob.deposit();
		ob.withdaw();
		ob1.deposit();
		ob1.withdaw();
	}
}
/*
OUTPUT

Deposit from Savings
Withdraw from Savings
Deposit from Current
Withdraw from Current
*/
