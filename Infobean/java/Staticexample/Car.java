package Staticexample;

public class Car 
{
    
     static String brand="BMW";
     int cost;
     String colour;

  void info(String colour, int cost)
  {

      System.out.println("Colour "+colour+" \n Cost :"+ cost+"\n Brand "+ brand);
  }

public static void main(String [] args) 
   {

    Car c= new Car();
    c.info("Blue",2000);
    c.info("Red",5000);

   }

}
