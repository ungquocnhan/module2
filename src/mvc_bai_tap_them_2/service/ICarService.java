package mvc_bai_tap_them_2.service;

public interface ICarService {
    void addCar();

    void displayCar();

    void removeCarService(String licensePlateDelete);

    void searchCarService(String licensePlateSearch);
}
