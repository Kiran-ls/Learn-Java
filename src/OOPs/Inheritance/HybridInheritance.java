package OOPs.Inheritance;

//creating a Parent class
class LibraryItem {
    String title;
    String itemID;

    public void displayDetails() {
        System.out.println("Title: " + title + ", Item ID: " + itemID);
    }
}
//Inheriting properties from LibraryItem
class Book extends LibraryItem {
    String author;
    public void displayBookDetails() {
        System.out.println("Author: " + author);
    }
}
//Inheriting properties from LibraryItem
class Magazine extends LibraryItem{
    String issue;

    public void displayMagazineDetails() {
        displayDetails();
        System.out.println("Issue: " + issue);
    }
}
//Inheriting properties from Book class
class ScienceBook extends Book {
    String field;
    public void displayScienceDetails() {
        displayBookDetails();
        System.out.println("Field: " + field);
    }
}


//Main class
public class HybridInheritance {
    public static void main(String[] args) {
        //creating object for ScienceBook class
        ScienceBook sb = new ScienceBook();
        sb.title = "Computer Science";
        sb.itemID = "B1001";
        sb.author = "Dennies Richie";
        sb.field = "Computer";
        sb.displayScienceDetails(); //calling method from ScienceBook class

        //creating object fro Magazine class
        Magazine mg = new Magazine();
        mg.title = "TEch Monthly";
        mg.itemID = "M2001";
        mg.issue = "July 2025";
        mg.displayMagazineDetails(); //calling method from Magazine class
    }
}
