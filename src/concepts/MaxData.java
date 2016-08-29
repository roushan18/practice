package concepts;

 abstract class MaxData {
	 int id;
	 String name;
	 
	 abstract public MaxData name();
	 abstract public String desig(int id);
	

}
 class Employee extends MaxData
 {

	 public MaxData name()
	 {
		 System.out.println("Name : "+this.name);
		 return this;
	 }
	 public String desig(int id)
	 {
		 return this.name;
	 }
	 
 }
 class Execution1
 {
	 public static void main(String[]args)
	 {
		 MaxData e1= new Employee();
		 e1.id= 530795;
		 e1.name="Roushan";
		 System.out.println(e1.name().desig(530795));
		System.out.println(e1.desig(530795));
		 
	 }
 }
