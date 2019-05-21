package gof;

public class Computador implements Component {
	private String nome, ip;
	
	public Computador(String nome, String ip) {
		this.nome = nome;
		this.ip = ip;
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
		return String.format("Computador: %s - %s", this.nome, this.ip);
	}
}
