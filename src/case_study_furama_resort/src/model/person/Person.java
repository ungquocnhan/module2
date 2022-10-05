package case_study_furama_resort.src.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String id;
    private String name;
    private LocalDate dayOfBirth;
    private String gender;
    private String numberIdentityCard;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, LocalDate dayOfBirth, String gender, String numberIdentityCard, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.numberIdentityCard = numberIdentityCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberIdentityCard() {
        return numberIdentityCard;
    }

    public void setNumberIdentityCard(String numberIdentityCard) {
        this.numberIdentityCard = numberIdentityCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", gender=" + gender +
                ", numberIdentityCard='" + numberIdentityCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'';
    }
}
