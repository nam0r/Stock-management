package test;
import java.util.ArrayList;


import static org.junit.Assert.*;

import model.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This is a JUnit test class for the Bike class
 * @author Guy Champollion
 * @see Bike
 */
public class BikeTest {
    private Bike bike;
    /**
     * Before processing to test, it creates a new instance of the tested Bike class.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        bike = new Bike(0,Brakes.AJ,Fork.FT,Frame.SPP,Suspension.FRP23,Wheels.DTSX1800);
    }
    /**
     * A test to ensure the Bike.getComponent method returns all the Components of the Bike.
     */
    @Test
    public void testGetComponents() {
        ArrayList<Component> expected = new ArrayList<Component>();
        expected.add(Brakes.AJ);
        expected.add(Fork.FT);
        expected.add(Frame.SPP);
        expected.add(Suspension.FRP23);
        expected.add(Wheels.DTSX1800);
        
        ArrayList<Component> actual = bike.getComponents();
        assertEquals(expected,actual);
    }

}
