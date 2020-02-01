package RaceEngineer;

public class KERS {
	int joules;
	
	public KERS() {
	}
	
	public void on() {
		System.out.println("KERS is now activated");
	}
	
	public void off() {
		System.out.println("KERS is now deactivaated");
	}
	
	public void transfer() {
		joules = 400;
		System.out.println("KERS transferring " + joules + "kJ to batteries");
	}

}
