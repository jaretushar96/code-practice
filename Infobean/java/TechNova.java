// ===============================
// TechNova Employee Management System
// Demonstrates: Arrays, Access Specifiers, Type Casting, Inheritance,
// Polymorphism, Abstraction, Interfaces, Aggregation, Composition
// ===============================

// ---------- Interface ----------
interface Workable 
{
    void work();
}

// ---------- Abstract Class ----------
abstract class Employee implements Workable 
{
    private int id;
    private String name;
    protected double salary; // protected for subclass access
    static int count = 0;

    public Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    // Getters
    public int getId()
     { return id; }
    public String getName() 
    { return name; }
    public double getSalary()
     { return salary; }

    // Concrete method
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary);
    }

    // Abstract method
    abstract double calculateBonus();
}

// ---------- Subclass 1 ----------
class Developer extends Employee
 {
    public Developer(int id, String name, double salary) 
    {
        super(id, name, salary);
    }

    @Override
    double calculateBonus() 
    {
        return salary * 0.10;
    }

    @Override
    public void work()
     {
        System.out.println("Work: Writing and testing Java code.");
    }
}

// ---------- Subclass 2 ----------
class Manager extends Employee
 {
    public Manager(int id, String name, double salary) 
    {
        super(id, name, salary);
    }

    @Override
    double calculateBonus() 
    {
        return salary * 0.20;
    }

    @Override
    public void work() 
    {
        System.out.println("Work: Managing team and reviewing performance.");
    }
}

// ---------- Subclass 3 ----------
class Intern extends Employee 
{
    public Intern(int id, String name, double salary) 
    {
        super(id, name, salary);
    }

    @Override
    double calculateBonus() 
    {
        return salary * 0.05;
    }

    @Override
    public void work()
     {
        System.out.println("Work: Assisting developers and learning new skills.");
    }
}

// ---------- Aggregation ----------
class Department {
    private String deptName;
    private Employee[] employees;
    private int index = 0;

    public Department(String deptName, int size) 
    {
        this.deptName = deptName;
        employees = new Employee[size];
    }

    public void addEmployee(Employee e) 
    {
        if (index < employees.length) 
        {
            employees[index++] = e;
        } 
        else 
        {
            System.out.println("Department is full, cannot add more employees.");
        }
    }

    public void showEmployees()
     {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) 
        {
            if (e != null) 
            {
                e.displayInfo();
                System.out.println("Bonus: " + e.calculateBonus());
                e.work();
                System.out.println("-----------------------------------");
            }
        }
    }

    public String getDeptName() 
    {
        return deptName;
    }
}

// ---------- Composition ----------
class Company 
{
    private final Department dept; // composition: created inside constructor

    public Company() 
    {
        dept = new Department("IT Department", 3);
    }

    public void manageDepartments() 
    {
        System.out.println("\nCompany: TechNova Solutions");
        System.out.println("Managing department: " + dept.getDeptName());
    }

    public Department getDepartment() 
    {
        return dept;
    }
}

// ---------- Main Class ----------
public class TechNova 
{
    public static void main(String[] args) 
    {
        System.out.println("===== TechNova Employee Management System =====");

        Company company = new Company(); // composition example
        Department dept = company.getDepartment();

        // Create employees (Inheritance + Polymorphism)
        Employee e1 = new Developer(101, "Tushar", 50000);
        Employee e2 = new Manager(102, "Priya", 80000);
        Employee e3 = new Intern(103, "Rahul", 20000);

        // Add employees (Aggregation)
        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(e3);

        // Display employees
        dept.showEmployees();

        // Display company and department info
        company.manageDepartments();

        // Show total employees (Static example)
        System.out.println("\nTotal Employees: " + Employee.count);

        // -------- Type Casting Demo --------
        System.out.println("\n--- Type Casting Demonstration ---");
        Employee emp = new Developer(104, "Ravi", 60000); // Upcasting
        emp.displayInfo();
        emp.work();

        // Downcasting
        if (emp instanceof Developer) 
        {
            Developer dev = (Developer) emp;
            System.out.println("Downcasting successful. Bonus: " + dev.calculateBonus());
        }
    }
}
