import java.util.HashMap;
import java.util.Scanner;
class Employee
{
    String name;
    int age;

    long salary;
    int performance;

    public Employee(String name, int age, long salary, int performance) 
    {
        this.name = name;
        this.age = age;
       
        this.salary = salary;
        this.performance = performance;
    }


    

}

public class EmployeePerformance {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap <String,Employee> emp1=new HashMap<>();
    
    System.out.println("Enter  Name :");
    String name=sc.nextLine();

      System.out.println("Enter  Age :");
    int age=sc.nextInt();

     System.out.println("Enter  Salary :");
    long salary=sc.nextInt();



      

   } 
}
