package RaceEngineer;

public class BatteriesOffCommand implements Command {
	Batteries batteries;
	
	public BatteriesOffCommand(Batteries batteries) {
		this.batteries = batteries;
	}
	
	public void execute() {
		batteries.off();
	}

}
