package gof;

public class PessoaBuilder implements Builder<Pessoa> {

	private String nome, cpf, rg, email, telefone;
	private int grau, idade;

	public void nome(String nome) {
		this.nome = nome;
	}

	public void cpf(String cpf) {
		this.cpf = cpf;
	}

	public void rg(String rg) {
		this.rg = rg;
	}

	public void email(String email) {
		this.email = email;
	}

	public void telefone(String telefone) {
		this.telefone = telefone;
	}

	public void grau(int grau) {
		this.grau = grau;
	}

	public void idade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public Pessoa create() {
		Pessoa p = new Pessoa();
		p.setCpf(this.cpf);
		p.setEmail(this.email);
		p.setGrau(this.grau);
		p.setIdade(this.idade);
		p.setNome(this.nome);
		p.setRg(this.rg);
		p.setTelefone(this.telefone);
		return p;
	}
}
