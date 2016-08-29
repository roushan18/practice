package concepts;
//concepts related to do-while,while,for,break,continue//

public class Loop {
	public int i=0,k=0;

	public static void main(String[] args) 
	{
		Loop ref=new Loop();
		Loop ref2=new Loop();
		
		// do-while loop first executes loop body then checks for condition//
		do
		{
			System.out.println("Executing from do-while loop");
			ref.i=ref.i+1;
			System.out.println("Add 1 to number "+ref.i+"result is: "+ref.i);
		}while (ref.i<0);
	// while loop first check condition then enters to loop body//
		
		while(ref2.i<0)
		{
			System.out.println("Executing from while loop");
			ref2.i=ref2.i+1;
			System.out.println("Add 1 to number "+ref2.i+"result is: "+ref2.i);
		
		}
		//upon encountering break statement ,control comes out of loop body
		for(int i=1;i<=10;i++)
		{
			if (i==6)
				{
				System.out.println("Value is 6, so exiting from loop body");
				 break;		
				}
			else
			{
				System.out.println("Counting until value reaches to 5 :"+i);

			}
		}
		for(int i=1;i<=10;i++)
		{
			if (i==6)
				{
				System.out.println("Value is 6, so not printing it. Statement before continue");
				 continue;
				 // Statement after continue are unreachable statements//
				}
			else
			{
				System.out.println("Counting value between 1 to 10 excluding 6 :"+i);

			}
		}
	}

}
