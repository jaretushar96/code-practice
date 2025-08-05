
import java.util.Scanner;

public class factorial {

    public static void fact() {   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the range for getting factorial: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int j = a; j <= b; j++) {
            int f = 1; 

            for (int i = 1; i <= j; i++) {
                f = f * i;
            }

            System.out.println("Factorial of " + j + " is: " + f);
        }
    }

    public static void main(String[] args) {
        fact();
    }
}