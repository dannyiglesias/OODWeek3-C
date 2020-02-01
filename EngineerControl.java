package RaceEngineer;

//invoker
public class EngineerControl {
	Command slot;
	
	public EngineerControl() {}
	
	public void setCommand(Command command) {
		slot = command;
		
	}
	
	public void commandInitiated() {
		slot.execute();
	

	}

}
