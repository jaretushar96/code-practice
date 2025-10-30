import java.util.Scanner;

public class OmJaggedArray
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create jagged array (rows are fixed, columns can vary)
        int[][] jaggedArray = new int[3][];  // 3 rows

         // Step 2: Accept number of columns for each row from user
        for (int i = 0; i < jaggedArray.length; i++) 
        {
            System.out.print("Enter number of elements for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols]; // Create columns dynamically
        }

        // // Step 3: Accept elements for this row
        for (int i = 0; i < jaggedArray.length; i++) {
            
            System.out.println("Enter " + jaggedArray[i].length + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Step 4: Display the jagged array
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
