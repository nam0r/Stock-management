package stock;
/** This is the interface for the components of any Article sold.
 * @author Zarmakuizz
 * @author Namor
 */
public interface Component {
    /** Returns the component's name. */
    public String getName();
    /** Returns the component's price. */
    public double getPrice();
}
