package case_study_furama_resort.src.model.person;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, LocalDate dayOfBirth, String gender, String numberIdentityCard, String numberPhone, String email, String typeGuest, String address) {
        super(id, name, dayOfBirth, gender, numberIdentityCard, numberPhone, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' + super.toString();
    }
}
