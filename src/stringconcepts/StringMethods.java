package stringconcepts;

public class StringMethods {

	public static void main(String[] args) {
		String s= "roushan is";
		String s2="zoushan";
		StringBuffer sb= new StringBuffer ("roushan");
		
//		*********** contentEquals() & equals()
//		boolean status= s.contentEquals(sb);
//		System.out.println(s.contentEquals(s2));
//		System.out.println(s.equals(sb));
//		System.out.println(s.equals(s2));
//		System.out.println(status);
		
//		***************compareTo()
//		System.out.println(s.compareTo(s2));
		
//		****************matches()
//		System.out.println(s.matches("(.*)usha(.*)"));
		
//		*****************replace
//		String Str = new String("Welcome to Tutorialspoint.com");
//
//	      System.out.print("Return Value :" );
////	      System.out.println(Str.replaceFirst("(.*)Tutorials(.*)",
////	                         "AMROOD" ));
//
//	      System.out.print("Return Value :" );
//	      System.out.println(Str.replaceFirst("Tutorials", "AMROOD" ));
////	      System.out.println(Str.replaceAll("to","of"));
//	      System.out.println(Str.replaceFirst("to","of"));
//
		char[] ch= s.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			System.out.println(ch[i]);
//			System.out.println(ch.length);
		}
		for( char c: ch)
		{
			System.out.println(c);
		}
	}
	

}
