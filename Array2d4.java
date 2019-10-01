class Array2d4    //using withlimit
{
	public static void main(String arg[])
	{
		int a[][]=new int[3][3];
		int i,j;
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		
		System.out.println("Diagonal elements is:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]);
				}
			}
		}
	}
}