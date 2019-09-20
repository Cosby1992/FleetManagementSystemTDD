package dk.cosby;

import java.time.LocalDate;

public class ContainerShip {

    private String name;

    public ContainerShip(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLaunchDate() {

        return LocalDate.of(2012,11,6);

    }
}
