public class CruiseShip extends Ship {
    private int maxPassengers;

    // Constructor
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Copy Constructor
    public CruiseShip(CruiseShip other) {
        super(other.getName(), other.getYearBuilt());
        this.maxPassengers = other.maxPassengers;
    }

    // Accessor methods
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Cruise Ship Name: " + getName() + ", Max Passengers: " + maxPassengers;
    }

    // Override the display method
    @Override
    public void display() {
        System.out.println(toString());
    }
}
