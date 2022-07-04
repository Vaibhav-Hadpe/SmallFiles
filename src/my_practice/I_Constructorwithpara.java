package my_practice;

public class I_Constructorwithpara {
	int x;
	int y;          //X Y Z are Global Variables defined outside of main method.
	int z;            //Variable declaration
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			I_Constructorwithpara hall = new I_Constructorwithpara(15, 14, 5);   //object creation for non static method
			hall.mul();
		}
	 I_Constructorwithpara(int a, int b, int c)
	{
		x=a;
		y=b;                    //variable initialization
		z=c;
	}
	 public void mul()
	 {
		 int mul = x*y*z;
		 System.out.println("my constructor "+ mul);       //variable usage
		 
	 }
	}