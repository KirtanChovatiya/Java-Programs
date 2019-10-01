class Array2d3    //using without limit
{
	public static void main(String arg[])
	{
		int a[][]={
			        {1,2,3},
		        	{4,5,6},
			        {7,8,9},
		          };
		int b[][]={
			        {1,2,3},
			        {4,5,6},
			        {7,8,9}
			      };
        int c[][]=new int[3][3];
        int i,j;

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Addition is:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}