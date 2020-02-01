package RaceEngineer;

public class EngineOffCommand implements Command {
	Engine engine;
	
	public EngineOffCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void execute() {
		engine.off();
	}
	

}
