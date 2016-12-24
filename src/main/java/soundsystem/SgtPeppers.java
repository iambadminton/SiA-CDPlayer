package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Sanya on 17.12.2016.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Perrer's Lonely Hearts Club Band";
    private String artist = "Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);

    }
}
