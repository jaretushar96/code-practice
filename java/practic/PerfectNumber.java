public class PerfectNumber {
    public static void main(String[] args) 
    {
        int num = 14;
        int sum = 0;

        for (int i = 1; i < num; i++) 
        {
            if (num % i == 0)
                sum += i;
        }

        System.out.println(num + (sum == num ? " is a Perfect Number" : " is not a Perfect Number"));
    }
}
