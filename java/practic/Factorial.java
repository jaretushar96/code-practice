import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}
