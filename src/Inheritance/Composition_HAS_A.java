package Inheritance;

public class Composition_HAS_A {
    public static void main(String[] args) {
        //create a book and add the chapter
        Book1 myBook = new Book1();
        myBook.chapter.title = "Java";
        myBook.chapter.content = "Java is a high-level programming language..";

        //read the chapter
        System.out.println("Reading chapter: " + myBook.chapter.title);
        System.out.println("Content: " + myBook.chapter.content);
    }

}

class Book1 {
    Chapter chapter = new Chapter();
}
class Chapter {
    String title;
    String content;
}
