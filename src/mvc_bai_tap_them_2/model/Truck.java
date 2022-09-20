package mvc_bai_tap_them_2.model;

public class Truck extends Vehicle {
    private String tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, String nameManufacturingCompany, int yearManufacturing, String owner, String tonnage) {
        super(licensePlate, nameManufacturingCompany, yearManufacturing, owner);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage + super.toString() +
                '}';
    }
}
