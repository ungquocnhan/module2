package mvc_bai_tap_them_2.service;

public interface IMotorcycleService {
    void addMotorcycle();

    void displayMotorcycle();

    void removeMotorcycleService(String licensePlateDelete);

    void searchMotorcycleService(String licensePlateSearch);
}
