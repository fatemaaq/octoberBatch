package Basic;

public class Entry2 {

	public static void main(String[] args) {
		// Encapsulation: process of bundling data (Variable) and methods as a single
		// Process of hiding data from outside world
		// fully encapsulated class means Make all data private

		//Inheritance: by using "extends"
		// Parent (super class), child (sub class).
		
		Vehicle v = new Vehicle();
		v.color = "Black";
		v.model = "2020";
		v.displayVehicleProperties();
		
		Car c = new Car();
		c.speed();
		//this above c.speed will overide the value of car class and will not display the value stored in parent class if both both parent and child class has speed property
        c.sunroof();
        c.brake();
	}

}
