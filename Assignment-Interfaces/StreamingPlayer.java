package pack;

public class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming Player is streaming music.");
    }
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }
    public void stop() {
        System.out.println("Streaming Player has stopped streaming.");
    }
}
