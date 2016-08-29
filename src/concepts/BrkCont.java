package concepts;

public class BrkCont {

	public static void main(String[] args) {
		int [] x={25,30,45,40};
		for(int num:x)
		{
			if (num==45)
			{
				break;
			}
			System.out.println("Values from break loop:"+num);
		}
		for(int num:x)
		{
			if(num==45)
			{
				continue;
			}
			System.out.println("values from continue loop: "+num);
		}

	}

}
