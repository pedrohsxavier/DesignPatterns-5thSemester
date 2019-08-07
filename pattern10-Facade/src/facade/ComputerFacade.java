package facade;

import model.CPU;
import model.HardDrive;
import model.Memory;

public class ComputerFacade {
	
	private CPU cpu = null;
	private Memory memory = null;
	private HardDrive hard_drive = null;
	
	public ComputerFacade(CPU cpu, Memory memory, HardDrive hard_drive) {
		this.cpu = cpu;
		this.memory = memory;
		this.hard_drive = hard_drive;
	}
	
	public void turnOn() {
		cpu.start();
		cpu.execute();
		memory.load();
		hard_drive.read();
	}
	
}
