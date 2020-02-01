package RaceEngineer;

public class KERSOffCommand implements Command {
	KERS kers;
	
	public KERSOffCommand(KERS kers) {
		this.kers = kers;
	}
	
	public void execute() {
		kers.off();
	}
}


