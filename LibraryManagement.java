import java.util.*;

class Book {
    int id;
    String title;
    boolean isBorrowed;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title +
                ", Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added successfully!");
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        for (Book b : books) {
            b.display();
        }
    }

    void borrowBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.isBorrowed) {
                    b.isBorrowed = true;
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.isBorrowed) {
                    b.isBorrowed = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    lib.addBook(id, title);
                    break;

                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int bid = sc.nextInt();
                    lib.borrowBook(bid);
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();
                    lib.returnBook(rid);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
