class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<=2;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Multithreading
{
	public static void main(String arg[])
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
		
		s1.setName("Ram");
		s2.SetName("Shyam");
		s3.setName("Bob");
		
		s1.start();
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error.......");
		}
		
		s2.start();
		s3.start();
	}
}