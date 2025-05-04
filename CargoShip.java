public class CargoShip extends Ship {
    private int cargoCapacity;

    // Constructor
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Copy Constructor
    public CargoShip(CargoShip other) {
        super(other.getName(), other.getYearBuilt());
        this.cargoCapacity = other.cargoCapacity;
    }

    // Accessor methods
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tons";
    }

    // Override the display method
    @Override
    public void display() {
        System.out.println(toString());
    }
}
