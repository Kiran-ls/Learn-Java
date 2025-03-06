package Methods;

import java.util.Scanner;

public class GallonToLiters {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Gallon: ");
        float gallonValue = sc.nextFloat();
        double gallonliter = gallonValue * 3.78541; // approx liters in a gollon
        System.out.printf("Gallon to Liters:" + "%.5f", gallonliter);
    }
}
