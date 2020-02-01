package RaceEngineer;

public class EngineWarmCommand implements Command {
	Engine engine;
	
	public EngineWarmCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void execute() {
		engine.warm();	
	}
}
