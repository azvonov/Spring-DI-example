package root.soundsystem;

import org.springframework.stereotype.Component;

@Component("metallicaAlbum")
public class MasterOfPuppets implements CompactDisc {

    private String title = "Master of Puppets";
    private String artist = "Metallica";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
