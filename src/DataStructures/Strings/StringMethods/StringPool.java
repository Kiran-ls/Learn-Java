package DataStructures.Strings.StringMethods;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Mango";
        String s2 = new String("Apple");

        String s3 = "Mango";
        String s4 = new String("Apple");

        System.out.println(s1 == s3); //is 100 = 100?
        System.out.println(s1.equals(s3)); //is mango = mango?

        System.out.println(s2 == s4); //is 200 = 300?
        System.out.println(s2.equals(s4)); //is apple = apple?
    }
}
