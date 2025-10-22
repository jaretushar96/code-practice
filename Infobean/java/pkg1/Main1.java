public class Main1 {
    

    public static void main(String[] args) {
        
        Employee e1=new Employee(101, "Tushar");
        Company com =new Company("Google", "Pune",e1);
        com.show();
    }
}
