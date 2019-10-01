//print N to 1 even number using for loop

import java.util.Scanner;
class For6
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(i=1;n>=i;n--)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
	}
}