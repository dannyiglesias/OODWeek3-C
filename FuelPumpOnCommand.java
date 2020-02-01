package RaceEngineer;

public class FuelPumpOnCommand implements Command {
	FuelPump fuelpump;
	
	public FuelPumpOnCommand(FuelPump fuelpump) {
		this.fuelpump = fuelpump;
	}
	
	public void execute() {
		fuelpump.on();
	}
}

