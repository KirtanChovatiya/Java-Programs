import java.util.Scanner;
class Aray1d1
{
	public static void main(String arg[])
	{
		int a[]=new int[5];
		int i;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the elements:");
		
		for(i=0;i<=4;i++)
		{
			a[i]=in.nextInt();
		}
		
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}
}