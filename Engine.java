package RaceEngineer;

public class Engine {
	boolean on;
	int revolutions;
	
	public Engine() {
	}
	
	public void on() {
		System.out.println("Engine is now on");

	}
	
	public void off() {

		System.out.println("Engine is now off");
	}
	
	
	public void setRevolutions(int revolutions) {
		this.revolutions = revolutions;
	}
	
	public void warm() {
		revolutions = 12000;
		System.out.println("Engine is warming up to " + revolutions + " RPM");
	
	}
	
	public void idle() {
		revolutions = 9000;
		System.out.println("Engine is now idling at " + revolutions + " RPM");
	}

}
