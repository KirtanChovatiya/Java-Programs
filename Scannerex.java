import java.util.Scanner;

class Scannerex
{
	public static void main(String arg[])
	{
		int a,b,c;
		
		Scanner sum=new Scanner(System.in);  //create the scanner class for ask user value
		
		System.out.println("Enter the value of A:");
		a=sum.nextInt();//it like scanf method in c            
												
														//for pass float value=nextFloat()
														//for pass double value=nextDouble()
														//for pass char value=next().charAt(Enter the index value)
														//for pass string = nextLine()
		
		System.out.println("Enter the value of B:");
		b=sum.nextInt();
		
		c=a+b;
		
		System.out.println("Sum is:"+c);
	}
	
}
