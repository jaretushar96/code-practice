public class friendsParing {
    
        public static int pairs(int n)

        {
            if(n==1||n==2){
            // System.out.println("total no ways of pairing is "+n);
            return n;
            }
            // for single person
            pairs(n-1);
            // for person having pairing
            // int nm1=n-1;
            // int nm2=pairs(n-2);
            int totalPairs=(n-1)*pairs(n-2);
            System.out.println("total no ways of pairing is "+(n-1+totalPairs));
            return 0;
        }

    public static void main(String[] args) {
        pairs(5);
        
    }
}
