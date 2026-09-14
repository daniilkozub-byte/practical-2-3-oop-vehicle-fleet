package ua.mil.vehicles;

/**
 * Бронетехніка — виконує транспортування особового складу.
 * Етапи 4, 5.
 */
public class ArmoredVehicle extends Vehicle {

    // TODO (Етап 4): власна характеристика, наприклад armorLevel
    private final int armorLevel;

    public ArmoredVehicle(String inventoryNumber, String brand, String model, int year,
                           double fuel, int armorLevel) {
        super(inventoryNumber, brand, model, year, fuel);
        this.armorLevel = armorLevel;
    }

    public int getArmorLevel() {
        return armorLevel;
    }

    // --- Етап 5: перевизначення performMission() ---
    @Override
    public String performMission() {
        // TODO (Етап 5): реалізувати варіант завдання — транспортування особового складу
        return null;
    }
}
