package stringconcepts;

public class CountCharacter {

	public static void main(String[] args) {
		String s2= "JavaLiciousu";
		String s1= s2.toLowerCase();
		int len= s1.length();
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		for (int i=0; i<len; i++)
		{
			
			char ch= s1.charAt(i);
			switch (ch)
			{
			case 'a': aCount++;
			break;
			case 'e': eCount++;
			break;
			case 'i': iCount++;
			break;
			case 'o': oCount++;
			break;
			case 'u': uCount++;
			break;		
			
			}
			
		
		}
		System.out.println("Count of vowel 'a' is "+ aCount);
		System.out.println("Count of vowel 'e' is "+ eCount);
		System.out.println("Count of vowel 'i' is "+ iCount);
		System.out.println("Count of vowel 'o' is "+ oCount);
		System.out.println("Count of vowel 'u' is "+ uCount);
	}

}
