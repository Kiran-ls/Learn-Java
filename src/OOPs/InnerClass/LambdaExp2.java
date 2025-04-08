package OOPs.InnerClass;

public class LambdaExp2 {
    public static void main(String[] args) {
        Subtraction res = (a,b) -> {
            return (a -b);
        }; //or we can also write in one line like below both will give same result
         // Subtraction res = (a, b) -> (a - b);
        System.out.println(res.sub(100, 50));
    }
}

interface Subtraction {
    int sub(int a, int b);
}
