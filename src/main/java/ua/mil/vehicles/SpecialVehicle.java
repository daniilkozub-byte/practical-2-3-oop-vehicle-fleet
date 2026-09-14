package ua.mil.vehicles;

/**
 * Спеціальна техніка — виконує спеціальне завдання.
 * Етапи 4, 5.
 */
public class SpecialVehicle extends Vehicle {

    // TODO (Етап 4): власна характеристика, наприклад specialEquipment
    private final String specialEquipment;

    public SpecialVehicle(String inventoryNumber, String brand, String model, int year,
                           double fuel, String specialEquipment) {
        super(inventoryNumber, brand, model, year, fuel);
        this.specialEquipment = specialEquipment;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }

    // --- Етап 5: перевизначення performMission() ---
    @Override
    public String performMission() {
        // TODO (Етап 5): реалізувати варіант завдання — виконання спеціального завдання
        return null;
    }
}
