package Methods;

public class Sample1 
{
	//1: static regular method call from same class
		
	//main method
	public static void main(String[] args)   //pre-defined
	{
		System.out.println("hi ");
		
		m1();      //methodname();
		m2();
		m2();
		
		System.out.println("hello");
	}
	
	//static -> regular method
	public static void m1()   // user defined method   
	{
		System.out.println("running static regular method m1");
	}
	
	
	//static -> regular method
	public static void m2()   // user defined method   
	{
		System.out.println("running static regular method m2");
	}
	
}
