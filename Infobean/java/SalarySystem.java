

class Employee
{
	String name;
	int salary;
	
	final double BonuseRate=0.1;
	
	
	
	 Employee(String name, int salary) {
	
		this.name = name;
		this.salary = salary;
	}



	void calculateBonus()
	{
		System.out.println(" Name :"+ name +" \n salary :"+salary);
	}
	
}

class manager extends Employee
{
	String position;

	public manager(String name, int salary, String position) {
		super(name, salary);
		this.position = position;
	}
	
	void calculateBonus()
	{
		System.out.println("\n---------------------------\nPosition :"+position);
		super.calculateBonus();
		System.out.println("Bonus :"+(salary*BonuseRate));
		System.out.println("Total salary After bonus :"+((salary)+(salary*BonuseRate)));
		
		
	}
	
	
}

class Developer extends Employee
{
	String position;

	public Developer(String name, int salary, String position) {
		super(name, salary);
		this.position = position;
	}
	
	
	void calculateBonus()
	{
		System.out.println("\n---------------------------\nPosition :"+position);
		super.calculateBonus();
		System.out.println("Bonus :"+(salary*BonuseRate));
		System.out.println("Total salary After bonus :"+((salary)+(salary*BonuseRate)));
		
		
	}
	
	
	
}

public class SalarySystem {
	

	public static void main(String []args)
	{
		
		manager m=new manager("Tushar",30000,"manager");
		m.calculateBonus();
		
		
		Developer d=new Developer("Dipak",20000,"Developer");
		d.calculateBonus();
	}

}