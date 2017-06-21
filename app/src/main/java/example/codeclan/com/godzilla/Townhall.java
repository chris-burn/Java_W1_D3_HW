package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Townhall extends HumanConstructs implements Destroyable {

    public Townhall(String type, int healthValue) {
        super(type, healthValue);
    }

    public String die() {
        return "Kabooooooooom";
    }

}
