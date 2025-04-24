package DataStructures.Algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array elements in sorted order: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        //logic for binary search
        int left = 0;
        int right = size-1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) /2;

            if (a[mid] == key) {
                System.out.println("Element found at position: " + mid);
                found = true;
                break;
            } else if (key < a[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
