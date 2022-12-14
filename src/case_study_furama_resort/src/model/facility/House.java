package case_study_furama_resort.src.model.facility;

public class House extends Facility {
    private String roomStandard;
    private Integer numberFloors;

    public House() {
    }

    public House(String nameService, Double areaUsable, Double rentalCosts, Integer maximumPeople, String rentalType, String idService, String roomStandard, Integer numberFloors) {
        super(nameService, areaUsable, rentalCosts, maximumPeople, rentalType, idService);
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
        return "House : " +
                "roomStandard= " + roomStandard + '\'' +
                ", numberFloors= " + numberFloors + super.toString();
    }
}
