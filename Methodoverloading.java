class Hello
{
	void passenger()
	{
		System.out.println("Truck running");
	}
	
	void passenger(int n)
	{
		System.out.println("Truck running with "+n);
	}
	
	void passenger(float n)
	{
		System.out.println("Truck running with "+n);
	}
	
}

class Methodoverloading
{
	public static void main(String arg[])
	{
		Hello h1=new Hello();
		h1.passenger();
		h1.passenger(112);
		h1.passenger(5.2f);
	}
}