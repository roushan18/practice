package stringconcepts;

public class AdditionalStringConcepts {

	public static void main(String[] args) {
		String s1= new String ("Java is very easy language");
		// startsWith() ,endsWith() is case-sensitive
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("easy"));
		System.out.println(s1.contains("sy"));
		//to find occurance of a character in a given string
		int len= s1.length();
		int count=0;
		for (int i= 0;i<len;i++)
		{
			char ch= s1.charAt(i);
			if (ch=='a')
			{
				count= count+1;
				
			}
		}
		System.out.println(count);
			
		// to find if a given character in a string
		
		for (int i= 0;i<len;i++)
		{
			char ch= s1.charAt(i);
			if (ch=='a')
			{
				System.out.println("Character 'a' is present in given string at index number "+i);
				
			}
		}
		
		// to reverse string like -"Jgaugnal ysae yrev si avae"
		String s2="";
		for(int i=0; i<len;i++)
		{
			if(i==0 || i==len-1)
			{
				s2= s2+s1.charAt(i);
			}
			else
			{
				int j= len-1-i;
				s2= s2+s1.charAt(j);
				
			}
		}
		System.out.println(s2);
	}
	
	

}
