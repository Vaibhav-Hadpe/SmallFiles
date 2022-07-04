package nayanaya;

public class stringbuffer {

	public static void main(String[] args) {
		
//		String name = "Vrushabh";
//		StringBuffer a = new StringBuffer(name);
//		System.out.println(a.reverse());
//		
//		
//		StringBuilder b = new StringBuilder("Vrushabh");
//		System.out.println(b.reverse());

        String name = "Devidas is a good boy";
        StringBuffer as = new StringBuffer(name);
        System.out.println(as);
        System.out.println(as.reverse());
        
        String name1 = "Devidas is a good boy";
        StringBuilder b = new StringBuilder(name1);
        System.out.println(b.reverse());
        
        String s= "My name is khan";
        String rev = "";
        for(int i=(s.length()-1);i>=0;i--)
        {
         rev = rev+s.charAt(i);
        }
        System.out.println(rev);

	}

}
