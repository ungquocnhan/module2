package mvc_bai_tap_them_2.model;

public class Motorcycle extends Vehicle {
    private String wattage;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, String nameManufacturingCompany, int yearManufacturing, String owner, String wattage) {
        super(licensePlate, nameManufacturingCompany, yearManufacturing, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wattage='" + wattage + '\'' + super.toString() +
                '}';
    }
}
