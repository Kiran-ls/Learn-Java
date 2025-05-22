package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        banking();
    }
    public static void banking() {
        System.out.println("banking started");
        try {
            useAtm();
        } catch (Exception e) {
            System.out.println("Exception info received by bank");
        }
        System.out.println("baning ended");
    }

    public static void useAtm() throws Exception {
        System.out.println("atm use started");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter pin");
            int n = sc.nextInt();
            System.out.println("Transaction successful");
        }
        catch (Exception ex) {
            System.out.println("Exception handled by atm");
            throw(ex);
        }
        finally {
            System.out.println("atm use ended");
        }
    }
}
