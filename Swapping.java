class Swapping
{
	public static void main(String arg[])
	{
		int a,b;
		a=5;
		b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}