package OOPs;

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Application Name: " + AppConfig.app);
        System.out.println("Version: " + AppConfig.version);
        System.out.println("Production: " + AppConfig.env);
    }
}

class AppConfig {
    //Declare static variables
    static String app;
    static String version;
    static String env;

    //Static block to initialize the static variables
    static {
        app = "MyApp";
        version = "1.0.0";
        env = "Production";
    }
}
