import java.util.ArrayList;

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
