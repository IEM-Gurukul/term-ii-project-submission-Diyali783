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


    

    
    
            
