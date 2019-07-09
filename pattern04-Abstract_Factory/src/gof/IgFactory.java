package gof;

public class IgFactory implements Factory {

	@Override
	public SMTP criarSMTP() {
		return new IgSMTP();
	}

	@Override
	public POP criarPOP() {
		return new IgPOP();
	}
	
}
