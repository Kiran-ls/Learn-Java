package Package2;

import Package1.C1;

public class C3 extends C1 {
    //accessing in child class diff package
    public static void main(String[] args) {
        C1 obj = new C1();
      //  System.out.println(obj.a);
        //System.out.println(obj.b);
       // System.out.println(obj.c);
        System.out.println(obj.d);

        C3 obj1 = new C3();
        System.out.println(obj1.c);
    }
}
