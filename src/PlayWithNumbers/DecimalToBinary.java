package PlayWithNumbers;

public class DecimalToBinary {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 12;
        String res = "";

        while (n > 0) {
            int rem = n % 2;
            res = rem + res;
            n =n /2;

        }
        System.out.println("the binary equivalent of number is " + res);

        // YOU CAN SOLVE IT IN ONE LINE USING integer to binary function
        System.out.println(Integer.toBinaryString(n));

    }
}
