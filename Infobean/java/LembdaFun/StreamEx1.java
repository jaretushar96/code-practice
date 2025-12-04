import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Shopping 
{

    double price;       
    String product;

    Shopping(double price, String product) 
    {
        this.price = price;
        this.product = product;
    }

    public String toString() 
    {
        return "Price: " + price + " Product: " + product;
    }
}


public class StreamEx1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        List<Shopping> pro=List.of(

                new Shopping(10 ,"Pen"),
                new Shopping(100, "Book"),
                new Shopping(10000, "Laptop"),
                new Shopping(5000, "Mobile"),
                new Shopping(800, "Bag")
            );

      List<Shopping> discount = pro.stream()
    .map(e -> {
        double newPrice = (e.price > 500) ? e.price * 0.90 : e.price;
        return new Shopping(newPrice, e.product); // FIXED
    })
    .collect(Collectors.toList());
 discount.forEach(System.out::println);


  List<String> inputProducts = new ArrayList<>();

        while (true) 
            {
            System.out.println("\nEnter product name OR type 'bill' to calculate:");
            String cho = sc.nextLine();

            if (cho.equalsIgnoreCase("bill")) {
                break;
            } 
            else 
                {
                inputProducts.add(cho);
            }
        }

        double total = discount.stream()
                .filter(p -> inputProducts.stream()
                        .anyMatch(input -> input.equalsIgnoreCase(p.product)))
                .mapToDouble(p -> p.price)
                .sum();

        System.out.println("\nTotal Price = " + total);
        
    }
}



