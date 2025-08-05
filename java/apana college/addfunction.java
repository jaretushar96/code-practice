// import java.util.Scanner;


// public class addfunction{
//     public static void main(String[] args) {
//         System.out.println("enter 3 numbers"); 
      
//         Scanner sc=new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();
//         int sum = addThreeNumbers(num1, num2, num3);
//         System.out.println("Sum of three numbers: " + sum); 
//     }
    
//     public static int addThreeNumbers(int a, int b, int c) {
    
//            return a + b + c;
//     }
// }



// import java.util.Scanner;


// public class addfunction {

// public static void addThreeNumbers() {
//     Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int sum=a + b + c;
//         System.out.println("Sum of three numbers: " + sum); 
//     }



//     public static void main(String[] args) {
//         System.out.println("enter 3 numbers"); 
      
        
//         addThreeNumbers();
        
//     }
    
    
// }


import java.util.Scanner;


public class addfunction {

public static void addThreeNumbers(int p,int q,int r) {
   
        int sum=p+ q + r;
        System.out.println("Sum of three numbers: " + sum); 
    }



    public static void main(String[] args) {
        System.out.println("enter 3 numbers"); 
       Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        addThreeNumbers(a,b,c);
    
        
    }
    
    
}