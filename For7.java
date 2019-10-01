//print sum of 1 to N number using for loop

import java.util.Scanner;
class For7
{
	public static void main(String arg[])
	{
		int i,n,sum=0;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
       		System.out.println(sum);
	}
}