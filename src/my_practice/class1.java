package my_practice;

public class class1 {
int z=100;
	public static void main(String[] args) {
	class1 cl1 = new class1();
	cl1.sum();
	class1 cl2 = new class1();
	cl2.sum1(25, 10, 20);
	name();
	name1("ramji");;
	class1 c1 = new class1();
	System.out.println(c1.z);

	}
public static void name()// static method
{
	String name= "khandare";
	System.out.println("my name is "+name);
}
public void sum()// non static method
{
	int a=45;
	int b= 50;
//	int z=100;
	int c=a+b;
	System.out.println("sum of a & b is "+c);
}
public static void name1(String name1)// static method with parameter
{
	System.out.println("my name is "+name1);
}
public void sum1(int a,int b , int c)// non static method with parameter
{
	//Vaibhav gathe madarchod
	c=a+b;
	System.out.println("sum of a & b is "+c);
}
}