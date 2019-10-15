class Student        //this keyword is represant the currunt class in the program
{
	int id;
	String name;
	String addr;
	
	void set(int id,String name,String addr)
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
	
	void get()
	{
		System.out.println(this.id+" "+this.name+" "+this.addr);
	}
}


class Thiskeyword
{
	public static void main(String arg[])
	{
		Student s1=new Student();
		s1.set(1,"Kirtan","India");
		s1.get();
	}
}