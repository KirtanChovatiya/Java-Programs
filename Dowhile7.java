import java.util.Scanner;
class Dowhile7
{
	public static void main(String arg[])
	{
		int i,n,sum=0;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		i=1;
		do
		{
			sum=sum+i;
			i++;
		}
		while(i<=n);
		
		System.out.println("Sum is:"+sum);
	}
}