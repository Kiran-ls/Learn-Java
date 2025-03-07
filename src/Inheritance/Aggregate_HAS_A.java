package Inheritance;

class Playlist {
    Song track;
    void playSong() {
        System.out.println("Now Playing: " + track.title);
        System.out.println(("Arstist: " + track.artist));
    }
}
class Song {
    String title;
    String artist;
}

public class Aggregate_HAS_A {
    public static void main(String[] args) {
        Song hitSong = new Song();
        hitSong.title = "Kolaveri di";
        hitSong.artist = "Dhanush";
        Playlist myJam = new Playlist();
        myJam.track = hitSong;
        myJam.playSong();
        System.out.println("This song is fire! It's on my playlist");
        System.out.println("Song: " +hitSong.title + " by " + hitSong.artist);

        //playlist object destroyed
        myJam = null;
        //access song through playlist
        //myJam.playSong();
        //directly accessing song object
        System.out.println("This song is fire! It's on my playlist");
        System.out.println("Song: " +hitSong.title + " by " + hitSong.artist);
    }
}
