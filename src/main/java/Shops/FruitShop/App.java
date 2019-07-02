package Shops.FruitShop;

import java.util.ArrayList;
import java.util.List;

import Shops.FruitShop.Inventory.Fruit;

/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args )
    {
        ShoppingCart myCart = new ShoppingCart();
        
        myCart.addItem(Fruit.Apple);
        myCart.addItem(Fruit.Apple);
        myCart.addItem(Fruit.Orange);
        myCart.addItem(Fruit.Apple);
        myCart.addItem(Fruit.UNKNOWN);
        myCart.addItem(Fruit.Orange);
    }
}
