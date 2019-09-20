package dk.cosby;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {

    @Test
    void setupTest(){
        assertTrue(true);
    }

    @Test
    void StatusTest(){

        Status status = Status.DOCKED_AT_HOME;
        Status status1 = Status.DOCKED_AWAY;
        Status status2 = Status.ON_VOYAGE;

        assertEquals("Docked at home", status.getDescription());
        assertEquals("Docked away", status1.getDescription());
        assertEquals("On voyage...", status2.getDescription());

    }

}