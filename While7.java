import java.util.Scanner;
class While7
{
	public static void main(String arg[])
	{
		int i,n,sum=0;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		i=1;
		
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
	    	System.out.println("Sum is:"+sum);
	}
}