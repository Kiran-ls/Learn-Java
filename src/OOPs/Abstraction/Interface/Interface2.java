package OOPs.Abstraction.Interface;

public class Interface2 {
    public static void main(String[] args) {
        Media music = new Music();
        music.play();
        music.pause();
        music.stop();

        Media video = new Video();
        video.play();
        video.pause();
        video.stop();

        Media.resetAll();
    }
}

interface Media {
    //Abstract methods define what to do but not how to do it
    void play();
    void stop();

    //Default method provides a common implementation that can be overridden
    default void pause() {
        System.out.println("Playback Paused.");
    }

    /*Static method belongs to the interface and provides a common functionality across
    all Implementation. */
    static void resetAll() {
        System.out.println("All media have been reset to default setting.");
    }
}

class Music implements Media {
    public void play() {
        System.out.println("Music is playing..");
    }
    public void stop() {
        System.out.println("Music stopped..");
    }
    public void pause() {
        System.out.println("Music paused. Ready to resume..");
    }
}

class Video implements Media {
    public void play() {
        System.out.println("Video is playing..");
    }
    public void stop() {
        System.out.println("Video is stopped..");
    }
    public void pause() {
        System.out.println("Video is paused. Buffering..");
    }
}


