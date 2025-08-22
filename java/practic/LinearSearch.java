import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 25, 30, 45, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        int c=0;
        // boolean found = false;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                System.out.println("Found at index: " + i);
                // found = true;
                c++;
                break;
            }
        }

        if (c==0) 
        {
            System.out.println("Not found");
        }

        sc.close();
    }
}
