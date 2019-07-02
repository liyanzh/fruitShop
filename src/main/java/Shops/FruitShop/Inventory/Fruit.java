package Shops.FruitShop.Inventory;

public enum Fruit  {
	
	UNKNOWN(0, "unknown", 0),
	Apple(1, "Apple", 60.0),
	Orange(2, "Orange", 25.0);
    
	
	
	int code;
	String name;
	double price;
	
	private Fruit (int code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public int getCode() {
		// TODO Auto-generated method stub
		return code;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
