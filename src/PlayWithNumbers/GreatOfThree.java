package PlayWithNumbers;

public class GreatOfThree {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 5, b = 9, c = 3;

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
