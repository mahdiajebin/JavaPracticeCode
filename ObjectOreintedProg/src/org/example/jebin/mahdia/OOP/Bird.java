package org.example.jebin.mahdia.OOP;

public class Bird extends Animal {

	private int wings;

	public Bird(String name, String color, int leg, boolean hasTale, int wings) {
		super(name, color, leg, hasTale);
		this.wings = wings;
	}
	
	
	
	

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		
		System.out.println("chewing food");
	}





	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	
	public void fly() {
	System.out.println(this.getName() + " is flying ");
	
	}
	
	

}
