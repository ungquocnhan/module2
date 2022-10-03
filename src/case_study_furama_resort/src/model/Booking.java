package case_study_furama_resort.src.model;

import java.time.LocalDate;

public class Booking {
    private String idBooking;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBooking, LocalDate dateStart, LocalDate dateEnd, String idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking: " +
                "idBooking='" + idBooking + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'';
    }
}
