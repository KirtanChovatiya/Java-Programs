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

class C extends A
{
	String city="Surat";
	
	void setc()
	{
		System.out.println("Your City:-"+city);
	}
}


class Hierarchicalinheritance
{
	public static void main(String arg[])
	{
		C c1=new C();
		B b1=new B();
		
		System.out.println();
		
		b1.seta();
		b1.setb();
		c1.setc();
	}
} 