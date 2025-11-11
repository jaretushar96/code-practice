package Abstractio_Interfaces;

interface animals
{
    abstract void eat();
    abstract void sleep();
}

abstract class monkey 
{
    abstract void jump();
    abstract void bite();
   
}

class human extends monkey implements animals
{


	public void eat() 
	{
		System.out.println(" Eat method Form interface");
		
	}

	public void sleep() 
	{
		System.out.println(" Sleep method Form interface");
		
	}

	
	void jump() 
	{
		System.out.println(" Jump method Form Class Monkey");
	}

	
	void bite() 
	{
		System.out.println(" Bite method Form  cLASS MONKEY	");
		
	}
	
}

public class AbstractionEx3 
{
	public static void main(String [] args)
	{
		human h=new human();
		h.eat();
		h.sleep();
		h.jump();
		h.bite();
		
	}
}
