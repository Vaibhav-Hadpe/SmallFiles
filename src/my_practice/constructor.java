package my_practice;

public class constructor {

	public static void main(String[] args) {
		mul();
//		constructor c = new constructor(50, 40, 20);
		//c.addition();
	}
public static void mul()
{
	int x=10;
	int y=20;
	int z=97;
	int mul= x*y*z;
	System.out.println("multiplication is " + mul);
}
/*public void addition()
{
	int a=25;
	int b=56;
	float c=6.5f;
	float addition = a+b+c;
	System.out.println("addition is "+ addition);
	
}*/
constructor(int X,int Y,int Z)
{
	int Add = X+Y+Z;
	System.out.println("addition of constructor is "+ Add);
}
}
