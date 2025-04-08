package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //find sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
    }
}
