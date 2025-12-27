
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class OverstayMonitor implements Runnable 
{

    private final List<Visitor> list;
    private volatile boolean running = true;
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public OverstayMonitor(List<Visitor> list) 
    {
        this.list = list;
    }

    @Override
    public void run() 
    {
        while (running) {
            checkOverstay();
            try {
                Thread.sleep(60000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void checkOverstay() {
        LocalDateTime now = LocalDateTime.now();
        for (Visitor v : list) {
            if ("IN".equals(v.getStatus()) && v.getCheckIn() != null) {
                LocalDateTime expected = v.getCheckIn().plusMinutes(v.getExpectedMinutes());
                if (now.isAfter(expected)) {
                    System.out.println("\n\t------ OVERSTAY ALERT ------");
                    System.out.println("\tVisitor " + v.getId() + " (" + v.getName() + ") overstayed expected time.");
                    System.out.println("\tExpected exit: " + expected.format(fmt));
                    System.out.println("\t----------------------------\n");
                }
            }
        }
    }

    public void stop() { running = false; }
}
