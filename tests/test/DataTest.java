package test;

import java.util.ArrayList;

import model.Article;
import model.Bike;
import model.Brakes;
import model.Fork;
import model.Frame;
import model.Suspension;
import model.Wheels;

import org.junit.Test;

import controler.Data;
import static org.junit.Assert.*;

/**
 * Junit test case for Data class.
 * 
 * @author Roman Mkrtchian
 */
public class DataTest {

    /**
     * Tests if the constructor creates the two bikes and what they contain by
     * comparing the toString method. Tests also the getters.
     * */
    @Test
    public void testConstructor() {
        ArrayList<Article> articles = new ArrayList<Article>();
        Bike bike = new Bike(1, Brakes.HMM, Fork.RSR, Frame.SCBLT,
                Suspension.FRP3, Wheels.MXM819);
        articles.add(bike);
        bike = new Bike(1, Brakes.AJ, Fork.RSP, Frame.SPP, Suspension.FRP3,
                Wheels.MC);
        articles.add(bike);
        assertEquals(Data.getInstance().getArticles().toString(),
                articles.toString());
    }

    /**
     * Tests the sell() method. Verifies that after the stock is sold, the
     * product is no more available.
     * */
    @Test
    public void testSell() {
        assertEquals(Data.getInstance().sell(1), "The article has been sold.");
        assertEquals(Data.getInstance().sell(1),
                "Product not available. The command of more of this article has been sent.");
        assertEquals(Data.getInstance().sell(1), "The article has been sold.");
    }

    /**
     * Tests the sell() method. Verifies that only an existing article can be
     * sold.
     * */
    @Test
    public void testSell2() {
        assertEquals(Data.getInstance().sell(5),
                "Unknown or inexistant article asked.");
    }

}
