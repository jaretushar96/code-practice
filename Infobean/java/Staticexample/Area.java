package Staticexample;
import java.util.*;
import java.util.Scanner;
public class Area {
    
  static float pi=3.14f;

  public static int add(int a, int b)
  {
      return(a+b);
  }

  public static float area(float r)
  {
        return(pi*r);
  }

    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);


Area ar=new Area();

System.out.println(ar.add(3,5));
System.out.println(ar.area(3.0f));


        
    }

}
