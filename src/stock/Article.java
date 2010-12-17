package stock;
/**
 * This is an abstract class for all the Article that are sold.
 * @author Zarmakuizz
 * @author Namor
 *
 */
public abstract class Article {
    /** The price of the Article, in euro. */
    protected double price; // in euro
    /** The number of Articles available in stock. */
    protected int nbInStock;
    /** The number of Articles that have been sold. */
    protected int nbSold;

}
