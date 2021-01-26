package org.example.jebin.mahdia.OOP;

public class Dog {
	
	private String name;
	private String color;
	private int leg;
	private boolean hasTale;
	
	

	//con
	public Dog(String name, String color, int leg, boolean hasTale) {
		this.name = name;
		this.color = color;
		this.leg = leg;
		this.hasTale = hasTale;
	}
	
	//get and set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public boolean isHasTale() {
		return hasTale;
	}
	public void setHasTale(boolean hasTale) {
		this.hasTale = hasTale;
	}
	
	

}
