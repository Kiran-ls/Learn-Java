package Package1;

public class C2 {
    //accessing in diff class but same package
    public static void main(String[] args) {
        C1 obj = new C1();
        //System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
