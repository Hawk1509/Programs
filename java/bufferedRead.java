//reading character from  a console
import java.io.*;
class bufferedRead
{
	public static void main(String [] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		while (ch != 'q')
		{
			ch = (char)br.read();
		}
		if (ch != 'q')
		{
			System.out.println(ch);
		}
		
	}
}
