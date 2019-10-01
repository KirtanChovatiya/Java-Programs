class Dowhile8
{
	public static void main(String arg[])
	{
		int i;
		
		i=2000;
		do
		{
			if(i%4==0)
			{
				System.out.println("Leap year="+i);
			}
			i++;
		}
		while(i<=3000);
	}
}