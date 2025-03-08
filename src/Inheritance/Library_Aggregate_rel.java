package Inheritance;

class Books {
    String title;
    String author;

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Library {
    Books libraryBook;

    void addBook(Books newBook) {
        libraryBook = newBook;
    }

    void showBook() {
        libraryBook.displayBookDetails();
    }
}

public class Library_Aggregate_rel {
    public static void main(String[] args) {
        Books myBook = new Books();
        myBook.title = "Think & Grow Rich";
        myBook.author = "Napoleon Hill";

        Library cityLibrary = new Library();
        cityLibrary.addBook(myBook);
        cityLibrary.showBook();

        //Library object destroyed
        cityLibrary = null;

        //we are trying to add and access books through library after destroying
        //cityLibrary.addBook(myBook); //NullPointerException
        //cityLibrary.showBook(); //NullPointerException

        myBook.displayBookDetails(); // But we can access book details through Book object even after destroying library object.

    }
}

