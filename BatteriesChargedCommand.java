package RaceEngineer;

public class BatteriesChargedCommand implements Command {
	Batteries batteries;
	
	public BatteriesChargedCommand(Batteries batteries) {
		this.batteries = batteries;
	}
	
	public void execute() {
		batteries.charged();
	}
}


