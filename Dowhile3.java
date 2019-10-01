import java.util.Scanner;
class Dowhile3
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
			System.out.println(i);
			i++;
		}
		while(i<=n);
	}
}