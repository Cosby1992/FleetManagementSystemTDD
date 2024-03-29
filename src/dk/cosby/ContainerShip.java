package dk.cosby;

import java.time.LocalDate;

public class ContainerShip {

    private String name;
    private LocalDate launchDate;
    private int deadweightTonnage;
    private int containerCount;
    private String cargoDescription;
    private Status status;


    public ContainerShip(String name, LocalDate launchDate, int deadweightTonnage, int containerCount, String cargoDescription, Status status) {
        this.name = name;
        this.launchDate = launchDate;
        this.deadweightTonnage = deadweightTonnage;
        this.containerCount = containerCount;
        this.cargoDescription = cargoDescription;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLaunchDate() {

        return launchDate;

    }

    public int getDeadweightTonnage() {
        return deadweightTonnage;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public String getCargoDescription() {
        return cargoDescription;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {

        switch(status){

            case DOCKED_AT_HOME: if(this.status != Status.DOCKED_AWAY){this.status = status;} break;
            case DOCKED_AWAY: if(this.status != Status.DOCKED_AT_HOME) {this.status = status;} break;
            case ON_VOYAGE: this.status = status;

        }

    }


    public void setCargoDescription(String cargoDescription) {

        if(status != Status.ON_VOYAGE){
            this.cargoDescription = cargoDescription;
        }

    }
}
