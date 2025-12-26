
import java.time.LocalDateTime;
import java.util.*;

public class RegistrationService 
{

    private final List<Visitor> list;
    private final Manager manager;

    public RegistrationService(List<Visitor> list, Manager manager) 
    {
        this.list = list;
        this.manager = manager;
    }

    
    private int currentInside() 
    {
        int c = 0;
        for (Visitor v : list) 
            {
                if ("IN".equals(v.getStatus()))
                     c++;
            }
             return c;
    }


    public void printBanner() {
        System.out.println("\n\t======++++++======== Visitor Management ======++++++======");
        System.out.println("\t \tCurrent Visitors inside: " + currentInside() + " / " + 5);
        System.out.println("\t=========================================================");
    }

        public void register(Scanner sc){
        try {
            if (currentInside() >= 5) {
                System.out.println("\tCapacity full (5). Cannot register new visitors now.");
                return;
            }

            System.out.print("\tNumber of members in this group (1 for single): ");
            int members = sc.nextInt(); 
            sc.nextLine();
            if (members <= 0) {
                System.out.println("\tInvalid number.");
                return;
            }

            System.out.print("\t Group purpose: ");
            String groupPurpose = sc.nextLine();

            System.out.print("\tGroup section: ");
            String groupSection = sc.nextLine();

            System.out.print("\tHow many minutes you plan to stay (0 for default " + Manager.defaultMinutes + "): ");
            long expected = sc.nextLong();
             sc.nextLine();
            if (expected <= 0)
                {
                     expected = Manager.defaultMinutes;
                }    

            int groupId = manager.getNextGroupId();

            List<Visitor> group = new ArrayList<>();
            int adultCount = 0;

            for (int i = 1; i <= members; i++) {
                System.out.println("\n\t--- Member " + i + " details ---");

                System.out.print("\tName: ");
                String name = sc.nextLine();
                 if (name.trim().isEmpty())
                 {
                    throw new IllegalArgumentException("Name cannot be empty.");

            
                }

                System.out.print("\tAge: ");
                int age = sc.nextInt(); sc.nextLine();
                   if (age < 0 || age > 120)
                {
                    throw new IllegalArgumentException("Invalid age.");
                  
                }

                System.out.print("\tPurpose (type '-' to use group purpose): ");
                String memberPurpose = sc.nextLine();
                if (memberPurpose.equals("-"))
                    {
                         memberPurpose = groupPurpose;
                    }    

                System.out.print("\tSection (type '-' to use group section): ");
                String memberSection = sc.nextLine();
                if (memberSection.equals("-")) 
                    {
                        memberSection = groupSection;
                    }

                int vid = manager.getNextVisitorId();

                Visitor v = new Visitor(vid, groupId, name, age, memberPurpose, memberSection, LocalDateTime.now(), expected);


                if (age >= 12) 
                    {
                         v.setAmount(Manager.adultRate); adultCount++;
                    }
                else if (age >= 6) 
                    {
                         v.setAmount(Manager.childRate); 
                    }
                else {
                     v.setAmount(Manager.infantRate); 
                    }

                group.add(v);
            }

           
            boolean hasChildUnder12 = group.stream().anyMatch(x -> x.getAge() < 12);
            if (hasChildUnder12 && adultCount == 0) {
                System.out.println("\tGroup contains children but no adults. Entry denied.");
                return;
            }

            if (currentInside() + group.size() > 5) {
                System.out.println("\tCannot register; capacity would exceed limit.");
                return;
            }

            for (Visitor v : group) 
            {
                list.add(v);
                v.printEntryPass();
            }

            Storage.saveAll(list);
            System.out.println("\n\tGroup registered. Total registered: " + group.size());
        } catch (Exception ex) {
            System.out.println("\tError during registration: " + ex.getMessage());
       
        }
    }
}
