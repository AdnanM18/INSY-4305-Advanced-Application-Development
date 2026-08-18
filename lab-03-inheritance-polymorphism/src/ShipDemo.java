import java.util.ArrayList;

public class ShipDemo {

    public static void main(String[] args) {
        // Demonstrating polymorphism with a Ship array
        Ship[] shipArray = new Ship[3];
        shipArray[0] = new CruiseShip("The Voyager", "2015", 5000);
        shipArray[1] = new CargoShip("Ocean Carrier", "2000", 30000);
        shipArray[2] = new CruiseShip("Sea Explorer", "2019", 6000);

        System.out.println("Displaying ship information using an array:");
        for (Ship ship : shipArray) {
            ship.display();  // Polymorphism in action
        }

        // Using an ArrayList to demonstrate polymorphism
        ArrayList<Ship> shipList = new ArrayList<>();
        shipList.add(new CruiseShip("Majestic", "2015", 3000));
        shipList.add(new CargoShip("Hercules", "2000", 75000));

        System.out.println("\nDisplaying ship information using an ArrayList:");
        for (Ship ship : shipList) {
            System.out.println(ship);  // Automatically calls toString()
        }

        // Testing copy constructors
        CruiseShip copiedCruiseShip = new CruiseShip((CruiseShip) shipArray[0]);
        CargoShip copiedCargoShip = new CargoShip((CargoShip) shipArray[1]);

        System.out.println("\nCopy of CruiseShip:");
        copiedCruiseShip.display();

        System.out.println("\nCopy of CargoShip:");
        copiedCargoShip.display();
    }
}
