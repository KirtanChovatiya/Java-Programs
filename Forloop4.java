class Forloop4
{
	public static void main(String arg[])
	{
		int i,j;
		
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}