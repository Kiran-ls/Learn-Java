package Inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Artist ar = new Artist();
        ar.art();

    }
}

class RealArtist {
    public void art() {
        System.out.println("Practice art");
    }
}

class Singer {
    public void art() {
        System.out.println("Sings a song");
    }
}

class Painter extends Object {
    public void art() {
        System.out.println("draw a paint");
    }
}

class Artist extends Singer {//Painter
    /*The problem occurs when there exist methods with the same signature in both the superclasses and subclass.
    On calling the method, the compiler cannot determine which class method to be called and even on calling which
    class method gets the priority. */
}