package my_practice;


public class GlobalLocalVariable {
	
	int a=10;
	int b=20;
	String c="Abhishek";
	static int d=45;

	public static void main(String[] args) {
		
		GlobalLocalVariable g=new GlobalLocalVariable();
		g.sum();
		System.out.println(g.c);
		System.out.println(d);
		int addition = 50+g.a+g.b;
		System.out.println(addition);
		class1.name();
		class1.name1("vrusgaahb");
		class1 cl1 = new class1();
		cl1.sum();
//		int abhi = 100 + cl1.z;
		class1 c1 = new class1();
		System.out.println(100+c1.z);
	}
public void sum() {
int d=a+b;

System.out.println("the sum is "+d);
}
}