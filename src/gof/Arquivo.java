package gof;

public class Arquivo implements IArquivo, Cloneable {
	
	private String nome;
	private String path;
	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private boolean autorizacao;
	private boolean impressao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAutorizacao() {
		return autorizacao;
	}
	public void setAutorizacao(boolean autorizacao) {
		this.autorizacao = autorizacao;
	}
	public boolean isImpressao() {
		return impressao;
	}
	public void setImpressao(boolean impressao) {
		this.impressao = impressao;
	}
	@Override
	public void escrever() {
		System.out.println("escrevendo com "+this.nome);
		
	}
	@Override
	public void ler() {
		System.out.println("lendo com "+this.nome);
		
	}
	
	@Override
	public Arquivo clone() {
		try {
			if(this.isAutorizacao()) {
				return (Arquivo) super.clone();
			}else {
				System.out.println("não tem autorização");
			}
		}catch(CloneNotSupportedException e) {
			System.out.println(e.getStackTrace());
		}
		return null;
	}
	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", path=" + path + ", data=" + data + ", hora=" + hora + ", proprietario="
				+ proprietario + ", email=" + email + ", autorizacao=" + autorizacao + ", impressao=" + impressao + "]";
	}

}