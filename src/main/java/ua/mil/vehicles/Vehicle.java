package ua.mil.vehicles;

import java.util.Objects;

/**
 * Базовий абстрактний клас для всіх типів військової техніки підрозділу.
 * <p>
 * Реалізується поетапно згідно з docs/ROADMAP.md (Етапи 1, 2, 3, 7, 8, 9, 10).
 */
public abstract class Vehicle {

    private final String inventoryNumber;
    private final String brand;
    private final String model;
    private final int year;
    private double fuel;

    // --- Етап 1: конструктор ---
    protected Vehicle(String inventoryNumber, String brand, String model, int year, double fuel) {
        // TODO (Етап 1): перевірити, що fuel >= 0 (наприклад, кинути IllegalArgumentException)
        this.inventoryNumber = inventoryNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }

    // --- Етап 1: методи доступу (геттери) ---
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuel() {
        return fuel;
    }

    // --- Етап 2: поведінка транспортного засобу ---

    public void startEngine() {
        // TODO (Етап 2): реалізувати
    }

    public void stopEngine() {
        // TODO (Етап 2): реалізувати
    }

    public void move() {
        // TODO (Етап 2): реалізувати
    }

    /**
     * Базовий варіант заправки.
     */
    public void refuel() {
        // TODO (Етап 2): збільшити fuel з перевіркою допустимої кількості
    }

    // --- Етап 7: перевантаження refuel() ---

    public void refuel(int liters) {
        // TODO (Етап 7): реалізувати перевантажений варіант
    }

    public void refuel(int liters, String fuelType) {
        // TODO (Етап 7): реалізувати перевантажений варіант з типом палива
    }

    /**
     * Повертає інформацію про транспортний засіб.
     */
    public String getInfo() {
        // TODO (Етап 2): повернути зручний опис об'єкта
        return null;
    }

    // --- Етап 3: абстрактна поведінка ---

    /**
     * Загальна операція, яку може виконувати будь-який транспортний засіб.
     * Конкретна реалізація залежить від типу техніки (див. дочірні класи).
     */
    public abstract String performMission();

    // --- Етап 8: toString() ---
    @Override
    public String toString() {
        // TODO (Етап 8): реалізувати зручне текстове представлення
        return super.toString();
    }

    // --- Етап 9: equals() ---
    @Override
    public boolean equals(Object o) {
        // TODO (Етап 9): реалізувати за inventoryNumber з урахуванням:
        //   1) порівняння з самим собою
        //   2) перевірки на null
        //   3) перевірки сумісності типів
        //   4) порівняння значущого поля
        return super.equals(o);
    }

    // --- Етап 10: hashCode() ---
    @Override
    public int hashCode() {
        // TODO (Етап 10): використати те саме поле, що й у equals()
        return super.hashCode();
    }
}
