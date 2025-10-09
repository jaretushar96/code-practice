public class ReverseTheNumber {
    
    public static void main(String[] args) {
        int num =3546;
        int rev=0;
        int even=0;
        int odd=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            int digit =num%10+2;
            rev=rev*10+digit;
            num=num/10;
          
        }
          System.out.println(" Number in reverse order is "+rev);
          System.out.println(" Number of even digits in Number is "+even);
          System.out.println(" Number of even digits in Number is "+even);
    }
}
