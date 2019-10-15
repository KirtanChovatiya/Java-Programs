class CLAexample
{
	public static void main(String arg[])
	

        
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		int i,j;
		
		for(i=0;i<=8;i++)
		{
			for(j=0;j<=8;j++)
			{
				a[i][j]=Integer.parseInt(arg[i][j]);
			}
		}
		
		
		for(i=9;i<=17;i++)
		{
			for(j=9;j<=17;j++)
			{
				b[i][j]=Integer.parseInt(arg[i][j]);
			}
		}
		
		
		for(i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{
				c[i][j]=Integer.parseInt(args[i][j]);
				
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{
				System.out.println(c[i][j]+" ");
			}
		}
		

}