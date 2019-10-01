import java.util.Scanner;   //using Scanner class method
class Array2d1
{
	public static void main(String arg[])
	{
		int a[][]=new int[3][3];
		int i,j;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the elements:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		System.out.println("Array is:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}