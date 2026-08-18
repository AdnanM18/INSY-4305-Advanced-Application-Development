public class CargoShip extends Ship {
    private final int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Copy constructor
    public CargoShip(CargoShip other) {
        super(other.getName(), other.getYearBuilt());
        this.cargoCapacity = other.cargoCapacity;
    }

    // Removed getCargoCapacity() to avoid unused method warning

    // Overridden toString method
    @Override
    public String toString() {
        return "Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tons";
    }

    // Overridden display method to show specific CargoShip details
    @Override
    public void display() {
        System.out.println("Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tons");
    }
}
