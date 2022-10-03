package case_study_furama_resort.src.model.facility;

import java.time.LocalDateTime;

public class House extends Facility {
    private String roomStandard;
    private Integer numberFloors;

    public House() {
    }

    public House(String nameService, Double areaUsable, Double rentalCosts, Integer maximumPeople, LocalDateTime rentalType, String roomStandard, Integer numberFloors) {
        super(nameService, areaUsable, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House: " +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors + super.toString();
    }
}
