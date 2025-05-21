package DataStructures;
import java.util.Scanner;

class StackDemo {
    int top = -1;
    int capacity;
    int[] stack;

    public StackDemo(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push " + num);
            return;
        }
        top++;
        stack[top] = num;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }
    // Check if stack is full
    boolean isFull() {
        return top == capacity - 1;
    }
    
    //peek() method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of Stack:");
        int capacity = sc.nextInt();
        StackDemo stk = new StackDemo(capacity);

        while (true) {
            System.out.println("Please Select operations to proceed:");
            System.out.println(" 1- push \n 2- pop \n 3- isEmpty \n 4- isFull \n 5- peek \n 6- display \n 7- exit");
            int op = sc.nextInt();
            if (op == 7)
                break;
            else if (op == 1) {
                System.out.println("Please enter a number to push:");
                int num = sc.nextInt();
                stk.push(num);
            }
            else if (op == 2) {
                stk.pop();
                System.out.println("Element removed");
            } else if (op == 3) {
                System.out.println("Stack is empty " + stk.isEmpty());
            } else if (op == 4) {
                System.out.println("Stack is full " + stk.isFull());
            } else if (op == 5) {
                System.out.println("Top element in stack: " + stk.peek());
            } else if (op == 6) {
                stk.display();
            } else
                System.out.println("Invalid Input");
        }
    }
}
