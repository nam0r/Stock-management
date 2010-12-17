package stock;
/** This is the interface for the components of any Article sold.
 * @author Guy Champollion
 * @author Roman Mkrtchian
 */
public interface Component {
    /** Returns the component's name. */
    public String getName();
    /** Returns the component's price. */
    public double getPrice();
}
