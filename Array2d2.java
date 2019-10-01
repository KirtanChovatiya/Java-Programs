class Array2d2     //using without limit
{
	public static void main(String arg[])
	{
		int a[][]={
			        {1,2,3},
		        	{4,5,6},
			        {7,8,9},
		          };
		int i,j,sum=0;
		
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("Sum is:"+sum);
	}
}