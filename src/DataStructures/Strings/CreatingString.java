package DataStructures.Strings;

public class CreatingString {
    public static void main(String[] args) {
        //1st way
        String s1 = "rohit";
        System.out.println(s1);

        //2nd way
        String s2 = new String("amit");
        System.out.println(s2);

        //3rd way
        char[] ch = {'s','u','m','i','t'};
        String s3 = new String(ch);
        System.out.println(s3);
    }
}
