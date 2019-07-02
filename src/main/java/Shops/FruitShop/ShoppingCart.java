/**
 * 
 */
package Shops.FruitShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import Shops.FruitShop.Inventory.Fruit;
import Shops.FruitShop.Inventory.Promotion;

/**
 * The shopping cart can contain apples and oranges, invalid items will be ignored
 * @author liyan Zhang
 *
 */
public class ShoppingCart {
	
	List<Fruit> cart = new ArrayList<Fruit>();
	
	boolean isValidItem (Fruit fruit) {
		return Arrays.asList(Fruit.values()).toString().contains(fruit.getName());
	}
	
	/**
	 * Add fruit to the shopping cart, if the item is valid. 
	 * @param fruit
	 * @return true if the item is added, otherwise false
	 */
	boolean addItem (Fruit fruit){
		boolean isSuccess = false;
		if (fruit != null && isValidItem(fruit)) {
			cart.add(fruit );
			isSuccess = true;
		}
		return isSuccess;
	}
	
	/**
	 * getTotal will apply promotions:
	 * buy one, get one free for Apples
	 * 3 for the price of 2 on oranges
	 * @return the grand total
	 */
	double getTotal () {
		long appleCount = cart.stream().filter(f -> f == Fruit.Apple).count();
		//Apple promotion buy one get one free
		Promotion applePromotion = (count)  -> Math.ceil(count / 2 ) * Fruit.Apple.getPrice();
		double appleSubTotal = applePromotion.applyPromotion(appleCount);
		
		long orangeCount = cart.parallelStream().filter(f -> f==Fruit.Orange).count();
		//Orange promotion, 3 for the price of 2.  the unit price will be applied for the remainders if there are any
		Promotion orangePromotion = (count) -> ((orangeCount / 3) * 2 + orangeCount%3) * Fruit.Orange.getPrice();
		double orangeSubTotal = orangePromotion.applyPromotion(orangeCount);
		
		//double total = Math.ceil(appleCount / 2 ) *Fruit.Apple.getPrice() + ((orangeCount / 3) * 2 + orangeCount%3) * Fruit.Orange.getPrice();
		
		return appleSubTotal + orangeSubTotal;
	}
	
}
