package gof;

public class PessoaDistintaBuilder implements Builder<Pessoa> {

	private String nome, cpf, rg, email, telefone;
	private int grau, idade;
	
	public PessoaDistintaBuilder(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public PessoaDistintaBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public PessoaDistintaBuilder rg(String rg) {
		this.rg = rg;
		return this;
	}

	public PessoaDistintaBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PessoaDistintaBuilder telefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public PessoaDistintaBuilder grau(int grau) {
		this.grau = grau;
		return this;
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
