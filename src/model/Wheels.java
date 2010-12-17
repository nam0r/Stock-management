package model;

/**
 * An enum for the known wheels for bikes.
 * 
 * @author Guy Champollion
 * 
 */
public enum Wheels implements Component {
    DTSX1800("DT Swiss X1800", 90.00), MXM819("Mavic xm819", 95.95), MC(
            "Mavic CrossMax", 99.99);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro

    /** The constructor of the component */
    Wheels(String name, double price) {
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
