package pack;

public class MediaPlayerDemo {
    public static void controlPlayer(Playable player) {
        player.play();
        player.pause();
        player.stop();
    }
    public static void main(String[] args) {
        System.out.println("Controlling MP3 Player:");
        Playable p1 = new MP3Player();
        controlPlayer(p1);

        System.out.println("\nControlling CD Player:");
        Playable p2 = new CDPlayer();
        controlPlayer(p2);

        System.out.println("\nControlling Streaming Player:");
        Playable p3 = new StreamingPlayer();
        controlPlayer(p3);
    }
}
