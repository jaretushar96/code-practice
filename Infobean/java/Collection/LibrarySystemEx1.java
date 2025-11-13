import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystemEx1 {
    static ArrayList<String> books = new ArrayList<>();
    static HashMap<String, String> issuedBooks = new HashMap<>();
    static Deque<String> transactions = new ArrayDeque<>();
    static HashSet<String> members = new HashSet<>();

    static String validUsername = "admin";
    static String validPassword = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== LOGIN =====
        System.out.println("===== LIBRARY LOGIN =====");
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (!user.equals(validUsername) || !pass.equals(validPassword)) {
            System.out.println("❌ Invalid credentials. Access denied.");
            return;
        }
        System.out.println("\n✅ Login successful! Welcome, " + user + "\n");

        int choice;
        while (true) {
            System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Register Member");
            System.out.println("7. View Transaction History");
            System.out.println("8. Display All Books");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input. Please enter a number.\n");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to add: ");
                    String addBook = sc.nextLine().trim();
                    if (addBook.isEmpty()) {
                        System.out.println("⚠️ Book title cannot be empty.\n");
                        break;
                    }

                    boolean exists = false;
                    for (String b : books) {
                        if (b.equalsIgnoreCase(addBook)) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        books.add(addBook);
                        transactions.addFirst("Book added: " + addBook + " (by admin)");
                        System.out.println("✅ Book added successfully!\n");
                    } else {
                        System.out.println("⚠️ Book already exists in the library.\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeBook = sc.nextLine().trim();
                    if (removeBook.isEmpty()) {
                        System.out.println("⚠️ Book title cannot be empty.\n");
                        break;
                    }

                    String foundBook = null;
                    for (String b : books) {
                        if (b.equalsIgnoreCase(removeBook)) {
                            foundBook = b;
                            break;
                        }
                    }

                    if (foundBook != null) {
                        books.remove(foundBook);
                        transactions.addFirst("Book removed: " + removeBook + " (by admin)");
                        System.out.println("❌ Book removed successfully!\n");
                    } else {
                        System.out.println("⚠️ Book not found in library.\n");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchBook = sc.nextLine().trim();
                    if (searchBook.isEmpty()) {
                        System.out.println("⚠️ Book title cannot be empty.\n");
                        break;
                    }

                    boolean foundInAvailable = false;
                    for (String b : books) {
                        if (b.equalsIgnoreCase(searchBook)) {
                            foundInAvailable = true;
                            break;
                        }
                    }

                    String issuedTo = null;
                    for (Map.Entry<String, String> entry : issuedBooks.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase(searchBook)) {
                            issuedTo = entry.getValue();
                            break;
                        }
                    }

                    if (foundInAvailable)
                        System.out.println("📘 Book found in library (available).\n");
                    else if (issuedTo != null)
                        System.out.println("📕 Book is currently issued to: " + issuedTo + "\n");
                    else
                        System.out.println("❌ Book not found.\n");
                    break;

                case 4:
                    System.out.print("Enter member name issuing the book: ");
                    String memberIssue = sc.nextLine().trim();
                    if (memberIssue.isEmpty()) {
                        System.out.println("⚠️ Member name cannot be empty.\n");
                        break;
                    }

                    boolean memberExists = false;
                    for (String m : members) {
                        if (m.equalsIgnoreCase(memberIssue)) {
                            memberExists = true;
                            break;
                        }
                    }
                    if (!memberExists) {
                        System.out.println("⚠️ Member not registered. Please register first.\n");
                        break;
                    }

                    System.out.print("Enter book title to issue: ");
                    String issueBook = sc.nextLine().trim();
                    String bookToIssue = null;
                    for (String b : books) {
                        if (b.equalsIgnoreCase(issueBook)) {
                            bookToIssue = b;
                            break;
                        }
                    }

                    if (bookToIssue != null) {
                        books.remove(bookToIssue);
                        issuedBooks.put(bookToIssue, memberIssue);
                        transactions.addFirst("Book issued: " + issueBook + " → Member: " + memberIssue);
                        System.out.println("📗 Book issued successfully to " + memberIssue + "!\n");
                    } else {
                        System.out.println("⚠️ Book not available or already issued.\n");
                    }
                    break;

                case 5:
                    System.out.print("Enter member name returning the book: ");
                    String memberReturn = sc.nextLine().trim();
                    System.out.print("Enter book title to return: ");
                    String returnBook = sc.nextLine().trim();

                    String issuedBookKey = null;
                    String issuedMember = null;

                    for (Map.Entry<String, String> entry : issuedBooks.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase(returnBook)) {
                            issuedBookKey = entry.getKey();
                            issuedMember = entry.getValue();
                            break;
                        }
                    }

                    if (issuedBookKey != null) {
                        if (issuedMember.equalsIgnoreCase(memberReturn)) {
                            books.add(issuedBookKey);
                            issuedBooks.remove(issuedBookKey);
                            transactions.addFirst("Book returned: " + returnBook + " ← Member: " + memberReturn);
                            System.out.println("📕 Book returned successfully by " + memberReturn + "!\n");
                        } else {
                            System.out.println("🚫 Only the member who issued this book (" + issuedMember + ") can return it.\n");
                        }
                    } else {
                        System.out.println("⚠️ This book was not issued.\n");
                    }
                    break;

                case 6:
                    System.out.print("Enter member name to register: ");
                    String newMember = sc.nextLine().trim();
                    if (newMember.isEmpty()) {
                        System.out.println("⚠️ Member name cannot be empty.\n");
                        break;
                    }

                    boolean alreadyMember = false;
                    for (String m : members) {
                        if (m.equalsIgnoreCase(newMember)) {
                            alreadyMember = true;
                            break;
                        }
                    }

                    if (!alreadyMember) {
                        members.add(newMember);
                        transactions.addFirst("New member registered: " + newMember);
                        System.out.println("✅ Member registered successfully!\n");
                    } else {
                        System.out.println("⚠️ Member already exists.\n");
                    }
                    break;

                case 7:
                    System.out.println("📜 Transaction History:");
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions yet.\n");
                    } else {
                        for (String t : transactions)
                            System.out.println(" - " + t);
                        System.out.println();
                    }
                    break;

                case 8:
                    System.out.println("📚 Available Books:");
                    if (books.isEmpty())
                        System.out.println("No books available right now.\n");
                    else {
                        for (String b : books)
                            System.out.println(" - " + b);
                        System.out.println();
                    }
                    break;

                case 9:
                    System.out.println("👋 Exiting system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice! Try again.\n");
            }
        }
    }
}
