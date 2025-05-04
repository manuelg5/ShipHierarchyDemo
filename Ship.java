public abstract class Ship implements Displayable {
    private String name;
    private String yearBuilt;

    // Constructor
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // toString method
    @Override
    public String toString() {
        return "Ship Name: " + name + ", Year Built: " + yearBuilt;
    }

    // Implement the display method
    @Override
    public void display() {
        System.out.println(toString());
    }
}
