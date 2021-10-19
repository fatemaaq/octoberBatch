package Basic;

public class Vehicle {
	
	String color;
	String model;

	void speed() {
	System.out.println("Speed limit of: 50mph");
	}
	
	void mileage() {
		System.out.println("60mpg");
	}
	
	void displayVehicleProperties() {
		System.out.println("Color of vehicle is:"+ this.color + " Model of vehicle is:"+ this.model); //This is the class variable so its a good practice to use word "this". 
	}
// now creating an object of this class in entry2.java
	
	void brake() {
		System.out.println("Car can brake");
		
	}
}	
	