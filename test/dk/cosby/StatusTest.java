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

        assertEquals("Docked at home", status.getDescription());


    }

}