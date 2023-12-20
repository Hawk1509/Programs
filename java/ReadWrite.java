import java.io.*;
import java.util.*;
class ReadWrite
{
	public static void main(String args[])
	{
			try{
			int i;
			FileInputStream fin=new FileInputStream("input.txt");
			FileOutputStream fout=new FileOutputStream("output.txt");
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}}
		catch(IOException e){}
	}
}
