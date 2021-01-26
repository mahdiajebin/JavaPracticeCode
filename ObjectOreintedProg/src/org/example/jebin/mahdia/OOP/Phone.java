package org.example.jebin.mahdia.OOP;

public class Phone {
	//object
	private String name;
	private int screenSize;
	private int memoryRam;
	private int camera;
	
	
	//instantiating object 
	//using constructor we can set the values when we instantiate the object in other place.
	//constructor
	public Phone(String name, int screenSize, int memoryRam, int camera) {
		this.name = name;
		this.screenSize = screenSize;
		this.memoryRam = memoryRam;
		this.camera = camera;
	}
	//another constructor
	public Phone(String name, int screenSize) {
		super();
		this.name = name;
		this.screenSize = screenSize;
	}
	
	
	//behavior
	



	public void playMusic(String trackName) {
		System.out.println("Playing" + trackName);
	}
	
	

	//set value using encapsulation
	//accessing this way prevents direct access to the variable
	public void setName(String name) {
		this.name = name;
	}

	//get value
	public String getName() {
		
		return this.name;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public int getMemoryRam() {
		return memoryRam;
	}

	public void setMemoryRam(int memoryRam) {
		this.memoryRam = memoryRam;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}
	
	

	
	
}
