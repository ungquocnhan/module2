package mvc_bai_tap_them_2.model;

public class Car extends Vehicle {
    private int numberSeats;
    private String typeCar;

    public Car() {
    }

    public Car(String licensePlate, String nameManufacturingCompany, int yearManufacturing, String owner, int numberSeats, String typeCar) {
        super(licensePlate, nameManufacturingCompany, yearManufacturing, owner);
        this.numberSeats = numberSeats;
        this.typeCar = typeCar;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberSeats=" + numberSeats +
                ", typeCar='" + typeCar + '\'' + super.toString() +
                '}';
    }
}
