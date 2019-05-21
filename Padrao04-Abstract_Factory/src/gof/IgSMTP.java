package gof;

public class IgSMTP implements SMTP {

	@Override
	public void enviar() {
		System.out.println("Enviar via Ig");
		
	}

	@Override
	public void enviarComAnexo() {
		System.out.println("Enviar com Anexo via Ig");
		
	}
	
}
