package abstractionAssignment;

public abstract class Vehicle {

	
	int no_of_wheels;
	
	
	
	
	void start(Vehicle vehicle)
	{
		System.out.println("In vehicle");
	}
	
	public static void main(String[] args) {
		
//		Vehicle V = new Vehicle(); //Showing compile time error: true
		Vehicle B = new Bike();
		Car C = new Car();
	 
		try {
			B.start((Car)B);
			C.start((Car)C);
		}
	
		catch(Exception e) {
		System.out.println(e.getMessage());
			}
		
	


	
	
}
}

