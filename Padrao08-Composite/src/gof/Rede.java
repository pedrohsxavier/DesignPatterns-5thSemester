package gof;

import java.util.ArrayList;
import java.util.List;

public class Rede implements Component {
	private String nome, ip;
	private List<Component> components;
	
	public Rede(String nome, String ip) {
		this.nome = nome;
		this.ip = ip;
		this.components = new ArrayList<Component>();
	}
	
	public void add(Component novo) {
		this.components.add(novo);
	}
	
	@Override
	public String getIP() {
		return this.ip;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return String.format("Rede: %s - %s - %s", this.nome, this.ip, this.components);
	}
}
