package application;

import facade.ComputerFacade;
import model.CPU;
import model.HardDrive;
import model.Memory;

public class Main {

	public static void main(String[] args) {
		
		CPU cpu_test = null;
		Memory memory_test = null;
		HardDrive hard_drive_test = null;
		
		ComputerFacade computer = new ComputerFacade(cpu_test, memory_test, hard_drive_test);
		
		computer.turnOn();
		
	}

}
