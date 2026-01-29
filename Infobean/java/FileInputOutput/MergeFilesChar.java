import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFilesChar
 {
    public static void main(String[] args) 
    {

        try (FileWriter fw = new FileWriter("merged.txt");
             FileReader fr1 = new FileReader("file1.txt");
             FileReader fr2 = new FileReader("file2.txt")) {

            int ch;

            while ((ch = fr1.read()) != -1) {
                fw.write(ch);
            }

            fw.write('\n');

            while ((ch = fr2.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("Files merged successfully (char method).");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
