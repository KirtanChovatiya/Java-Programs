import java.util.Scanner;
class Dowhile5
{
	public static void main(String arg[])
	{
		int i,n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=in.nextInt();
		
		i=1;
		do
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			    i++;
		}
		while(i<=n);
	}
}