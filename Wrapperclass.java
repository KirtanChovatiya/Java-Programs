class Wrapperclass
{
	public static void main(String arg[])
	{
	   Integer i1=Integer.valueOf(10);  //Method 1:- Wrapper class Boxing
	   
	   System.out.println(i1);
		
		
	   Integer k1=20;        //Method 2:- Wrapper class Autoboxing
		
	   System.out.println(k1);
	   
	   
	   int i=i1.intValue();   //Method 3:- Wrapper class Unboxing
	  
	   System.out.println(i);
	   
	   
	   int k=k1;        //Method 4:- Wrapper class Autounboxing
	   
	   System.out.println(k);
		
	}
}