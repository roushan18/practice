package concepts;

public class Pattern {

	public static void main(String[] args) {
		
		
		for (int row= 1; row<=3;row++)
		{			
			for (int cell=1;cell<=3;cell++)
			{
				if (row>=cell)
				{
					int r= (cell+row)%2;
					char b=(r==1?'*':'#');
					System.out.print(b);
					
				}	
			
				
			}
			System.out.println();
		}

	}

}
