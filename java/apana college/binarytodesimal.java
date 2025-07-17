import java.util.*; 


 
 public class binarytodesimal
 {

    public static void binoto()
    {   
        System.out.println("enter binary no");
        Scanner sc= new Scanner(System.in);
        int binaryno=sc.nextInt();
        int myno=binaryno;
        int  pow=0;
        int desimal=0;
        while(binaryno >0)
        {
            int lastdegit= binaryno % 10;
            desimal=desimal+(lastdegit*(int)Math.pow(2,pow));
            pow++;
            binaryno=binaryno/10;
         

        }
           System.out.println("DEsimal of "+ myno +"="+ desimal);

    }


    public static void desitobin()
    {   
        System.out.println("enter desimal no");
        Scanner sc= new Scanner(System.in);
        int desimalno=sc.nextInt();
        int myno=desimalno;
        int  pow=0;
        int binary=0;
        while(desimalno >0)
        {
            int lastdegit= desimalno % 2;
            binary= binary+(lastdegit*(int)Math.pow(10,pow));
            pow++;
            desimalno=desimalno/2;
         

        }
           System.out.println("Binary of "+ myno +"="+ binary);

    }
    public static void main( String args [])
    {

     binoto();
    desitobin();
    }
 }