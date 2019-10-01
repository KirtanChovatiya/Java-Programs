import java.util.Scanner;
class Array1d3
{
	public static void main(String arg[])
	{
		int a[]=new int[10];
		int i;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the elements:");
		
		for(i=0;i<=9;i++)
		{
			a[i]=in.nextInt();
		}
		
		for(i=0;i<=9;i++)
		{
	      if(a[i]%2==1)
		  {
			  System.out.println("Odd number is:"+a[i]);
		  }
		}
	}
}