package gof;

public class ArquivoBuilder implements Builder<Arquivo> {
	
	private String nome;
	private String path;
	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private boolean autorizacao;
	private boolean impressao;

	public ArquivoBuilder(String nome, String path) {
		this.nome = nome;
		this.path = path;
	}

	public ArquivoBuilder data(String data) {
		this.data = data;
		return this;
	}

	public ArquivoBuilder hora(String hora) {
		this.hora = hora;
		return this;
	}

	public ArquivoBuilder proprietario(String proprietario) {
		this.proprietario = proprietario;
		return this;
	}

	public ArquivoBuilder email(String email) {
		this.email = email;
		return this;

	}

	public ArquivoBuilder autorizacao(boolean autorizacao) {
		this.autorizacao = autorizacao;
		return this;
	}

	public ArquivoBuilder impressao(boolean impressao) {
		this.impressao = impressao;
		return this;
	}

	public Arquivo create() {
		Arquivo arquivo = new Arquivo();
		arquivo.setNome(nome);
		arquivo.setPath(path);
		arquivo.setData(data);
		arquivo.setHora(hora);
		arquivo.setEmail(email);
		arquivo.setProprietario(proprietario);
		arquivo.setAutorizacao(autorizacao);
		arquivo.setImpressao(impressao);
		return arquivo;
	}

}