package Methods;

public class Methods {
    public static void main(String[] args) {
        orderCoffee();
        orderCoffee("Espresso");
        String cookieOrder1 = orderCookie();
        System.out.println(cookieOrder1);
        String cookieOrder2 = orderCookie("Chocolate Chip");
        System.out.println(cookieOrder2);
    }

    public static void orderCoffee() {   //method without parameters and without return type
        System.out.println("ordered a default coffee.");
    }
    public static void orderCoffee(String type) {  //method with parameters and without return type
        System.out.println("ordered a " + type + "coffee.");
    }
    public static String orderCookie() {  //method without parameters with return type
        return "Ordered a default Cookie.";
    }
    public static String orderCookie(String type) { //method with parameters with return type
        return "Ordered a " + type + "Cookie.";
    }

}
