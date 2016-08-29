package concepts;
 interface  A
{
	 public void check();
	 public static void run()
	 {
		 System.out.println("Run");
	 }
	
}
 interface C
 {
	 public void super1();
	 public void check();
 }
 class D{
	 public static String don(){
	 return "DOn";
 }
 }
class B extends D implements A , C
{
	public void check()
	{
		System.out.println("check is done from class B");
	}
	public void super1()
	{
		System.out.println("Super");
	}
}
public class UpcastingExample {

	public static void main(String[] args) {
		A a1 = new B();
		B b1= new B();
		System.out.println(B.don());
		b1.super1();
		a1.check();
		A.run();

	}

}
