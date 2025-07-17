import java.util.Random;
import java.util.Scanner;
public class rock_paper {

public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);

   int c=0;
   int l=0;
   String[] choice ={"Rock", "paper", "seaseer"};
   Random rm= new Random();
   

   for(int i=1; i<= 5 ;i++)
   {
    int rn=rm.nextInt(3)+1;
     String result=choice[rn-1];
    
    
    System.err.println("Enter the number for your choice \n 1. Rock \n 2. Paper \n 3. Seasser ");
    System.err.print(" Enter the number :");
    int num= sc.nextInt();

    
    System.err.println("\tother player select "+ result);

    if(rn==1 && num==2 || rn==2&& num==3 ||  rn==3&& num==1)
    {
        c++;

        System.err.println("\tYou won " + i +" st step \n");
        
    }
    
    else if(rn==num)
    {

        

        System.err.println("\t   You both selected same , So " + i +" st step is Draw \n");
    }

   else 
   { 
    l++;
    System.err.println("\tYou lost " + i +" st step\n ");
   }

   }

   
if(c>l)
{
    System.err.println("\n\nYou won this match ");
}
else if(c==l)
{
    System.err.println("\n\nYour match is Draw  ");
}
else
{
    System.err.println(" \n \nSorry ! but You lost this match ");
}
 
}
    
}
