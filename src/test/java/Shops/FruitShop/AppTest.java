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
         
    	 //test empty shopping cart:
    	 double myTotal = myCart.getTotal();
         double expectedTotal = 0;
         System.out.println("empty cart: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
         
         //test one apple only, the price should equals to one apple instead of half price 
         myCart.addItem(Fruit.Apple);
         
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice() ;
         System.out.println("1 apple only: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 

         
         //test two apples, the price should equals to one apple
         myCart.addItem(Fruit.Apple);
         
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice() ;
         System.out.println("2 apples only: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
         
         //test three apples, the price should equals to two apples
         myCart.addItem(Fruit.Apple);
         
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice()*2 ;
         System.out.println("3 apples only: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
         
         //test four apples, the price should equals to two apples
         myCart.addItem(Fruit.Apple);
         
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice()*2 ;
         System.out.println("4 apples only: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
         
         //test 4 apples and 1 oranges, the total should equals sum of 2 apples plus 1 orange
         myCart.addItem(Fruit.Orange);
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice()*2 + Fruit.Orange.getPrice() ;
         System.out.println("4 apples plus 1 orange: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
         
         //test 4 apples and 2 oranges, the total should equals sum of 2 apples plus 1 orange
         myCart.addItem(Fruit.Orange);
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice()*2 + Fruit.Orange.getPrice() * 2 ;
         System.out.println("4 apples plus 2 orange: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
         
         //test 4 apples and 3 oranges, the total should equals sum of 2 apples plus 1 orange
         myCart.addItem(Fruit.Orange);
         myTotal = myCart.getTotal();
         expectedTotal = Fruit.Apple.getPrice()*2 + Fruit.Orange.getPrice() * 2 ;
         System.out.println("4 apples plus 3 orange: mytotal = " + myTotal + ", expected = " + expectedTotal);
         assertEquals(expectedTotal, myTotal); 
    }
    
}
