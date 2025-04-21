package pack;

public class MP3Player implements Playable{
    public void play() {
        System.out.println("MP3 Player is playing music.");
    }
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }
    public void stop() {
        System.out.println("MP3 Player has stopped playing.");
    }
}
