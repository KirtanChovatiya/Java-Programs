//print N to 1 number using for loop

import java.util.Scanner;
class For4
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(i=1;n>=i;n--)
		{
			System.out.println(n);
		}
	}
}