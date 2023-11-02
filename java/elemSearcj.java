//Program to search an element 
import java.util.*;
class elemSearcj
{
    public static void main(String [] args)
    {
        int i,n,k,flag = 0;
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of the array: \n");
        n = sc.nextInt();
        System.out.println("Enter elements of the array: \n");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The array is: \n");
        for(i = 0; i < n; i++)
        {
            System.out.println(+a[i]);
        }
        System.out.println("Enter element to be searched: \n");
        k = sc.nextInt();
        for(i = 0 ; i < n ; i++)
        {
            if(a[i] == k)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
        {
            System.out.println("Element found at index: " + i);

        }
        else
        {
            System.out.println("Element not found.\n");
        }
    }
}
