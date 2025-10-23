package Staticexample;

public class calculator {
    static int a=10,b=12;
   static int add()
   {
    return(a+b);
   }

    static int sub()
   {
    return(a-b);
   }


    static int mult()
   {
    return(a*b);
   }


    static int div()
   {
    return(a/b);
   }
   public static void main(String []args )
   {
        
   System.out.println("addition :"+add());
   System.out.println("straction :"+sub());
   System.out.println("Multiplication :"+mult());
   System.out.println("Division :"+div());
  

   }
}
