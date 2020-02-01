package RaceEngineer;

public class TestLoader {
	
	public static void main(String[] args) throws InterruptedException {
		TestControl testControl = new TestControl();
		
		//----------
		//Objects
		//----------
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
		
		//---------------
		// Command Slots
		//---------------
		testControl.setCommand(0,  batteriesOn, batteriesOff, batteriesCharged);
		testControl.setCommand(1, fuelpumpOn, fuelpumpOff, engineIdle);
		testControl.setCommand(2, engineOn, engineOff, engineWarm);
		testControl.setCommand(3, kersOn, kersOff, kersTransfer);
		
		//---------------
		//Test Method
		//---------------
		System.out.println("System Test");
		System.out.println("---------------------------------------------");
		System.out.println("Commencing engine start up procedures");
		Thread.sleep(2000);
		testControl.oncommandInitiated(0);
		Thread.sleep(2000);
		testControl.oncommandInitiated(2);
		Thread.sleep(2000);
		testControl.oncommandInitiated(1);
		Thread.sleep(2000);
		testControl.midcommandInitiated(1);
		Thread.sleep(2000);
		System.out.println("Activating Kenetic Energy Recovery System");
		Thread.sleep(2000);
		testControl.oncommandInitiated(3);
		Thread.sleep(2000);
		System.out.println("Initiating KERS Transfer");
		Thread.sleep(2000);
		testControl.midcommandInitiated(3);
		Thread.sleep(2000);
		testControl.midcommandInitiated(0);
		Thread.sleep(2000);
		testControl.midcommandInitiated(2);
		Thread.sleep(2000);
		System.out.println("Bringing engine back to idle");
		Thread.sleep(2000);
		testControl.midcommandInitiated(1);
		Thread.sleep(2000);
		System.out.println("Commencing engine shutdown procedures");
		Thread.sleep(2000);
		testControl.offcommandInitiated(3);
		Thread.sleep(2000);
		testControl.offcommandInitiated(2);
		Thread.sleep(2000);
		testControl.offcommandInitiated(1);
		Thread.sleep(2000);
		testControl.offcommandInitiated(0);
		System.out.println("---------------------------------------------");
		System.out.println("System Test Complete");
		
		

		

	}

}
