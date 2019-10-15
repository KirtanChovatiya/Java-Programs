class Student      //static keyword is use for creating a common variable among all variables
{
	int id;
	String name;
	String addr;
	static String clg="UTU";
	
	void set(int id,String name,String addr)
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
	
	void get()
	{
		System.out.println(this.id+" "+this.name+" "+this.addr+" "+clg);
	}
}


class Statickeyword
{
	public static void main(String arg[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.set(1,"Kirtan","India");
		s2.set(2,"Ashish","Australia");
		s1.get();
		s2.get();
	}
}