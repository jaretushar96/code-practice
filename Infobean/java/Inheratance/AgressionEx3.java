

class Professor
{
    String p1;
    String p2;
    String p3=" Captain Sir";
    Professor(String p1,String p2) 
    {
       this.p1=p1;
       this.p2=p2;

    }

    void showDetails(){

        System.out.println(" Professors are "+p1+" "+p2);

     }
    

}

class Department
{
    String depe;
     Professor pro;

    Department(String depe,Professor pro) 
    {
        this.depe=depe;
        this.pro=pro;
    }

     void showDetails(){


            System.out.println(" Deapartment :"+depe);
            pro.showDetails();
     }

}



class University
{
    String unName;
    Department dep;
   

   University(String unName, Department dep ) 
   {
        this.unName=unName;
        this.dep=dep;
   }

   void showDetails()
   {
    System.out.println("------------------");
    System.out.println(" Name of University :"+unName);
    dep.showDetails();

   }

    


}
public class AgressionEx3 {
    
    public static void main(String[] args) {

        Professor pro1= new Professor("Amruta Mam", "Pooja Mam");
        Department d1=new Department("Computer Science ", pro1);
        University un1=new University("SPPU",d1);
        un1.showDetails();
    }
}
