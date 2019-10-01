//print leap year between 2000 to 3000 using for loop

class For8
{
	public static void main(String arg[])
	{
		int i;
		
		for(i=2000;i<=3000;i++)
		{
			if(i%4==0)
			{
				System.out.println("Leap years="+i);
			}
		}
	}
}