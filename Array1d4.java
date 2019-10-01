import java.util.Scanner;
class Array1d4
{
	public static void main(String arg[])
	{
		int a[]=new int[31];
		int i;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the elements:");
		
		for(i=0;i<=29;i++)
		{
			a[i]=in.nextInt();
		}
		
		System.out.println("Leap years=");
		
		for(i=0;i<=30;i++)
		{
	      if(a[i]%4==0)
		  {
			  System.out.println(a[i]);
		  }
		}
	}
}