package RaceEngineer;

public class FuelPumpOffCommand implements Command {
	FuelPump fuelpump;
	
	public FuelPumpOffCommand(FuelPump fuelpump) {
		this.fuelpump = fuelpump;
	}
	
	public void execute() {
		fuelpump.off();
	}
}