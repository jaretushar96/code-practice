import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Note 
{
    int id;
    String title;
    String content;
    int createdTime;

    public Note(int id, String title, String content, int createdTime) 
    {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdTime = createdTime;
    }

    @Override
    public String toString() 
    {
        return id + "|" + title + "|" + content + "|" + createdTime;
    }
}

class Notebook 
{
    List<Note> notes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    String filePath = "notes.txt";  // file for saving all notes

    // ---------------------------- LOAD EXISTING NOTES ----------------------------
    public Notebook() 
    {
        loadNotes();
    }

    // Load notes from file when program starts
    void loadNotes()
     {
        File file = new File(filePath);

        if (!file.exists()) return; // no file → nothing to load

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String title = parts[1];
                    String content = parts[2];
                    int time = Integer.parseInt(parts[3]);

                    notes.add(new Note(id, title, content, time));
                }
            }

        } catch (Exception e) 
        {
            System.out.println("Error loading notes: " + e.getMessage());
        }
    }

    // ---------------------------- SAVE NOTES TO FILE ----------------------------
    void saveNotes() 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            for (Note n : notes) 
                {
                bw.write(n.toString());
                bw.newLine();
            }

        } catch (Exception e) 
        {
            System.out.println("Error saving notes: " + e.getMessage());
        }
    }

    // ---------------------------- ADD NOTE ----------------------------
    void addNote() 
    {
        System.out.print("Enter Note ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Content: ");
        String content = sc.nextLine();

        System.out.print("Enter Created Time: ");
        int time = sc.nextInt();

        notes.add(new Note(id, title, content, time));
        System.out.println("Note added successfully!");
    }

    // ---------------------------- DELETE NOTE ----------------------------
    void deleteNote() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Iterator<Note> itr = notes.iterator();
        boolean found = false;

        while (itr.hasNext()) {
            if (itr.next().id == id) {
                itr.remove();
                found = true;
                System.out.println("Note deleted!");
                break;
            }
        }

        if (!found) System.out.println("Note not found.");
    }

    // ---------------------------- VIEW NOTES ----------------------------
    void viewNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
            return;
        }

        System.out.println("\n--- YOUR NOTES ---");
        for (Note n : notes) {
            System.out.println(n.toString());
        }
    }

    // ---------------------------- SEARCH NOTE ----------------------------
    void searchNote() {
        System.out.print("Enter title to search: ");
        sc.nextLine();
        String key = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Note n : notes) {
            if (n.title.toLowerCase().contains(key)) {
                System.out.println(n);
                found = true;
            }
        }

        if (!found) System.out.println("No note found with this title.");
    }

    // ---------------------------- MENU ----------------------------
    void start() {
        while (true) {
            System.out.println("\n--- NOTES APP MENU ---");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Delete Note");
            System.out.println("4. Search Note");
            System.out.println("5. Save & Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: addNote(); break;
                case 2: viewNotes(); break;
                case 3: deleteNote(); break;
                case 4: searchNote(); break;
                case 5: 
                    saveNotes();
                    System.out.println("All notes saved. Exiting...");
                    return;

                default: System.out.println("Invalid choice!");
            }
        }
    }
}

public class NotesApp {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.start();
    }
}
