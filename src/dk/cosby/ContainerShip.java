package dk.cosby;

import java.time.LocalDate;

public class ContainerShip {

    private String name;
    private LocalDate launchDate;

    public ContainerShip(String name, LocalDate launchDate) {
        this.name = name;
        this.launchDate = launchDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLaunchDate() {

        return launchDate;

    }

    public int getDeadweightTonnage() {
        return 187625;
    }

    public int getContainerCount() {
        return 16020;
    }

    public String getCargoDescription() {
        return "Empty";
    }

    public Status getStatus() {
        return Status.DOCKED_AT_HOME;
    }
}
