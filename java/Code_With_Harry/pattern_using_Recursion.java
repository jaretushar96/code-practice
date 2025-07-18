
public class pattern_using_Recursion {


// ******
// ***** 
// **** 
// *** 
// ** 
// *

        static void  pattern_Reverse(int n) {
            if (n > 0) {
                
                for (int i = 1; i <= n; i++) {
                    System.err.print("*");
                }
                System.err.println();
    
               
                pattern_Reverse(n - 1);
            }
      
        }



// *
// **
// ***
// ****

    static void pattern_Stright(int n){

     if(n>0)
     {
        pattern_Stright(n-1);
        for(int i=1; i<=n; i++)
        {
            System.err.print("*");
        }
        System.err.println("");
     }

    }

    public static void main(String[] args) {

        pattern_Stright(4);
        pattern_Reverse(8);
        
    }
    
}
