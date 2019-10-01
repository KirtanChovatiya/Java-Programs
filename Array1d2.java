import java.util.Scanner;
class Array1d2
{
	public static void main(String arg[])
	{
		int a[]=new int[5];
		int i,sum=0;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the elements:");
		
		for(i=0;i<=4;i++)
		{
			a[i]=in.nextInt();
		}
		
		for(i=0;i<=4;i++)
		{
			sum=sum+a[i];
		}
		  System.out.println("Sum is:"+sum);
	}
}