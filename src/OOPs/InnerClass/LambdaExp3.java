package OOPs.InnerClass;

public class LambdaExp3 {
    public static void main(String[] args) {
        //Traditional way
        StringTransform traditional = new StringTransform() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        };

        //lambda way
        StringTransform lambdaway = s -> s.toUpperCase();

        String name = "kiran";
        System.out.println("Traditional Uppercase: " + traditional.transform(name));
        System.out.println("Lambda Uppercase: " + lambdaway.transform(name));
    }
}

interface StringTransform {
    String transform(String s);
}
