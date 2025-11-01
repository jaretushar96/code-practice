import java.util.Scanner;

class Display extends Thread
{    
  int bal;
     public void run()
      {
        diposit();
        withrawl();
       
      }
    void diposit()
    {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the amount for deposit");
         int amo=sc.nextInt();
         
         bal=bal+amo;
        System.out.println(amo+"IS Suscessfully Diposited");
        System.out.println("Avilable blance is "+bal);
    }

     void withrawl()
    {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the amount for Withrawl");
         int amo=sc.nextInt();
         
         bal=bal-amo;
        System.out.println(amo+"IS Withrawl Suscessfully ");
        System.out.println("Avilable blance is "+bal);
    }    

}

public class Bank 
{
   public static void main(String[] args) 
  {
     Display d1=new Display();
     d1.start();
  }  
}
