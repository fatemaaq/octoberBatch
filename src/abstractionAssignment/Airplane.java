package abstractionAssignment;

public class Airplane {


public static void main(String[] args) {
	Boeing B = new Boeing();
	B.takeOff();
	B.takeDown();
	
	AirBus A = new AirBus();
	A.takeOff();
	B.takeDown();
	
	}
}