package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SkyScraperTest {
    SkyScraper skyscraper;


    @Before
    public void before(){
        skyscraper = new SkyScraper("Nakatomi Plaza", 50);
    }

    @Test
    public void hasType(){
        assertEquals("Nakatomi Plaza", skyscraper.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(50, skyscraper.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("CRRRAAASSSHH!", skyscraper.die());
    }
}
