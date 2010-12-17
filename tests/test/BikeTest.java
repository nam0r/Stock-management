package test;
import stock.Bike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import stock.Brakes;
import stock.Fork;
import stock.Frame;
import stock.Suspension;
import stock.Wheels;
/**
 * This is a JUnit test class for the Bike class
 * @author Guy Champollion
 * @see Bike
 */
public class BikeTest {

    @Before
    public void setUp() throws Exception {
        Bike bike = new Bike(0,Brakes.AJ,Fork.FT,Frame.SPP,Suspension.FRP23,Wheels.DTSX1800);
    }

    @Test
    public void testGetComponents() {
        fail("Not yet implemented");
    }

}
