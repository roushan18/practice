package arrayconcepts;

public class Employee {
	String empId;
	String empName;
	double empSal;
	
	public Employee(String empId,String empName,double empSal)
	{
		this.empId= empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	public String toString()
	{
		String newLine = System.getProperty("line.separator");
		return  "Details of "+empName  + newLine + empId + newLine + empSal;
	}
	
	public boolean equals(Object o1)
	{
		Employee e3= (Employee)o1;
		return this.empSal==e3.empSal;
	}

	public static void main(String[] args)
	{
		Employee emp1= new Employee("TCS530795","Roushan",800000);
		Employee emp2= new Employee("ACC85962","Sanjay",800000);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp1.equals(emp2));
		
		Employee[] em = new Employee[2];
		
		em[0]= new Employee("TCS530795","Roushan",800000);
		em[1]= new Employee("ACC85962","Sanjay",800000);
		for(Employee e:em)
		{
			System.out.println(e);
		}
		
	

	}

}
