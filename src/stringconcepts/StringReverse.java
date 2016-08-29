package stringconcepts;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sRev=" ";
		
		String str= "why so serious";
		String[] sArray= str.split(" ");
		for(String s: sArray)
		{
			System.out.println(s);
		}
		for(int i=0;i<sArray.length;i++)
		{
			int sLen= sArray[i].length();
			for(int j=0;j<sLen;j++)
			{
				sRev= sRev+sArray[i].charAt(sLen-j-1);
//				System.out.println(sRev);
			}
			sRev= sRev+" ";
		}
		System.out.println((sRev).trim());
		
		
		String [] sRevArray= new String[sArray.length];
		for (int i=0;i<sArray.length;i++)
		{
			sRevArray[i]=sArray[sArray.length-i-1];
			
		}
	
		for(String s:sRevArray)
		{
			System.out.print(s+" ");
			
		}
		
		
		

	}

}
