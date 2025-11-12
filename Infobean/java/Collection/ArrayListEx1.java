
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1
 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> abc =new ArrayList<Integer>();
        abc.add(10);
          abc.add(8);
            abc.add(50);
              abc.add(44);
                abc.add(22);
                abc.addFirst(999);

                System.out.println(abc);
                Collections.sort(abc);
                System.out.println(abc);
        
    }
}
