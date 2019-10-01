class Outer         //Class inside class it's called Inner class and user creates infinity classes
{
	 void show()
	 {
		 System.out.println("Hello Outer Class");
	 }
	 
	 class Inner 
	 {
		 void disp()
		 {
			 System.out.println("Hello Inner Class");
		 }
		 
		 class Under
		 {
			 void echo()
			 {
				 System.out.println("Hello Under Class");
			 }
			 
		 }
	 }
}



class Innerclass
{
	public static void main(String arg[])
	{
		System.out.println();
		
		
		Outer o1=new Outer();
		o1.show();
		
		Outer.Inner i1=o1.new Inner();
		i1.disp();
		
		Outer.Inner.Under u1=i1.new Under();
		u1.echo();
	}
}