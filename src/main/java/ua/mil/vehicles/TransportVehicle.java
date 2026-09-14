package ua.mil.vehicles;

/**
 * Транспортний засіб — виконує перевезення вантажу.
 * Етапи 4, 5.
 */
public class TransportVehicle extends Vehicle {

    // TODO (Етап 4): власна характеристика, наприклад cargoCapacity
    private final double cargoCapacity;

    public TransportVehicle(String inventoryNumber, String brand, String model, int year,
                             double fuel, double cargoCapacity) {
        super(inventoryNumber, brand, model, year, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    // --- Етап 5: перевизначення performMission() ---
    @Override
    public String performMission() {
        // TODO (Етап 5): реалізувати варіант завдання — перевезення вантажу
        return null;
    }
}
