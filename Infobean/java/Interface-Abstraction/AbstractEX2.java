package Abstractio_Interfaces;

abstract class pen
{
	abstract void write();
	abstract void refil();
	
}
class FountainPen extends pen
{

	@Override
	void write()
	 {
		System.out.println(" Write method");
		
	}

	@Override
	void refil() 
	{
		System.out.println(" Refil method");
	}
	
	
	void ink()
	 {
		System.out.println(" Red ink method");
	}
}

public class AbstractEX2 
{
	public static void main(String [] args)
	{
		FountainPen f=new FountainPen();
		f.write();
		f.refil();
		f.ink();
	}
}
