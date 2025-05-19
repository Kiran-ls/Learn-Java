package CollectionFrameWork;
import java.util.*;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Create a HashMap to store employee records
        HashMap empMap = new HashMap();
        // TODO: Read employee information and add them to the HashMap
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        System.out.println("Enter employee Details:");
        for (int i = 1; i <= n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            empMap.put(id, name);
            System.out.println("Added: ID " + id + " -> " + name);
        }

        // TODO: Retrieve an employee’s name using their ID
        int dispId = sc.nextInt();
        if (empMap.get(dispId) != null) {
            System.out.println("Employee Name: " + empMap.get(dispId));
        } else {
            System.out.println("employee not found");
        }
        // TODO: Remove an employee using their ID
        int removeID = sc.nextInt();
        System.out.println("Employee removed: " + empMap.get(removeID));
        empMap.remove(removeID);
        // TODO: Print all employee records
        //Map Views
        Set keys = empMap.keySet();
        for (Object k : keys) {
            System.out.println("ID: " + k + ", Name: " + empMap.get(k));
        }

        sc.close();
    }
}
