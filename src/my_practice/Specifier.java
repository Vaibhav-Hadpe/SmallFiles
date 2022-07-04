package my_practice;


public class Specifier {

	final int b=80;
	public static void main(String[] args) 
	{
	
		int a=90;//default  
		System.out.println("Initial value of a is "+a);
		
		a=a+10;// adding 10 in original value
		System.out.println("updated value of a  is "+a);
		
			
		//
		//b=b+10;

	}
	
	public void test()
	{

		System.out.println("I am test method form FinalStudy class");
	}
	
	protected void test1()
	{

		System.out.println("I am test1 method form FinalStudy class");
	}

}
