package test;

import java.util.ArrayList;

import model.Article;
import model.Component;

/**
 * This class is aimed to test every Article method, to ensure
 * the Article's children classes won't have to test each.
 * @author Guy Champollion
 * @see Article
 */
public class ArticleMock extends Article {
    /**
     * The constructor of the Article mock. 
     * @param nbInStock How many of the given Article are already available in stock.
     */
    public ArticleMock(int nbInStock) {
        super(nbInStock);
        this.price = 0;
    }
    /**
     * Get all of the Article's component.
     * This mock doesn't contain any.
     */
    @Override
    public ArrayList<Component> getComponents() {
        return new ArrayList<Component>();
    }

}
