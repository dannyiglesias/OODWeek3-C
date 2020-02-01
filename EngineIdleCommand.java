package RaceEngineer;

public class EngineIdleCommand implements Command {
	Engine engine;
	
	public EngineIdleCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void execute() {
		engine.idle();
	}
}

