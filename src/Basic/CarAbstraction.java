package Basic;

public abstract class CarAbstraction 
{
        abstract void seats();
		abstract void engine();
		abstract void brakes();
		abstract void stearing();
		
		void navigationSystem( ) {
			System.out.println("My car has navigation system");
		}
	}

