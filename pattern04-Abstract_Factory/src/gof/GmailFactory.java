package gof;

public class GmailFactory implements Factory {

	@Override
	public SMTP criarSMTP() {
		return new GmailSMTP();
	}

	@Override
	public POP criarPOP() {
		return new GmailPOP();
	}
	
}
