class Employee
{   
      String com;
      String name;
      int sal;

    Employee(String com,String name,int sal)
     {
        this.com=com;
        this.name=name;
        this.sal=sal;
      

    }

      

    void calculateBonus()
    {
              System.err.println("-------------------");
              System.out.println("Company :"+com +"\n Name :"+name);
    }
}

class Manager extends Employee
{
    int bonus;

   Manager(String com,String name,int sal,int bonus) {
        super(com, name,sal);
        this.bonus=bonus;
    }
    void calculateBonus()
    {

                super.calculateBonus();
              System.out.println("Bonous :"+bonus +"\n Total Salary :"+(sal+bonus));
    }

}

class Developer extends Employee
{
     int bonus;
    Developer(String com,String name,int sal,int bonus) {
       super(com, name,sal);
        this.bonus=bonus;
    }
    
  

    void calculateBonus()
    {
             super.calculateBonus();
              System.out.println("Bonous :"+bonus +"\n Total Salary :"+(sal+bonus));
    }
}

class Intern extends Employee
{
Intern(String com,String name,int sal) {
       super(com, name,sal);
}
       void calculateBonus()
    {
            super.calculateBonus();
              System.out.println("Bonous : No bonous for Intern \n Total Salary :"+(sal));
    }
    }

public class OverridingEx2 {
    public static void main(String[] args) {
        
   Employee[] emp=
   {
    new Manager("Google", "Tushar", 9999999, 100000),
    new Developer("Wipro", "Dipak", 100000, 99999),
    new Intern("Infosys", "Raju", 20000)
   };

   for(Employee e:emp )
   {
    e.calculateBonus();
   }

    }
}
