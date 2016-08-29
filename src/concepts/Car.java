package concepts;

public class Car {
	static int p;
	public static void upgradeOld()
	{
		p=66;
		System.out.println(p);
	}
	public static void newModel()
	{
		p=77;
		System.out.println(p);
		p++;
	}

	public static void main(String[] args) {
		System.out.println(p);
		p=88;
		upgradeOld();
		newModel();	
		System.out.println(p);

	}

}
