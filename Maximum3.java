class Maximum3
{
	public static void main(String arg[])
	{
		int a,b,c;
		
		a=10;
		b=20;
		c=30;
		
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
		
		
		if(a>b)
		{
			if(a>c)
				System.out.println("A is maximum");
			else
				System.out.println("C is maximum");
		}
		else
		{
			if(b>c)
			    System.out.println("B is maximum");
			else
				System.out.println("C is maximum");
		}
			
	}
}