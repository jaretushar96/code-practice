package Abstractio_Interfaces;

abstract class phone
{
	abstract void calling();
	
	abstract void camera();
	abstract void torch();
	
}



class oppo extends phone
{

	
	void calling() 
	{
		System.out.println("\n ------------------------------------------\n IN OPPO PHONE\n");	
	System.out.println(" Calling Function is Avilable ");	
	}

	
	void camera() 
	{
		
		System.out.println(" Camera Function is Avilable ");	
	}

	
	void torch() 
	{
		System.out.println(" torch Function is Avilable ");	
	}
	
	void gps() 
	{
		System.out.println(" GPS Function is Avilable ");	
	}
	
}

class vivo extends phone
{

	
	void calling() 
	{
		System.out.println(" \n ------------------------------------------\n IN VIVO PHONE \n");	
	System.out.println(" Calling Function is Avilable ");	
	}

	
	void camera()
	 {
		
		System.out.println(" Camera Function is Avilable ");	
	}

	
	void torch() 
	{
		System.out.println(" torch Function is Avilable ");	
	}
	
	void gaming() 
	{
		System.out.println(" Gaming Function is Avilable ");	
	}
	
}

public class AbstractEx1 {

	public static void main(String [] args)
	{
		vivo v=new vivo();
		v.calling();
		v.camera();
		v.torch();
		v.gaming();
		oppo o=new oppo();
		o.calling();
		o.camera();
		o.torch();
		o.gps();
	}
	
}
