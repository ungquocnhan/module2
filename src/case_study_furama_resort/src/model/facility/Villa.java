package case_study_furama_resort.src.model.facility;

import java.time.LocalDateTime;

public class Villa extends Facility {
    private String roomStandard;
    private Double areaSwimmingPool;
    private Integer numberFloors;

    public Villa() {
    }

    public Villa(String nameService, Double areaUsable, Double rentalCosts, Integer maximumPeople, LocalDateTime rentalType, String roomStandard, Double areaSwimmingPool, Integer numberFloors) {
        super(nameService, areaUsable, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public void setAreaSwimmingPool(Double areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public Integer getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa: " +
                "roomStandard='" + roomStandard + '\'' +
                ", areaSwimmingPool=" + areaSwimmingPool +
                ", numberFloors=" + numberFloors + super.toString();
    }
}
