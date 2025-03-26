package OOPs.OopBasics;

public class AnonymousObject {
    public static void main(String[] args) {
        new Notification().send();
    }
}
class Notification {
    public void send() {
        System.out.println("Notification sent!");
    }
}
