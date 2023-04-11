package de.demmer.dennis;

public class Item {
	
	private double price;
	private String name;
	
	
	public double getPrice() {
		
		return price;
	}
	
	
	public void setPrice(double price) {
		
		if(price < 0.01) {
			System.out.println(price + " ist zu klein. Price unter 0.01. Der neue Price wurde auf 0.01 gesetzt");
			price = 0.01;
		}
		
		this.price = price;
		
	}
	
	

}
