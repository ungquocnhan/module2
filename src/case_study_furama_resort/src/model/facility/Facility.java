package case_study_furama_resort.src.model.facility;

public abstract class Facility {
    private String nameService;
    private Double areaUsable;
    private Double rentalCosts;
    private Integer maximumPeople;
    private String rentalType;
    private String idService;

    public Facility() {
    }

    public Facility(String nameService, Double areaUsable, Double rentalCosts, Integer maximumPeople, String rentalType, String idService) {
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
        this.idService = idService;
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

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUsable=" + areaUsable +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType=" + rentalType +
                ", idService='" + idService + '\'' +
                '}';
    }
}
