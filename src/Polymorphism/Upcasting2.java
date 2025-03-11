package Polymorphism;

public class Upcasting2 {
    public static void main(String[] args) {
        PaymentApp upi = new Upi(); //Upcasting
        upi.pay();
        PaymentApp wal = new Wallet(); //Upcasting
        wal.pay();
        PaymentApp card = new Card();  //Upcasting
        card.pay();
    }
}

class PaymentApp {
    void pay() {
        System.out.println("Pay to buy!");
    }
}

class Upi extends PaymentApp {
    void pay() {
        System.out.println("Pay using UPI app!");
    }
}

class Wallet extends PaymentApp {
    void pay() {
        System.out.println("Pay using online wallet!");
    }
}

class Card extends PaymentApp {
    void pay() {
        System.out.println("Pay using card!");
    }
}
