package Staticexample;

public class Car 
{
    
static String brand="BMW";
int cost;
String colour;

void info(String colour, int cost)
{

System.out.println(colour+" "+ cost+" "+ brand);
}

public static void main(String [] args)
{

    Car c= new Car();
    c.info("Red",2000);

}

}
