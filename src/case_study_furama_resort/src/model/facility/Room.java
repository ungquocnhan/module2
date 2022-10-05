package case_study_furama_resort.src.model.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String nameService, Double areaUsable, Double rentalCosts, Integer maximumPeople, String rentalType, String idService, String freeServiceIncluded) {
        super(nameService, areaUsable, rentalCosts, maximumPeople, rentalType, idService);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room: " +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' + super.toString();
    }
}
