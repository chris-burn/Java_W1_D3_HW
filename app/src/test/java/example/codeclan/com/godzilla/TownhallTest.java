package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/06/2017.
 */

public class TownhallTest {
    Townhall townhall;


    @Before
    public void before(){
        townhall = new Townhall("Cityhall", 20);
    }

    @Test
    public void hasType(){
        assertEquals("Cityhall", townhall.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(20, townhall.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Kabooooooooom", townhall.die());
    }

}
