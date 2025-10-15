class Camera
{
   private int resolation;
     private int megapixal;

    Camera(int reso,int mega) {
        resolation=reso;
        megapixal=mega;
    }

    void show()
    {
        System.out.println("Description of Camera  ");
        System.out.println("Resolation :"+resolation+" p\nMegapixele :"+megapixal+"Mp\n-------------------------------");
    }
}

class processor
{
    
   private String probrand;
   private String core;
   private int frequency;

    processor(String brand, String core,int frequency)
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
class smartPhone
{
   private Camera cam;
   private processor pro;
 private String brand;
   private String model;
   private int price;

    smartPhone(String brand, String model,int price)
    {
  this.brand=brand;
  this.model=model;
  this.price=price;
  this.pro=new processor("Dragon","xy34",99);
  this.cam=new Camera(1080, 64);
    }

     void show()
    {
        System.out.println("--------------------------------\nDescription of Smartphone  ");
        System.out.println("Brand :"+brand+"\nModel :"+model+"\nPrice :"+price);
        pro.show();
         cam.show();
    }


}



public class CompositionEx {
    

    public static void main(String[] args) {
        smartPhone sm=new smartPhone("Samsung", "S-23 Pro" , 56000);
        sm.show();
    }
}
