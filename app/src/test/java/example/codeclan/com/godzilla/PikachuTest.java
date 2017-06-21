package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/06/2017.
 */

public class PikachuTest {
    Pikachu pikachu;

    @Before
    public void before(){
        pikachu = new Pikachu("Jane", 150, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Jane", pikachu.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("PIKA! PIKA!", pikachu.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(150, pikachu.getHealthValue());
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(30, pikachu.getDestructiveForce());
    }
}
