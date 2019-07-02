/**
 * 
 */
package Shops.FruitShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import Shops.FruitShop.Inventory.Fruit;

/**
 * @author liyan
 *
 */
public class ShoppingCart {
	
	List<Fruit> cart = new ArrayList<Fruit>();
	
	boolean isValidItem (Fruit fruit) {
		return Arrays.asList(Fruit.values()).toString().contains(fruit.getName());
	}
	
	boolean addItem (Fruit fruit){
		boolean isSuccess = false;
		if (fruit != null && isValidItem(fruit)) {
			cart.add(fruit );
			isSuccess = true;
		}
		return isSuccess;
	}
	
	double getTotal () {
		double total = cart.stream().map(f -> f.getPrice()).reduce(0.0, Double::sum);
		return total;
	}
	
	@Override
	public toString() {
		StringBuffer result = new StringBuffer("Items in your cart");
		forEach(Fruit f: cart)
		{
			result.append(f.getName() + "\t" + f.getPrice());
		}
		
		return result.toString();
	}

}
