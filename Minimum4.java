class Minimum4
{
	public static void main(String arg[])
	{
		int a,b,c,d;

		a=10;
		b=20;
		c=30;
		d=5;

		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
		System.out.println("D="+d);

		if(a<b && a<c && a<d)
		{
			System.out.println("A is minimum");
		}
		else if(b<a && b<c && b<d)
		{
			System.out.println("B is minimum");
		}
		else if(c<a && c<b && c<d)
		{
			System.out.println("C is minimum");
		}
		else
		{
			System.out.println("D is minimum");
		}

	}

}
