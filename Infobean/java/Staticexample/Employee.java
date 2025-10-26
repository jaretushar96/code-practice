
package Staticexample;
import java.util.*;
import java.util.Scanner;

public class Employee {

    int emp_id;
    String emp_name;
    static String company="Microsoft";

     Employee( int emp_id , String emp_name) 
    {
       this.emp_id=emp_id;
       this.emp_name=emp_name;

    System.out.println(" \n\n"+emp_name+" is employee of "+company+" and his employee id is :"+emp_id);

  
    }

    

public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
      
    
for(int i=1;i<=5;i++){
     System.out.println(" enter the  id & name of employee " );
  int a= sc.nextInt();
  String str=sc.next();
    Employee em= new Employee(a,str);
   
}
}

    
}
