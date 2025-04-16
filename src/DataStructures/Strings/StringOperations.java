package DataStructures.Strings;

public class StringOperations {
    public static void main(String[] args) {
        String s = "KodNest";

        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(0,2));
        System.out.println(s.substring(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());


        String s2 ="   Hi   KodNest   ";
        System.out.println(s2.trim());
    }
}
