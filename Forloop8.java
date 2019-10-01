class Forloop8
{
	public static void main(String arg[])
	{
		int i,j,k;
		
		for(i=5;i>=1;i--)
		{
			for(k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}