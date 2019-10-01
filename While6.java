import java.util.Scanner;
class While6
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		i=1;
		
		while(n>=i)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
			n--;
		}
	}
}