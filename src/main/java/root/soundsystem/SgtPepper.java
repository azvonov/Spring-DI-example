package root.soundsystem;

import org.springframework.stereotype.Component;


@Component("sgt")
public class SgtPepper implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
