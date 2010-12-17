package test;

import static org.junit.Assert.*;

import model.NotAvailableException;

import org.junit.Before;
import org.junit.Test;

/**
 * This is a JUnit test class to check the Article behaviour using a mock : ArticleMock.
 * @author Guy Champollion
 * @see ArticleMock
 * @see Article
 */
public class ArticleTest {
    private ArticleMock article;
    public static final int NUMBERINSTOCK = 1;
    @Before
    public void setUp() throws Exception {
        article = new ArticleMock(NUMBERINSTOCK);
    }
    /**
     * Chech every attributes that have been instantiated by the Article constructor.
     */
    @Test
    public void testArticle() {
        // Check the number of Article available
        assertEquals(NUMBERINSTOCK,article.getInStock());
        // Check the number of Article sold, when no Article has been sold
        assertEquals(0,article.getSold());
    }
    /**
     * Check the effect of one sell.
     */
    @Test
    public void testSell() throws NotAvailableException {
        article.sell();
        assertEquals(0,article.getInStock());
        assertEquals(1,article.getSold());
        assertTrue(article.getPrice() == article.soldValue());
    }
    /**
     * Check the effect of an impossible sell.
     */
    @Test(expected=NotAvailableException.class)
    public void testFailedSell() throws NotAvailableException {
        article.sell();
        article.sell();
        article.sell();
    }
    /**
     * Check the total value when none has been sold.
     */
    @Test
    public void testSoldValue(){
        assertTrue(0 == article.soldValue());
    }

}
