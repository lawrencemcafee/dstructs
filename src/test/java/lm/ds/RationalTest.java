//Lawrence McAfee

package lm.ds;

import junit.framework.*;

// A demonstration of JUnit testing
public class RationalTest extends TestCase
{
    Rational r1, r2;
    
    public RationalTest (String name)
    {
        super (name);
    }
    
    // Create variables to used in each test case
    protected void setUp()
    {
        r1 = new Rational(6, 8);
        r2 = new Rational(1, 3);
    }

    // Test that the "equals" method works properly
    public void testEquals()
    {
        assertEquals(r1,r1);
        assertEquals(r1, new Rational(3, 4));
        assertTrue(!r2.equals(r1));

        // this is less effective because it doesn't use Rational.equals
        assertTrue(r1.toString().equals("3/4"));
    }
    
    public void testOperators()
    {
        assertEquals(r1.add(r2), new Rational(13,12));
        assertEquals(r1.subtract(r2), new Rational(5,12));
        assertEquals(r1.multiply(r2), new Rational(1,4));
        assertEquals(r1.divide(r2), new Rational(9,4));
    }
    
}

//eof
