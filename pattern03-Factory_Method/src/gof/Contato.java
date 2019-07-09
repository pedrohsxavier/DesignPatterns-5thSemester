package gof;

public class Contato {
	
	private String nome, telefone;
	private Tipo operadora;
	
	public Contato(String nome, String telefone, Tipo operadora) {
		this.nome = nome;
		this.telefone = telefone;
		this.operadora = operadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Tipo getOperadora() {
		return operadora;
	}

	public void setOperadora(Tipo operadora) {
		this.operadora = operadora;
	}
	
	
}
