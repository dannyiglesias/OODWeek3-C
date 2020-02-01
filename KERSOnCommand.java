package RaceEngineer;

public class KERSOnCommand implements Command {
	KERS kers;
	
	public KERSOnCommand(KERS kers) {
		this.kers = kers;
	}
	
	public void execute() {
		kers.on();
	}
}





