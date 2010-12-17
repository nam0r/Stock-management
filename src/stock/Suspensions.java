package stock;

/**
 * This enum lists all the known Suspensions for bikes.
 * 
 * An enum for the known suspensions for bikes.
 * 
 * @author Guy Champollion
 * 
 */
public enum Suspensions implements Component {
    FRP23("Fox RP23", 30.00), FRP3("Fox RP3", 40.00);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro

    /** The constructor of the component */
    Suspensions(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /** Returns the component's name. */
    public String getName() {
        return name;
    }

    /** Returns the component's price. */
    public double getPrice() {
        return price;
    }
}
