import java.util.Scanner;

public class Palindeome {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the string :");

        String str = sc.nextLine();
        
        // boolean isPalindrome = true;
        int c=0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
              
                c++;
                // isPalindrome = false;
                break;
            }
        }
        System.out.println((c==0) ? "Palindrome" : "Not Palindrome");
        // System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}

