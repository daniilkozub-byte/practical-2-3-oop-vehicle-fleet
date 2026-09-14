package ua.mil.vehicles;

import java.util.ArrayList;
import java.util.List;

/**
 * Автопарк підрозділу — зберігає колекцію транспортних засобів.
 * Етап 11.
 */
public class VehicleFleet {

    // TODO (Етап 11): внутрішня колекція має бути недоступною для прямої зміни ззовні
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        // TODO (Етап 11): реалізувати
    }

    public void removeVehicle(Vehicle vehicle) {
        // TODO (Етап 11): реалізувати
    }

    public Vehicle findVehicle(String inventoryNumber) {
        // TODO (Етап 11): знайти транспортний засіб за інвентарним номером
        return null;
    }

    public void showAllVehicles() {
        // TODO (Етап 11): вивести інформацію про всю техніку (getInfo() / toString())
    }

    public void startAllVehicles() {
        // TODO (Етап 11): запустити всю техніку (startEngine())
    }

    public void performAllMissions() {
        // TODO (Етап 6, 11): викликати performMission() для кожного об'єкта (поліморфізм)
    }
}
