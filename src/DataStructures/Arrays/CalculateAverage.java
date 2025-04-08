package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //find average
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg  = sum / arr.length;
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Average: " + avg);
    }
}
