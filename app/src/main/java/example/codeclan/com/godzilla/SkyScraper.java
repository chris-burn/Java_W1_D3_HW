package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class SkyScraper extends HumanConstructs implements Destroyable {

    public SkyScraper(String type, int healthValue) {
        super (type, healthValue);
    }

    public String die() {
        return "CRRRAAASSSHH!";
    }

}

