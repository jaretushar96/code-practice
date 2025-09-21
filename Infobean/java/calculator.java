import java.util.Scanner;
public class calculator 
{




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) 
        {
            System.out.println("\n----- Calculator -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 8) 
            {
                System.out.println("Exiting Calculator...");
                break;
            }

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    System.out.println("Result = " + (a1 + b1));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    int a2 = sc.nextInt();
                    int b2 = sc.nextInt();
                    System.out.println("Result = " + (a2 - b2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    int a3 = sc.nextInt();
                    int b3 = sc.nextInt();
                    System.out.println("Result = " + (a3 * b3));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    int a4 = sc.nextInt();
                    int b4 = sc.nextInt();
                    if (b4 != 0) {
                        System.out.println("Result = " + (a4 / b4));
                    } else {
                        System.out.println("Division by zero not allowed!");
                    }
                    break;

                case 5:
                    System.out.print("Enter two numbers: ");
                    int a5 = sc.nextInt();
                    int b5 = sc.nextInt();
                    if (b5 != 0) {
                        System.out.println("Result = " + (a5 % b5));
                    } else {
                        System.out.println("Modulus by zero not allowed!");
                    }
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int s = sc.nextInt();
                    System.out.println("Square = " + (s * s));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    int c = sc.nextInt();
                    System.out.println("Cube = " + (c * c * c));
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
      
    }
}

    

