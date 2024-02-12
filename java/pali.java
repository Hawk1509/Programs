import java.util.*;
public class pali {

    public static void main(String [] args)
    {
        int i = 0 , len;
        String s, rev = "";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String: ");
        s = sc.nextLine();
        len = s.length();
        for(i = len - 1; i >= 0; i--)
        {
            rev += s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrom.\n");

        }
        else{
            System.out.println("Not palindrome.\n");
        }

    }
}
