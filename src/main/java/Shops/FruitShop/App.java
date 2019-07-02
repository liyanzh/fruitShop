package Shops.FruitShop;



import Shops.FruitShop.Inventory.Fruit;

/**
 * Fruit Shop App
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
