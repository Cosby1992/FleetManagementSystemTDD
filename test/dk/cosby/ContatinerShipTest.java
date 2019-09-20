package dk.cosby;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ContatinerShipTest {

    @Test
    void testSetup(){
        assertTrue(true);
    }

    @Test
    void createContainerShip1(){

        ContainerShip containerShip = new ContainerShip("Marco Polo");

        assertEquals("Marco Polo", containerShip.getName());
        assertEquals(LocalDate.of(2012,11,6), containerShip.getLaunchDate());
        assertEquals(187625, containerShip.getDeadweightTonnage());
        assertEquals(16020, containerShip.getContainerCount());
        assertEquals("Empty", containerShip.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containerShip.getStatus());

    }

    @Test
    void createContainerShip2(){

        ContainerShip containerShip = new ContainerShip("Hansa Carrier");

        assertEquals("Hansa Carrier", containerShip.getName());
//        assertEquals(LocalDate.of(2012,11,6), containerShip.getLaunchDate());
//        assertEquals(187625, containerShip.getDeadweightTonnage());
//        assertEquals(16020, containerShip.getContainerCount());
//        assertEquals("Empty", containerShip.getCargoDescription());
//        assertEquals(Status.DOCKED_AT_HOME, containerShip.getStatus());

    }



}
