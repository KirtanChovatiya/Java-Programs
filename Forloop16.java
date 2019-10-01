class Forloop16
{
	public static void main(String arg[])
	{
		int i,j,k;
		
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}