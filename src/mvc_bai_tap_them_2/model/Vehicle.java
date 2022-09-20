package mvc_bai_tap_them_2.model;

public abstract class Vehicle {
    private String licensePlate;
    private String nameManufacturingCompany;
    private int yearManufacturing;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlate,String nameManufacturingCompany,int yearManufacturing,String owner){
        this.licensePlate = licensePlate;
        this.nameManufacturingCompany = nameManufacturingCompany;
        this.yearManufacturing = yearManufacturing;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getNameManufacturingCompany() {
        return nameManufacturingCompany;
    }

    public void setNameManufacturingCompany(String nameManufacturingCompany) {
        this.nameManufacturingCompany = nameManufacturingCompany;
    }

    public int getYearManufacturing() {
        return yearManufacturing;
    }

    public void setYearManufacturing(int yearManufacturing) {
        this.yearManufacturing = yearManufacturing;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", nameManufacturingCompany='" + nameManufacturingCompany + '\'' +
                ", yearManufacturing=" + yearManufacturing +
                ", owner='" + owner + '\'' +
                '}';
    }
}
