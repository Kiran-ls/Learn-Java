package OOPs.Polymorphism;

public class DownCasting2 {
    public static void main(String[] args) {
        Media mediaVideo = new Video();
        mediaVideo.play();  //Overridden Method

        if(mediaVideo instanceof Video) {               //DOWN-CASTING
            ((Video) mediaVideo).adjustQuality();       //check instance using instanceof keyword and cast to access sub-class methods.
        }
    }
}

class Media {
    public void play() {
        System.out.println("Media plays generic content");
    }
    public void displayInfo() {
        System.out.println("Displaying media information");
    }
}


class Video extends Media {
    public void play() {
        System.out.println("Video play with animation");
    }
    public void adjustQuality() {
        System.out.println("Adjust video quality settings");
    }
}