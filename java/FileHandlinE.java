//prorgm to read from a file amd write to a file
import java.io.*;
class FileHandlinE
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter (new FileWriter("test.txt"));
        bw.write("Hello world\nThis is a test program\nWe are the Feds.\n");
        bw.write("This is a test program");
        bw.write("I sure hope this worls\n");
        bw.close();
        String line;
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        while((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
    }
} 
