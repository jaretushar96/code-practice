import java.util.HashSet;
public class HashSetEx1 {
    



    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("India");
        countries.add("Japan");

        System.out.println("Unique Countries: " + countries);
    }
}



