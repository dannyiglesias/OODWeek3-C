package RaceEngineer;

public class BatteriesOnCommand implements Command {
	Batteries batteries;
	
	public BatteriesOnCommand(Batteries batteries) {
		this.batteries = batteries;
	}
	
	public void execute() {
		batteries.on();
	}
}

	

