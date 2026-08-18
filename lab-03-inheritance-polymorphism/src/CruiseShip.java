public class CruiseShip extends Ship {
    private final int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Copy constructor
    public CruiseShip(CruiseShip other) {
        super(other.getName(), other.getYearBuilt());
        this.maxPassengers = other.maxPassengers;
    }

    // Removed getMaxPassengers() to avoid unused method warning

    // Overridden toString method
    @Override
    public String toString() {
        return "Cruise Ship Name: " + getName() + ", Max Passengers: " + maxPassengers;
    }

    // Overridden display method to show specific CruiseShip details
    @Override
    public void display() {
        System.out.println("Cruise Ship Name: " + getName() + ", Max Passengers: " + maxPassengers);
    }
}
