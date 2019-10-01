import java.util.Scanner;
class While5
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		i=1;
		
		while(i<=n)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}