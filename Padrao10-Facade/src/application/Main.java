package application;

import facade.ComputerFacade;
import model.CPU;
import model.HardDrive;
import model.Memory;

public class Main {

	public static void main(String[] args) {
		
		CPU cpu_test = new CPU();
		Memory memory_test = new Memory();
		HardDrive hard_drive_test = new HardDrive();
		
		ComputerFacade computer = new ComputerFacade(cpu_test, memory_test, hard_drive_test);
		
		computer.turnOn();

	}

}
