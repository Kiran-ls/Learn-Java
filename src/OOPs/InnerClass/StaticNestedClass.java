package OOPs.InnerClass;

public class StaticNestedClass {
    public static void main(String[] args) {
        Car1.MusicSystem music = new Car1.MusicSystem();
        music.play();
    }
}

class Car1 { //Outer class
    String brand = "maruthi";
    static int wheels = 4;

    static class MusicSystem { //Inner class
            public void play() {
                System.out.println("play music");
                //System.out.println("Brand: " + brand);
                System.out.println("wheels: " + wheels);
            }
    }
}
