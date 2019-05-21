package gof;

public class GmailSMTP implements SMTP {

	@Override
	public void enviar() {
		System.out.println("Enviar via Gmail");
		
	}

	@Override
	public void enviarComAnexo() {
		System.out.println("Enviar com Anexo via Gmail");
	
	}
	
}
