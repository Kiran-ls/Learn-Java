package Package1;

public class C1 {
    private int a;
    int b;
    protected int c;
    public int d;

    //accessing in same class
    public static void main(String[] args) {
        C1 obj = new C1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
