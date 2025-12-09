
import java.time.*;
import java.util.*;

public class CheckoutService 
{

    private final List<Visitor> list;
    private final Manager manager;

    public CheckoutService(List<Visitor> list, Manager manager) {
        this.list = list;
        this.manager = manager;
    }

    public void checkOut(Scanner sc)
     {
        System.out.print("\tEnter Visitor ID for checkout: ");
      
        int vid = sc.nextInt(); 
        sc.nextLine();

      
        Visitor v = null;

for (Visitor  found: list) {
    if (found.getId() == vid) {
        v = found;
        break;
    }
}

if (v == null) {
    System.out.println("\tNo visitor found with this ID.");
    return;
}

if ("OUT".equals(v.getStatus())) {
    System.out.println("\tThis visitor has already checked out.");
    return;
}


        LocalDateTime now = LocalDateTime.now();
        v.setCheckOut(now);

        long stayMinutes = Duration.between(v.getCheckIn(), now).toMinutes();
        v.setDurationMinutes(stayMinutes);

        long extra = stayMinutes - v.getExpectedMinutes();
        if (extra > 0) {
            long blocks = (long)Math.ceil(extra / 15.0);
            double fine = blocks * 5.0; 
            v.setAmount(v.getAmount() + fine);
            System.out.println("\tExtra Time: " + extra + " minutes. Fine added: " + fine);
        }

        v.setStatus("OUT");
        Storage.saveAll(list);
        System.out.println("\n\tCheckout complete. Visitor: " + v.getName() + " Amount charged: " + v.getAmount());
    }
}
