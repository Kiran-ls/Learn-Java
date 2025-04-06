package OOPs.Polymorphism;

public class MethodOverride {
    public static void main(String[] args) {
        BookInteraction check = new CheckAvailability();
        check.performAction();
        BookInteraction borrow = new Borrow();
        borrow.performAction();
        BookInteraction returnBook = new Return();
        returnBook.performAction();
    }
}

class BookInteraction {
    public void performAction() {
        System.out.println("performing book interaction.");
    }
}

class CheckAvailability extends BookInteraction {
    public void performAction() {
        System.out.println("Checking book availability");
    }
}

class Borrow extends BookInteraction {
    public void performAction() {
        System.out.println("Borrowing a book...");
    }
}

class Return extends BookInteraction {
    public void performAction() {
        System.out.println("Returning book...");
    }
}