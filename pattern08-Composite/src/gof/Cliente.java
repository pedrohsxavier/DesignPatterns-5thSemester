package gof;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	public static void main(String[] args) {
		Elementos e = new Elementos();
		
		Computador c1 = new Computador("C1", "1.1");
		Computador c2 = new Computador("C2", "1.2");
		Computador c3 = new Computador("C3", "1.3");
		Computador c4 = new Computador("C4", "1.4");
		
		Rede r1 = new Rede("R1", "2.1");
		r1.add(c1);
		r1.add(c2);
		
		Rede r2 = new Rede("R2", "2.2");
		r2.add(c3);
		r2.add(r1);
		
		e.add(c4);
		e.add(r2);
		
		System.out.println(e);
	}
}
