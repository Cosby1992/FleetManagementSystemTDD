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

        ContainerShip containerShip = new ContainerShip("Marco Polo", LocalDate.of(2012, 11, 6), 187625,
                16020, "Empty", Status.DOCKED_AT_HOME);

        assertEquals("Marco Polo", containerShip.getName());
        assertEquals(LocalDate.of(2012,11,6), containerShip.getLaunchDate());
        assertEquals(187625, containerShip.getDeadweightTonnage());
        assertEquals(16020, containerShip.getContainerCount());
        assertEquals("Empty", containerShip.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containerShip.getStatus());

    }

    @Test
    void createContainerShip2(){

        ContainerShip containerShip = new ContainerShip("Hansa Carrier", LocalDate.of(1989, 2, 1), 26366,
                1799, "Empty", Status.DOCKED_AT_HOME);

        assertEquals("Hansa Carrier", containerShip.getName());
        assertEquals(LocalDate.of(1989,2,1), containerShip.getLaunchDate());
        assertEquals(26366, containerShip.getDeadweightTonnage());
        assertEquals(1799, containerShip.getContainerCount());
        assertEquals("Empty", containerShip.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containerShip.getStatus());

    }

    private ContainerShip getNewHansaCarrier(){
        return new ContainerShip("Hansa Carrier", LocalDate.of(1989, 2, 1), 26366,
                1799, "Empty", Status.DOCKED_AT_HOME);
    }

    @Test
    void changeNameTest(){
        ContainerShip containerShip = getNewHansaCarrier();
        containerShip.setName("Ocean Hope");

        assertEquals("Ocean Hope", containerShip.getName());
    }

    @Test
    void setStatusTest(){

        ContainerShip containerShip = getNewHansaCarrier();

        assertEquals(Status.DOCKED_AT_HOME, containerShip.getStatus());

        containerShip.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AT_HOME, containerShip.getStatus());

        containerShip.setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, containerShip.getStatus());

        containerShip.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AWAY, containerShip.getStatus());

        containerShip.setStatus(Status.DOCKED_AT_HOME);
        assertEquals(Status.DOCKED_AWAY, containerShip.getStatus());

    }

    @Test
    void changeCargoDesription(){

        ContainerShip ship = getNewHansaCarrier();

        ship.setCargoDescription("Nike Shoes");

        assertEquals("Nike Shoes", ship.getCargoDescription());
        

    }



}
