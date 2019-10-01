//print 1 to N number using for loop

import java.util.Scanner;
class For3
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}