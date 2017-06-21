package example.codeclan.com.godzilla;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Chris", 100, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Chris", godzilla.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("ROAR!", godzilla.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(50, godzilla.getDestructiveForce());
    }
}
