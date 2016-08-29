package arrayconcepts;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int[] a1= new int[3];
		a1[0]=55;
		a1[1]=43;
		a1[2]=22;
		for(int i=0; i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		for(int k: a1 )
		{
			System.out.println(k);
		}
		char[] ch= new char[4];
		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		for(char p:ch)
		{
			System.out.print(p);
		}

	}

}
