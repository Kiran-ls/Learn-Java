package DataStructures.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        //logic for selection sort
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}
