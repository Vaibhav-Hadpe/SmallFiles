package my_practice;

public class Concrete extends abstractclass {

	public static void main(String[] args) 
	{
		Concrete c = new Concrete();
		c.abhi();
		c.rishi();
		

	}

	@Override
	public void rishi() {
		int b = 25;
		int c=15;
		int sum= b+c;
		System.out.println(sum);
		
	}

}
