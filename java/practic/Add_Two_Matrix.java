import java.util.Scanner;

public class Add_Two_Matrix {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] a=new int[2][2];
        int [][] b=new int[2][2];
        System.err.println("enter the elements in matrix ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                a[i][j]=sc.nextInt();
                b[i][j]=sc.nextInt();
                
            }
            
        }
        System.err.println("\n");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

              System.err.print(" " +a[i][j]);
                
            }
            System.err.println("");
            
        }

        System.err.println("");
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

              System.err.print( "   " +b[i][j]);
                
            }
            System.err.println("");
            
        }



        System.err.println("  addititon of two matrix is ");
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                a[i][j]=a[i][j]+b[i][j];
              System.err.print( "   " +a[i][j]);
                
            }
            System.err.println("");
            
        }
        int i;
        int j;
        System.err.println("  sorting");
        for (i = 0; i <=a.length-1; i++) {

            for (j = 0; j < b.length-1; j++) {

                 if(a[i][j]>a[i][j+1])
                 {
                    int temp=a[i][j];
                    a[i][j]=a[i][j+1];
                    a[i][j+1]=temp;
                   
                 }


                
                
            }
            System.err.println("");
           
            
            
        }


        for ( i = 0; i < a.length; i++) {

            for ( j = 0; j < b.length; j++) {
              
                System.err.print( "   " +a[i][j]);
            }
            System.err.println("");
            
        }

      
       


    }
    
}
