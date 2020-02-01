package RaceEngineer;


public class EngineerTest{
	
	public static void main(String[] args) throws InterruptedException {
		
		//---------
		//Objects
		//---------
		EngineerControl control = new EngineerControl();
		Engine engine = new Engine();
		FuelPump fuelpump = new FuelPump();
		Batteries batteries = new Batteries();
		KERS kers = new KERS();
		
		
		//----------
		//Commands
		//----------
		EngineOnCommand engineOn = new EngineOnCommand(engine);
		EngineWarmCommand engineWarm = new EngineWarmCommand(engine);
		EngineIdleCommand engineIdle = new EngineIdleCommand(engine);
		EngineOffCommand engineOff = new EngineOffCommand(engine);
		FuelPumpOnCommand fuelpumpOn = new FuelPumpOnCommand(fuelpump);
		FuelPumpOffCommand fuelpumpOff = new FuelPumpOffCommand(fuelpump);
		BatteriesOnCommand batteriesOn = new BatteriesOnCommand(batteries);
		BatteriesOffCommand batteriesOff = new BatteriesOffCommand(batteries);
		BatteriesChargedCommand batteriesCharged = new BatteriesChargedCommand(batteries);
		KERSOnCommand kersOn = new KERSOnCommand(kers);
		KERSOffCommand kersOff = new KERSOffCommand(kers);
		KERSTransferCommand kersTransfer = new KERSTransferCommand(kers);
		
		//------------
		//Test Method
		//------------
		System.out.println("System Test");
		System.out.println("---------------------------------------------");
		System.out.println("Commencing engine start up procedures");
		Thread.sleep(2000);
		control.setCommand(batteriesOn);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(engineOn);
		control.commandInitiated();
		Thread.sleep(1000);
		control.setCommand(fuelpumpOn);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(engineIdle);
		control.commandInitiated();
		Thread.sleep(2000);
		System.out.println("Activating Kenetic Energy Recovery System");
		Thread.sleep(2000);
		control.setCommand(kersOn);
		control.commandInitiated();
		Thread.sleep(2000);
		System.out.println("Initiating KERS Transfer");
		Thread.sleep(2000);
		control.setCommand(kersTransfer);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(batteriesCharged);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(engineWarm);
		control.commandInitiated();
		Thread.sleep(2000);
		System.out.println("Bringing engine to idle");
		Thread.sleep(2000);
		control.setCommand(engineIdle);
		control.commandInitiated();
		Thread.sleep(2000);
		System.out.println("Commencing engine shutdown procedures");
		Thread.sleep(2000);
		control.setCommand(kersOff);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(engineOff);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(fuelpumpOff);
		control.commandInitiated();
		Thread.sleep(2000);
		control.setCommand(batteriesOff);
		control.commandInitiated();
		System.out.println("---------------------------------------------");
		System.out.println("System Test Complete");
	}
}
