public class recursion{


// find febonachi series
public static int febo(int n)
{
if(n==0|| n==1)
{
    //  System.out.println("febo of "+n+" is"+1);
     return 1;
}
//   System.out.println("febo of "+n+" is"+);
  return (febo(n-1)+febo(n-2));

}

// check array is sorted or not
public static boolean sorting(int a[],int i){
  if(i==a.length-1)
  {
    return true;
  }
  if(a[i]>a[i+1])
  {
    return false;
  }
  return sorting(a,i+1);
  }


// find frist occurence of element in array

public static int find_index(int a[],int i,int key)
{
   if(i==a.length)
  {
    return -1;

  }
  if( a[i]==key)
  {
    return i;

  }
  
  return find_index(a,i+1,key);

  }


// find last occuranc of element in array


  public static int findlast_index(int a[],int i,int key)
{
 
   if(i<0)
  {
    return -1;

  }
  if( a[i]==key)
  {
    return i;

  }
  
  return find_index(a,i-1,key);
  
  }


// find fower of number
   public static int find_power(int n,int p)
{


  if(p==1)
  return n;
  // return n=n*find_power(n,p-1);

  // by o(log n)
  int halfpow=find_power(n,p/2);
  int power=halfpow*halfpow;
  if(p%2!=0){
    power=n*power;
  }
  return power;
  
   }


// sum of frist n natural numbers

public static int sumofnatual(int n){
    if(n==1)
    {
        System.out.println("sum of "+n+" is"+n);
         return 0; 
    }
    int sum=n+sumofnatual(n-1);
    
   System.out.println("sum of "+n+" is "+sum);
     return 0; 
}


// find factorial 
public static void factorial(int n){
    int f=0;
    if(n==0)
    {
        System.out.println(1);
        return ;
    }
    System.out.println(f=f+n*(n-1));
    factorial(n-1); 

}


// numbers form 1 to n

 public static void calculate(int n)
     {
          
        if(n==1){
        System.out.print(n+" ");
        return ;
        }
        calculate(n-1);
          System.out.print(n+" ");
     
     
     
     }

public static void main (String [] args){
   
    //  System.out.println(febo(5));
    int a []={1,2,3,9,5,3};
    // int i=0;
    // System.out.println(sorting(a,i));

    // int key=3;
    //  System.out.println(find_index(a,i,key));

    //   int i=a.length-1; 
    //  int key=3;
    //  System.out.println(findlast_index(a,i,key));

    System.out.println(find_power(2,8));

    // sumofnatual(10);

    // factorial(10);

    // calculate(10);
}
}
