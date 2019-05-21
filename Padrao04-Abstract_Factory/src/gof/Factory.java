package gof;

public interface Factory {
	
	public SMTP criarSMTP();
	
	public POP criarPOP();
	
}
