package pack;

public class CDPlayer implements Playable{
    public void play() {
        System.out.println("CD Player is playing music.");
    }
    public void pause() {
        System.out.println("CD Player is paused.");
    }
    public void stop() {
        System.out.println("CD Player has stopped playing.");
    }
}
