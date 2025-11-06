import java.util.Scanner;

class ReachAtMax extends Exception
{
    public ReachAtMax(String msg)
    {
        super(msg);
    }
}

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
       int err=0;
   
        while (err<5) {
            try { 
                System.out.print("Enter array index (0–4): ");
                int index = sc.nextInt();
                if(index<arr.length)
                {
                      System.out.println("Value at index " + index + " = " + arr[index]);
                }
                else
                {  
                     err++;
                    throw new ArrayIndexOutOfBoundsException();
                   
                }
            } 
            
        
            catch (ArrayIndexOutOfBoundsException e) {
              
                System.out.println("Invalid index Try again.");
            }
        }
            try{
             if (err >= 5) {
            System.out.println("Error!");
            throw new ReachAtMax(" REach at max");
             }
        }  catch(ReachAtMax e)
        {
            System.out.println(e.getMessage());
        }    

       
    }
}
