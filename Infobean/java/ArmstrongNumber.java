import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int digits = 0;

      
        while (temp > 0)
       {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;


        while (temp > 0) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (num == sum)
        {
            System.out.println(num + " is an Armstrong Number.");
        }  
        else
        {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
        }
}
