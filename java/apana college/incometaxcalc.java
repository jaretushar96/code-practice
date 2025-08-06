import java.util.Scanner;


public class incometaxcalc {
    public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);   
     System.out.print("enter your amount for calculating tax :");
    int income =sc.nextInt();
    int tax=0;
    if (income <= 10000) {
            tax = 0;  // No tax for income <= 10,000
        } else if (income <= 30000) {
            tax = (int) ((income - 10000) * 0.10);  // 10% tax for income between 10,001 and 30,000
        } else if (income <= 100000) {
            tax = (int) ((30000 - 10000) * 0.10 + (income - 30000) * 0.20);  // 20% tax for income between 30,001 and 100,000
        } else {
            tax = (int) ((30000 - 10000) * 0.10 + (100000 - 30000) * 0.20 + (income - 100000) * 0.30);  // 30% tax for income above 100,000
        }

        //  System.out.println("Your income tax is: " + tax);
//     if(income<=50000)
//     {
//        tax=0;
//     }
//      else if(income<50000&&income>=100000)
//     {
//        tax=((int)(income*0.5));
//     }
//  else if(income<100000&&income>=1000000)
//     {
//        tax=((int)(income*0.9));
//     }


 System.out.println(" tax for your amount is :" + tax);
    }
}


// import java.util.Scanner;

// public class incometaxcalc {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get the user's income
//         System.out.print("Enter your annual income (as an integer): ");
//         int income = scanner.nextInt();

//         // Calculate the tax
//         int tax = calculateTax(income);

//         // Print the tax amount
//         System.out.println("Your income tax is: " + tax);

//         scanner.close();
//     }

//     public static int calculateTax(int income) {
//         int tax = 0;

//         if (income <= 10000) {
//             tax = 0;  // No tax for income <= 10,000
//         } else if (income <= 30000) {
//             tax = (int) ((income - 10000) * 0.10);  // 10% tax for income between 10,001 and 30,000
//         } else if (income <= 100000) {
//             tax = (int) ((30000 - 10000) * 0.10 + (income - 30000) * 0.20);  // 20% tax for income between 30,001 and 100,000
//         } else {
//             tax = (int) ((30000 - 10000) * 0.10 + (100000 - 30000) * 0.20 + (income - 100000) * 0.30);  // 30% tax for income above 100,000
//         }

//         return tax;
//     }
// }









// import java.util.Scanner;

// public class incometaxcalc {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get the user's income
//         System.out.print("Enter your annual income (as an integer): ");
//         int income = scanner.nextInt();

//         // Calculate the tax
//         // int tax = calculateTax(income);

//         // Print the tax amount 
       

//         // scanner.close();
    

//     // public static void calculateTax(int income) {
//         int tax = 0;

//         if (income <= 10000) {
//             tax = 0;  // No tax for income <= 10,000
//         } else if (income <= 30000) {
//             tax = (int) ((income - 10000) * 0.10);  // 10% tax for income between 10,001 and 30,000
//         } else if (income <= 100000) {
//             tax = (int) ((30000 - 10000) * 0.10 + (income - 30000) * 0.20);  // 20% tax for income between 30,001 and 100,000
//         } else {
//             tax = (int) ((30000 - 10000) * 0.10 + (100000 - 30000) * 0.20 + (income - 100000) * 0.30);  // 30% tax for income above 100,000
//         }

//          System.out.println("Your income tax is: " + tax);
//     }
// }