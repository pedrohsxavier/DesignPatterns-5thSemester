package gof;

import java.util.Map;
import java.util.TreeMap;

public class Prototype {
	private static Map<String, SuperHeroi> liga = new TreeMap<String, SuperHeroi>();
	
	private static void loadSuperHerois() {
		SuperHeroi fogo = new SuperHeroi("Fogo");
		fogo.add("Bola de fogo");
		fogo.add("Incêndio");
		fogo.add("Queima geral");
		
		SuperHeroi agua = new SuperHeroi("Água");
		agua.add("Afogar");
		agua.add("Chuva");
		agua.add("Inundação");
		
		Prototype.liga.put("FOGO", fogo);
		Prototype.liga.put("ÁGUA", agua);
	}
	
	public static SuperHeroi get(String tipo) {
		if (Prototype.liga.size() == 0)
			Prototype.loadSuperHerois();
		return Prototype.liga.get(tipo).clone();
	}
	
}
