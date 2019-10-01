//print 1 to N odd number using for loop

import java.util.Scanner;
class For5
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}