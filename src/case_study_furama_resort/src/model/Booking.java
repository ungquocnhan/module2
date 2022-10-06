package case_study_furama_resort.src.model;

import java.time.LocalDate;

public class Booking {
    private String idBooking;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String idCustomer;
    private String idService;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBooking, LocalDate dateStart, LocalDate dateEnd, String idCustomer, String idService, String typeService) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.idService = idService;
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

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
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
                ", nameService='" + idService + '\'' +
                ", typeService='" + typeService + '\'';
    }
}
