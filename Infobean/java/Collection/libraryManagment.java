import java.util.Scanner;
import java.util.ArrayList;


class Library
{

ArrayList<String> book = new ArrayList<String>();




    void add(Scanner sc)
    {
       System.out.println("Enter book Name :");
       String str=sc.nextLine();
       book.add(str);
    }

    void display()
    {
        System.out.println(book);
    }

   void  issued(Scanner sc)
    {
            System.out.println("Enter Book name For Issued book");
            String b3=sc.nextLine();
           for (int i = 0; i < book.size(); i++) {
        if (book.get(i).equalsIgnoreCase(b3)) {
            book.remove(i);
            System.out.println("Book '" + b3 + "' issued successfully!");
        }
    }
        
    }

    void returnBook(Scanner sc)
    {
             System.out.println("Enter Book name For Reurned ");
            String b3=sc.nextLine();
            if(book.contains(b3))
            {
               System.out.println("You entered Wrong Book , Book is already Present  ");
            }
            else
            {
                book.add(b3);
                System.out.println("Book '" + b3 + "' Returned successfully!");
        }
            }
    



}
public class libraryManagment {
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      Library l=new Library();
      while(true){
      System.out.println("1. Add Book \n2. Issued Book \n3. Return Book \n4. Display Books \n5 Exit");
      System.out.println("Enter your choices ");
        int cho=sc.nextInt();
      if(cho==5)
      {
        System.out.println("You Exicted Sucessfully");
        break;
      }
    
      sc.nextLine();
      switch(cho)
      {
        case 1:
              l.add(sc);
              break;

         case 2:
             l.issued(sc);
              break; 
         case 3:
             l.returnBook(sc);
              break; 
              
          case 4:
             l.display();
              break;    
      }
      }


   } 
}
