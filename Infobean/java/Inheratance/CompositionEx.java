class Camera
{
   private int resolation;
     private int megapixal;

    Camera(int reso,int mega) 
    {
        resolation=reso;
        megapixal=mega;
    }

    void show()
    {
        System.out.println("Description of Camera  ");
        System.out.println("Resolation :"+resolation+" p\nMegapixele :"+megapixal+"Mp\n-------------------------------");
    }
}

class Processor
{
    
   private String probrand;
   private String core;
   private int frequency;

    Processor(String brand, String core,int frequency)
    {
    this.probrand=brand;
  this.core=core;
  this.frequency=frequency;

    }

    void show()
    {
        System.out.println(" Description of Processor  ");
        System.out.println("Breand :"+probrand+"\nCore :"+core+"\nFrequency :"+frequency+"GHz");
       
    }

}
class SmartPhone
{
   private Camera cam;
   private Processor pro;
 private String brand;
   private String model;
   private int price;

    SmartPhone(String brand, String model,int price)
    {
  this.brand=brand;
  this.model=model;
  this.price=price;
  this.pro=new Processor("Dragon","xy34",99);
  this.cam=new Camera(1080, 64);
    }

     void show()
    {
        System.out.println("--------------------------------\nDescription of SmartPhone  ");
        System.out.println("Brand :"+brand+"\nModel :"+model+"\nPrice :"+price);
        pro.show();
         cam.show();
    }


}



public class CompositionEx 
{
    

    public static void main(String[] args) {
        SmartPhone sm=new SmartPhone("Samsung", "S-23 Pro" , 56000);
        sm.show();
    }
}
