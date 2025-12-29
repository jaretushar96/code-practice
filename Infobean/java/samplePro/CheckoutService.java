import java.time.*;
import java.util.*;

public class CheckoutService 
{

    private List<Visitor> list;
    private Map<Integer, Visitor> map;

    public CheckoutService(List<Visitor> list, Map<Integer, Visitor> map) 
    {
        this.list = list;
        this.map = map;
    }

    public void checkOutFlow(Scanner sc) {

        System.out.print("Enter Visitor ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Visitor v = map.get(id);

        if (v == null) 
            {
            System.out.println("Not found.");
            return;
        }

        if (v.getStatus().equals("OUT")) {
            System.out.println("Already OUT.");
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        v.setCheckOut(now);

        long minutes = Duration.between(v.getCheckIn(), now).toMinutes();
        v.setDurationMinutes(minutes);

        long extra = minutes - v.getExpectedMinutes();

        if (extra > 0) {
            long blocks = (long) Math.ceil(extra / 15.0);
            double fine = blocks * 5;
            v.setAmount(v.getAmount() + fine);
            System.out.println("Visitor :"+v.getName());
            System.out.println("Extra: " + extra + ", Fine: ₹" + fine);
        }

        v.setStatus("OUT");
        Storage.saveAll(list);
        System.out.println("Check Out Sucessfull.");
    }
}
