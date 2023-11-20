import java.io.IOException;
class tryCatch{
	public static void main(String[] args)throws IOException{
		try
		{
			int sum=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("EXCEPTION CAUGHT");
		}
		finally
		{
			System.out.println("FINALLY AFTER HANDLING");
		}
		int a=1;
		if(a==1)
		{
			throw new IOException("HANDLING USING THROW");
		}
	}
}
/*
OUTPUT
EXCEPTION CAUGHT
FINALLY AFTER HANDLING
Exception in thread "main" java.io.IOException: HANDLING USING THROW
	at tryCatch.main(tryCatch.java:19)
*/


