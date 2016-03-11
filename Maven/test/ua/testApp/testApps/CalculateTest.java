package ua.testApp.testApps;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stas on 11.03.2016.
 */
public class CalculateTest {

    @Test
    public void testAddresult() throws Exception {
        Calculate calculate = new Calculate();

            assertEquals(55, calculate.addresult(30,20,5));

    }
    @Test
    public void testGetDivision()throws  Exception {
        Calculate calculate = new Calculate();
        assertEquals(-55,calculate.getDivision(30,20,5));
    }
}