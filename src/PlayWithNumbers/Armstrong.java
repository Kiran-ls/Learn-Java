package PlayWithNumbers;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // TODO Auto-generated method stu
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        //counting digits
        int dig = (num + "").length();
        System.out.println("Number of digits= " + dig);

        //finding armstrong
        int  sum  = 0;
        int lastDig = 0;
        while (num > 0) {
            lastDig = num % 10;
            num = num / 10;
            sum = sum+ (int)(Math.pow(lastDig, dig));
        }

        if(sum == temp)
            System.out.println("Armstong");
        else
            System.out.println("Not Armstrong");
    }
}
