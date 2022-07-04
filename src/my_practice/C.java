package my_practice;

public class C {
	
	//my class c modified
	public static void main(String[] args) {
		String word = "Vrushaabh Tiwaari";
		int count = 0;
		for(int i=0; i<word.length()-1;i++)
		{
			if (word.charAt(i)=='a')
			{	
			count++;
		}
			}
		System.out.println("number of occurance of a in given string is "+count);
	}

}
