package OOPs.OopBasics;

class findArea {
    double radius;
    static double pi = 3.14;

    public void findingArea() {
        double area = pi * radius * radius;
        System.out.println(area);
    }
}
public class Circle {

    public static void main(String[] args) {
        findArea a = new findArea();
        a.radius = 10;
        a.findingArea();

    }
}
