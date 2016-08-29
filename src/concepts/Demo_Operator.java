package concepts;

public class Demo_Operator extends ConditionalOperator{

	public static void main(String[] args) {
		ConditionalOperator co= new Demo_Operator();
		boolean res = co instanceof Demo_Operator;
		System.out.println(res);
		
	}

}
