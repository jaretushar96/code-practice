import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFilesByte 
{
    public static void main(String[] args) 
    {
         
        try (FileOutputStream fos = new FileOutputStream("merged.txt");
             FileInputStream fis1 = new FileInputStream("file1.txt");
             FileInputStream fis2 = new FileInputStream("file2.txt")) {

            int b;

            // Copy file1
            while ((b = fis1.read()) != -1) 
                {
                fos.write(b);
            }

            // Add newline
            fos.write('\n');

            // Copy file2
            while ((b = fis2.read()) != -1) {
                fos.write(b);
            }

            System.out.println("Files merged successfully (byte method).");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
