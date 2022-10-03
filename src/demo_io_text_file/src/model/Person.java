package demo_io_text_file.src.model;

public abstract class Person {
    private String code;
    private String name;
    private Boolean gender;

    public Person(String code, String name, Boolean gender) {
        this.code = code;
        this.name = name;
        this.gender = gender;
    }

    public Person() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        if (getGender()) {
            return "Person{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", gender=" + "Nam" + '}';
        } else if (!getGender()) {
            return "Person{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", gender=" + "Nữ" + '}';
        } else if (getGender() == null) {
            return "Person{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", gender=" + "LGBT" + '}';
        }
        return toString();
    }
}
