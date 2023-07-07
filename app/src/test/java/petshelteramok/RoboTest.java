package petshelteramok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoboTest {

    private RoboticCat ludo;
    private RoboticDog maxwell;
    
    @BeforeEach void setUp(){
        ludo = new RoboticCat("ludo", "grey striped angel");
        maxwell = new RoboticDog("max", "pembroke corgi");
    }

    @Test void catCreate(){
        assertNotNull(ludo);
    }

    @Test void dogCreate(){
        assertNotNull(maxwell);
    }

    @Test void oilTest(){
        ludo.oilRobo();
        assertEquals(70,ludo.getOilLevel(),"that cat aint oiled");
    }







}
