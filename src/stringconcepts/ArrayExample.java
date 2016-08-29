package stringconcepts;

public class ArrayExample {

	public static void main(String[] args) 
	{
		String [] sName= {"Roushan","Kumar","Jha"};
		
		for(String sPrint:sName)
		{
			System.out.print(sPrint+" ");
		
		}
		System.out.println();
		for(int i=0;i<sName.length;i++)
		{
			for(int j=0;j<sName[i].length();j++)
			{
				System.out.println(sName[i].charAt(j)); 
			}
			System.out.println( sName[i].length());
			System.out.println( sName[i]);
		}

	}

}
