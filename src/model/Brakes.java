package model;

/**
 * An enum for the known brakes for bikes.
 * 
 * @author Guy Champollion
 * 
 */
public enum Brakes implements Component {
    AJ("Avid Juicy", 20.00), FTO("Formula THE ONE", 17.75), HMM(
            "Hope Mono Mini", 18.99);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro

    /** The constructor of the component */
    Brakes(String name, double price) {
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
