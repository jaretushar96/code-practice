import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStringBuffer 
{
    public static void main(String[] args) 
    {

        StringBuffer sb = new StringBuffer();
        

        try  {
                BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
            String line;

            while ((line = br.readLine()) != null) {
            //    sb.append(line).append("\n");
             System.out.println(line);
            }
              
            br.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println("File Content:");
        // System.out.println(sb.toString());

        
    }
}
