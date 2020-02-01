package RaceEngineer;

public class KERSTransferCommand implements Command {
	KERS kers;
	
	public KERSTransferCommand(KERS kers) {
		this.kers = kers;
	}
	
	public void execute() {
		kers.transfer();
	}
}



