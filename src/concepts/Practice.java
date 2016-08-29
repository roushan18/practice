package concepts;

public class Practice {

	public static void main(String[] args) {
		mul(8);
		Practice p=new Practice();
		System.out.println(p.isEven(7));
		System.out.println( multiply(8,6));

	}
	public static void mul(int n)
	{
		for (int i=1; i<=10;i++)
		{
			System.out.println("multiplication of "+ n+ " * "+i+"="+ n*i);
		}
	}

	public boolean isEven(int n)
	{
		return (n%2==0);
	}
	public static int multiply(int a, int b)
	{
		return (a*b);
	}
}
