package gof;

//import java.awt.List;
import java.util.ArrayList;

public class Telefone {
	
	private ArrayList<Contato> contatos;
	
	public Telefone() {
		this.contatos = new ArrayList<Contato>();
	}
	
	public void add(Contato contato) {
		this.contatos.add(contato);
	}
	
	public ArrayList<Contato> get() {
		return this.contatos;
	}
	
}
