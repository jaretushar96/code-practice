class Payment
{
    String name;
    double amount;

    Payment (String name,double amount1)
    {
        this.name=name;
        amount=amount1; 
    }
   void process()
   {    System.out.println("--------------------------");
       System.out.println("Name :"+name+"\nAmount"+amount);
   }
} 
class CreaditCard extends Payment
{

    int cardno;
    int per;

    CreaditCard(String name,double amount1,int cardno,int per) {
        super(name, amount1);
        this.cardno=cardno;
        this.per=per;
    }
  void process()
  {
    super.process();
    double pe=((amount/100)*(100-per));
     System.out.println("Charges :"+((amount/100)*(per)));
    System.out.println("Total amount :"+pe);

  }


    

}

class Upi extends Payment
{
        String id;
     Upi(String name,double amount1,String id) {
         super(name, amount1);
         this.id=id;
    }
 void process()
  {
    super.process();

    System.out.println("Upi id  :"+id+"\n No fees For UPI payments\n TotalAmount :"+amount);

  }

     
}
class net extends Payment
{
    int charges;

    net(String name,double amount1, int charges) {
         super(name, amount1);
         this.charges=charges;
    }
     void process()
  {
    super.process();

    System.out.println(" Charges are  :"+charges+"\n TotalAmount :"+(amount-charges));

  }

    

}


public class OverridingEx1{


    public static void main(String[] args) {
        Payment[] objex={
        new net("Tushar", 1000, 10),
        new Upi("Vikas", 20000, "sbi@vicky1212"),
        new CreaditCard("Raju",25000,999,2),

        };
          
        for (Payment p : objex) {
            p.process();
        }
       
        
    }
}