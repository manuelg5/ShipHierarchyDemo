import java.util.ArrayList;

public class ShipDemo {
    public static void main(String[] args) {
        // Create an array of Ship objects
        Ship[] ships = new Ship[4];
        ships[0] = new CruiseShip("Titanic", "1912", 3327);
        ships[1] = new CargoShip("Maersk Alabama", "2004", 50000);
        ships[2] = new CruiseShip("Oasis of the Seas", "2009", 5400);
        ships[3] = new CargoShip("Ever Given", "2018", 220000);

        // Call the display() method for each ship (polymorphism)
        for (Ship ship : ships) {
            ship.display();
        }

        // Create an ArrayList of Ship objects
        ArrayList<Ship> shipList = new ArrayList<>();
        shipList.add(new CruiseShip("Norwegian Epic", "2010", 4100));
        shipList.add(new CargoShip("MSC Zoe", "2015", 192237));

        // Add copy constructors to the list
        shipList.add(new CruiseShip((CruiseShip) ships[0])); // Copy of Titanic
        shipList.add(new CargoShip((CargoShip) ships[1]));   // Copy of Maersk Alabama

        // Call the toString() method for each ship in the ArrayList (polymorphism)
        for (Ship ship : shipList) {
            System.out.println(ship);
        }
    }
}
