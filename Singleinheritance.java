class A
{
	int id=1;
	String name="Kirtan";

	void seta()
	{
		System.out.println("Id:-"+id);
		System.out.println("Name:-"+name);
	}
}

class B extends A
{
	int std=12;
	String school="Archana";
	
	void setb()
	{
		System.out.println("Standrd:-"+std);
		System.out.println("School Name:-"+school);
	}
}



class Singleinheritance
{
	public static void main(String arg[])
	{
		B b1=new B();
		
		System.out.println();
		
		b1.seta();
		b1.setb();
		
	}
}