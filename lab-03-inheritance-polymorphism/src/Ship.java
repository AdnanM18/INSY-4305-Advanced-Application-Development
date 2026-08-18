public abstract class Ship implements Displayable {
    private final String name;
    private final String yearBuilt;

    // Constructor
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Getter for ship name
    public String getName() {
        return name;
    }

    // Getter for year built
    public String getYearBuilt() {
        return yearBuilt;
    }

    // toString method as required by the instructions
    @Override
    public String toString() {
        return "Ship Name: " + name + ", Year Built: " + yearBuilt;
    }

    // Override display method from Displayable interface
    @Override
    public void display() {
        System.out.println(this); // Automatically calls toString()
    }
}
