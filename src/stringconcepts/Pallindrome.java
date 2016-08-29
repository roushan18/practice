package stringconcepts;

public class Pallindrome {

	public static void main(String[] args) {
	
			String s1= "madam";
			String s2="";
			int len= s1.length();
			for (int i=1;i<=len;i++)
			{
				s2=s2+s1.charAt(len-i);
			}
			System.out.println(s2);
			System.out.println(pallindrome(s1,s2));
			System.out.println(s1.toUpperCase());

		}
		public static boolean pallindrome(String s1, String s2)
		{
			return s1.equals(s2);
		}

	}


