import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class file
{
 public static void main (String args[])
 {
 String s;
 Scanner in= new Scanner(System.in);
  try
   {
    FileInputStream fin=new FileInputStream("t.txt");
     int c;
      while( (c=fin.read())!=-1)
    {
     System.out.println((char)c);
       
    }
     fin.close();
   }
    catch(Exception e)
    {
       System.out.println(e);
    }
    try
   { 
     FileOutputStream fout=new FileOutputStream("ti.txt");
       System.out.println("Enter String to write");
       s=in.nextLine();
        byte b[]= s.getBytes();
     fout.write(b);
     fout.close();
   }
    catch(Exception e)
    {
       System.out.println(e);
    }
 }
}
