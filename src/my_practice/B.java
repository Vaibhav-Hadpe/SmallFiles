package my_practice;

public class B extends Specifier {
	public void test()// overidded the test method 
	{
		System.out.println("hi i am test method from A class");
            //hii abhi
	}

	
//	public void test1()// we cant override final method
//	{
//
//		System.out.println("I am test1 method form A class");
//	}
	public static void main(String[] args) 
	{
		
		Specifier a = new Specifier();
		Specifier fs= new Specifier();
		
		fs.test();
		a.test();
		fs.test1();

	}

}


