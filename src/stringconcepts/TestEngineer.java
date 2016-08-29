package stringconcepts;

public class TestEngineer {
	double salary;
	String company;
	int iD;
	
	public TestEngineer(double salary,String company,int iD)
	{
		this.salary=salary;
		this.company=company;
		this.iD=iD;
	}
	

	public static void main(String[] args) {
		TestEngineer er1= new TestEngineer(7.5,"TCS",65098);
		TestEngineer er2= new TestEngineer(7.5,"TCS",65098);
		TestEngineer er3= new TestEngineer(7.5,"TCS",65098);
		
		System.out.println(er1.equals(er2));
		System.out.println(er1.equals(er3));
		System.out.println(er2.equals(er3));

	}
	public boolean equals(Object o1)
	{
		TestEngineer te=(TestEngineer)o1;
		return (this.iD==te.iD && this.salary==te.salary && this.company==te.company);
		
	}

}
