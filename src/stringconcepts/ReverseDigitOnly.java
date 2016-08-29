package stringconcepts;

public class ReverseDigitOnly {

	public static void main(String[] args) {
		String s1="java97html123selenium2000";
		String s2="";
		int len= s1.length();
		String s3="";
		for ( int i=0;i<len;i++)
		{
			char ch= s1.charAt(i);
			
			if(Character.isDigit(ch))
			{				
				s3= s3+s1.charAt(i);
				int ilen= s3.length();
			}			
			
			System.out.println(s3);
		}
		System.out.println(s2);
		

	}

}
