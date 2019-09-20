package dk.cosby;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContatinerShipTest {

    @Test
    void testSetup(){
        assertTrue(true);
    }

    @Test
    void createContainerShip1(){

        ContainerShip containerShip = new ContatinerShip("Marco Polo");

        assertEquals("Marco Polo", ContatinerShip.getName());


    }



}
