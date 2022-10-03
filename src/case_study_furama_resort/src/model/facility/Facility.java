package case_study_furama_resort.src.model.facility;

import java.time.LocalDateTime;

public class Facility {
    private String nameService;
    private Double areaUsable;
    private Double rentalCosts;
    private Integer maximumPeople;
    private LocalDateTime rentalType;

    public Facility() {
    }

    public Facility(String nameService, Double areaUsable, Double rentalCosts, Integer maximumPeople, LocalDateTime rentalType) {
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(Double areaUsable) {
        this.areaUsable = areaUsable;
    }

    public Double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(Integer maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public LocalDateTime getRentalType() {
        return rentalType;
    }

    public void setRentalType(LocalDateTime rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility: " +
                "nameService='" + nameService +
                ", areaUsable=" + areaUsable +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType=" + rentalType ;
    }
}
