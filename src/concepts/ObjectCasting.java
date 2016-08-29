package concepts;
//Derived/Object casting is possible among derived data types, only when inheritance occurs.
 class A1
{
	public void perform_A()
	{
		System.out.println("Reportng from class A");
	}
}
 class B1 extends A1
{
	public void perform_B()
	{
		System.out.println("Reportng from class B");
	}
}
public class ObjectCasting {

	public static void main(String[] args) {
	
		B1 b1= new B1();
		//Upcasting--two ways
		A1 a2= (A1)b1;
		a2.perform_A();
		A1 a3= new B1();
		a3.perform_A();
		//Downcasting-only upcasted object can be downcasted
		B1 b4= (B1) a2;
		b4.perform_B();
		b4.perform_A();
		B1 b5= (B1)a3;
		b5.perform_A();
		b5.perform_B();
		

	}

}
