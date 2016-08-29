package concepts;

public class DecisionMaking {

	public static void main(String[] args) 
	{
		char grade='A';
		int num= 99;
		switch(grade)
		{
		case 'A': System.out.println("Well Done");
		break;
		case 'B':
		case 'C': System.out.println("passed");
		break;
		case 'D':System.out.println("Failed");
		break;
		default : System.out.println("Not Valid");
		}
		System.out.println("Your grade is: "+grade);
		switch(num)
		{
		case 99: System.out.println(" Secured 99");
		break;
		case 88: System.out.println(" Secured 88");
		break;
		}
		


	}

}
