package RaceEngineer;

public class TestControl {
	Command[] onCommands;
	Command[] offCommands;
	Command[] midCommands;
	
	public TestControl() {
		onCommands = new Command[4];
		offCommands = new Command[4];
		midCommands = new Command[4];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < 4; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
			midCommands[i] = noCommand;
			
		}
		
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand, Command midCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		midCommands[slot] = midCommand;
	}
	
	public void oncommandInitiated(int slot) {
		onCommands[slot].execute();
		
	}
	
	public void offcommandInitiated(int slot) {
		offCommands[slot].execute();
		
	}
	
	public void midcommandInitiated(int slot) {
		midCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Test Control ------\n");
		for(int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + "     " + midCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
		}
	}


