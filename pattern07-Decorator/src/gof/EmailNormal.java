package gof;

public class EmailNormal implements Email {

	private String de, para, assunto, mensagem;
	
	public EmailNormal(String de, String para, String assunto, String mensagem) {
		this.de = de;
		this.para = para;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void enviar() {
		System.out.println("Enviou!");
	}
	
	@Override
	public String toString() {
		return "EmailNormal [de=" + de + ", para=" + para + ", assunto=" + assunto + ", mensagem=" + mensagem + "]";
	}
	
}
