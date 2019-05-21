package gof;

public class YahooSMTP implements SMTP {

	@Override
	public void enviar() {
		System.out.println("Enviar via Yahoo");
		
	}

	@Override
	public void enviarComAnexo() {
		System.out.println("Enviar com Anexo via Yahoo");
		
	}
	
}
