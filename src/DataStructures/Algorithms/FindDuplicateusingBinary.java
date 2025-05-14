package DataStructures.Algorithms;

import java.util.Scanner;

public class FindDuplicateusingBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == left) {
                System.out.println("Element found at position: " + mid);
                found = true;
                break;
            }
            else if (arr[mid] > left) {
                left = mid + 1;
            } else  {
                right = mid - 1;
            }
        }
    if(!found) {
        System.out.println("Not found");
    }
    }
}
