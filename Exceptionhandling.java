class Exceptionhandling
{ 
    public static void main(String args[]) 
    { 
	
	    int a=10;
		int b=0;
		
        try 
		{ 
            int c = a/b;  // cannot divide by zero 
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) 
		{ 
            System.out.println ("Can't divide a number by 0"); 
        } 
    } 
}