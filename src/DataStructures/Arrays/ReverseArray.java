package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Reverse array
        int[] reverseArr = new int[size];
        for (int i = 0; i < reverseArr.length; i++) {
            reverseArr[i] = arr[reverseArr.length - 1 - i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reverseArr));
    }
}
