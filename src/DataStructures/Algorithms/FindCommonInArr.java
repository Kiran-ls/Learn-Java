package DataStructures.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindCommonInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array elements:");
        String[] input1 = sc.nextLine().split(" ");
        System.out.println("Enter the second array elements:");
        String[] input2 = sc.nextLine().split(" ");

        int[] arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr2);

        List<Integer> res = new ArrayList<>();
        for (int num : arr1) {
            if (Arrays.binarySearch(arr2, num) >= 0 && !res.contains(num)) {
                res.add(num);
            }
        }
        System.out.println("The intersection is: " + res);
        sc.close();
    }
}
