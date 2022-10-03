package case_study_furama_resort.src.model;

public class Contract {
    private String numberContract;
    private String idBooking;
    private Double advanceDeposit;
    private Double paymentAmount;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String numberContract, String idBooking, Double advanceDeposit, Double paymentAmount, String idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.advanceDeposit = advanceDeposit;
        this.paymentAmount = paymentAmount;
        this.idCustomer = idCustomer;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public Double getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(Double advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "numberContract='" + numberContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", advanceDeposit=" + advanceDeposit +
                ", paymentAmount=" + paymentAmount +
                ", idCustomer='" + idCustomer + '\'';
    }
}
