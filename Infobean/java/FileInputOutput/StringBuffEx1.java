

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringBuffEx1
 {
    public static void main(String[] args) 
    {

     Scanner sc=new Scanner(System.in);

        try  {
              FileWriter fw = new FileWriter("demo.txt");
               System.out.println("Enter text to write in file:");
            String data = sc.nextLine();
            fw.write(data);
              fw.close(); 
            System.out.println("File written successfully.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

    

