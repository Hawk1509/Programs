//read method character till user types 'q'
import java.io.*;
class buffRd
{
	public static void main(String [] args)
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter string and enter 'q' to quit");
			char ch = 'q';
			do
			{
				ch = (char)br.read();
				
			}
			while(ch != 'q');
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
			br.close();
			}catch(IOException e)
			{
				System.out.println(e);

			}
				System.out.println("THANK YOU!");

		}
	}
}

