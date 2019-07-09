package gof;

import java.util.ArrayList;
import java.util.List;

public class Elementos {
	List<Component> lista;
	
	public Elementos() {
		this.lista = new ArrayList<Component>();
	}
	
	public void add(Component novo) {
		this.lista.add(novo);
	}
	
	public String toString() {
		return this.lista.toString();
	}
}
