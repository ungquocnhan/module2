package mvc_bai_tap_them_2.service;

public interface ITruckService {
    void addTruck();

    void displayTruck();

    void removeTruckService(String licensePlateDelete);

    void searchTruckService(String licensePlateSearch);
}
