package org.example.jebin.mahdia.OOP;

public class MainClass {
	
	public static void main (String []args) {
		//instance 1
		Phone iPhone = new Phone("iPhone11", 5, 64, 8);
		
		System.out.println(iPhone.getName());
		
		//instance of object 2
		
		Phone Hawei = new Phone("Hawaei12", 16);
		
		

		iPhone.playMusic("our wings are burning");
		iPhone.playMusic("shower");
		
		
		Bird phoenix = new Bird("Ninja", "black", 2, true);
		System.out.println(phoenix.getName());
		
		phoenix.eat("meat");
		
		
	}
	
	
	


}
