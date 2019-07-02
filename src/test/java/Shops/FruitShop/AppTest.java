package Shops.FruitShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Shops.FruitShop.Inventory.Fruit;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 ShoppingCart myCart = new ShoppingCart();
         
         myCart.addItem(Fruit.Apple);
         myCart.addItem(Fruit.Apple);
         myCart.addItem(Fruit.Orange);
         myCart.addItem(Fruit.Apple);
         myCart.addItem(Fruit.UNKNOWN);
         myCart.addItem(Fruit.Orange);
         
         double myTotal = myCart.getTotal();
         double expectedTotal = Fruit.Apple.getPrice() * 3 + Fruit.Orange.getPrice() * 2;
         System.out.println("mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
       
    }
}
