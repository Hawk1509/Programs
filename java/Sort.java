import java.util.*;
class Sort
{
	public static void main(String args[])
	{
		String[] a = new String[7];
		System.out.println("Enter names:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++)
		{
			a[i]=sc.nextLine();			
		}
		bubblesort(a);
		System.out.println("\nAfter Sorting:");
		for(int k =0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void bubblesort(String[] a)
	{
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}

