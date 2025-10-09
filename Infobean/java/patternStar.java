



//    * 
//   ** 
//  *** 
// ****


public class patternStar{
    
    public static void main(String[] args) {
        
        for (int i = 1; i <=4; i++) 
        {
            for (int j =3; j >= i ; j--)
             {   
                System.out.print( " ");             
            }


            for (int k=1 ; k <=i ; k++)
             {   
                System.out.print( "*");             
            }
  System.out.println( " "); 
       
            
        }





// * * * *  
// * * * *  
// * * * *  
// * * * *  
System.out.println( " ");



         for (int i = 1; i <=4; i++) 
        {
            for (int j =1; j <= 4 ; j++)
             {   
                System.out.print( "* ");             
            }
  System.out.println( " "); 
       
            
        }



//     * 
//    *** 
//   ***** 
//  ******* 
// ********* 



System.out.println( "  ");

           for (int i = 1; i <=5; i++) 
        {
            for (int j =4; j >= i ; j--)
             {   
                System.out.print( " ");
        
            }
               
               for (int k=1 ; k <=(2*i-1) ; k++)
               {   
                    System.out.print( "*");        
               }

          System.out.println( " "); 
            
        }



// 1                
// 22 
// 333 
// 4444 
// 55555 

          System.out.println( " "); 

         for (int i = 1; i <=5; i++) 
        {
            for (int j =1; j <= i ; j++)
             {   
                System.out.print( i);
        
            }
               

          System.out.println( " "); 
            
        }






// A  
// B B  
// C C C  
// D D D D  
// E E E E E 

        System.out.println( " "); 
          char ch='A';
         for (int i = 1; i <=5; i++) 
        { 
            for (int j =1; j <= i ; j++)
             {   
                System.out.print(ch +" ");
                 
            }
                  ch++;
              
          System.out.println( " "); 
            
        }







    }
}
