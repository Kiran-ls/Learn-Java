package OOPs.InnerClass;

class ShapeCalc {
    static class Circle {
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        public static double calculatePerimeter(double radius) {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle {
        public static double calculateArea(double length, double width) {
            return length * width;
        }

        public static double calculatePerimeter(double length, double width) {
            return 2 * (length + width);
        }
    }
}

public class ShapeCalculator {
    private static ShapeCalc.Circle Circle;

    public static void main(String[] args) {
        double circleArea = ShapeCalc.Circle.calculateArea(5);
        double circlePerimeter = ShapeCalc.Circle.calculatePerimeter(5);

        double rectangleArea = ShapeCalc.Rectangle.calculateArea(4, 6);
        double rectanglePerimeter = ShapeCalc.Rectangle.calculatePerimeter(4, 6);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
    }
}