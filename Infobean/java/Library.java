
import java.util.*;
import java.util.Scanner;

public class Library 
{
    
    
    static String []user=new String[10];
    private int[] pass=new int[10];
      static String []book=new String[10];
      int userc=0;
      int bookc=0;
     
     
    void create(Scanner sc)
    {
        System.out.println("Enter your username ");
        String n=sc.next();
         System.out.println("Enter your Pasward  ");
         int p=sc.nextInt();
       user[userc]=n;
       pass[userc]=p;
       userc++;

    }

    boolean login(Scanner sc)
    {
         System.out.println("Login through Your Creadantials  ");
           System.out.println(" USERNAME : ");
           String n1=sc.next();
            System.out.println(" PASWORD : ");
            int p1=sc.nextInt();
            for (int i = 0; i < userc; i++){
            if(user[i].equals(n1)&& pass[i]==p1)
            {
               System.out.println(" LOGIN Sucessfully  : "); 
              return true;
              
            }
            
        }
        
              System.out.println(" User not Match   : ");   
              return false;
    }


    void addbook(Scanner sc)
    {
           System.out.println("Enter BookName ");
        String b1=sc.next();

       book[bookc]=b1;
       bookc++;
        System.out.println("Book added successfully\n");
    }

    void display(Scanner sc)
    {     
           System.out.println("Book avilable in Linrary  : ");    
        for (int i=0;i<bookc;i++)
        {
               System.out.println(book[i]);
        }
    }

    void search(Scanner sc)
    {
            System.out.println("Enter BOOK NAME FOR SEARCH  ");
            String search=sc.next();
             for (int i=0;i<bookc;i++)
        {
              if (search.equals(book[i]))
              {
                System.out.println(search+ " is Avilable in Library ");
              }
        }
    }





    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
    
      Library l=new Library();
       while(true)
       {
          System.out.println(" Enter our choice  ");
          System.out.println("\n 1. Create Account \n 2. Login \n 3. Exit  ");
          int cho=sc.nextInt();

          switch(cho)
          {

            case 1:
                 l.create(sc); 
                 break;
            case 2:
                   boolean check=l.login(sc);
                  if(check)
                  {
                         while(true)
                         {
                            System.out.println(" Enter our choice  ");
                             System.out.println("\n 1. Add book \n 2. search Book \n 3. Display Books \n 4. Exit  ");
                            int cho1=sc.nextInt();
                            
                            switch(cho1)
                            {
                                case 1:
                                         l.addbook(sc);
                                         break;
                                     
                                case 2:
                                         l.search(sc);
                                         break; 
                                         
                                case 3:
                                         l.display(sc);
                                         break; 
                                         
                                case 4:
                                        System.out.println(" YOU Log Out Sucessfully   "); 
                                         break;          
                            }
                            if (cho1 == 4) break;
                          } 
                        
                  }
                  break;
            case 3:
                     System.out.println(" YOU exited Sucessfully   "); 
                    return;     

       }
     

    }
}
}
