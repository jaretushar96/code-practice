import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Storage 
{

    private static final String FILE = "visitors.txt";
    private static final DateTimeFormatter fmt =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public static void saveAll(List<Visitor> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {

            for (Visitor v : list) {
                bw.write(v.toString());
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

public static void loadAll(List<Visitor> list, Map<Integer, Visitor> map)
{
        File f = new File(FILE);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] p = line.split("\\|");
                if (p.length != 12) continue;

                 int id  = Integer.parseInt(p[0]);
                  int gid = Integer.parseInt(p[1]);
                 String name = p[2];
                int age = Integer.parseInt(p[3]);
                String purpose = p[4];
                String section = p[5];

                LocalDateTime ci = p[6].equals("null") ? null : LocalDateTime.parse(p[6], fmt);
                LocalDateTime co = p[7].equals("null") ? null : LocalDateTime.parse(p[7], fmt);

                long expected = Long.parseLong(p[8]);
                long duration = Long.parseLong(p[9]);
                double amount = Double.parseDouble(p[10]);
                String status = p[11];

                Visitor v = new Visitor(id, gid, name, age, purpose, section, ci, expected);
                v.setCheckOut(co);
                v.setDurationMinutes(duration);
                v.setAmount(amount);
                v.setStatus(status);

                list.add(v);
                map.put(v.getId(), v);
            }

        } catch (Exception e) {
            System.out.println("Error loading: " + e.getMessage());
        }
    }
}
