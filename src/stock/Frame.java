package stock;
/**
 * An enum for the known frames for bikes.
 * @author Guy Champollion
 *
 */
public enum Frame implements Component {
    SCBLT("Santa Cruz Blur LT",    60.00),
    SG50 ("Scott Genius 50",       65.65),
    SPP  ("Specialized Pitch Pro", 69.99),
    Y575 ("Yeti 575",              75.35);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro
    /** The constructor of the component */
    Frame(String name, double price){
        this.name = name;
        this.price = price;
    }
    /** Returns the component's name. */
    public String getName() { return name; }
    /** Returns the component's price. */
    public double getPrice(){ return price; }
}
