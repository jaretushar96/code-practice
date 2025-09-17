public class PerfectNumber {
    public static void main(String[] args) 
    {
        int num = 14;
        int s = 0;

        for (int i = 1; i < num; i++) 
        {
            if (s % i == 0)
                s=s+ i;
        }

        System.out.println(num + (s == num ? " is a Perfect Number" : " is not a Perfect Number"));
    }
}
