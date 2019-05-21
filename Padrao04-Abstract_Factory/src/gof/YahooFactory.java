package gof;

public class YahooFactory implements Factory {

	@Override
	public SMTP criarSMTP() {
		return new YahooSMTP();
	}

	@Override
	public POP criarPOP() {
		return new YahooPOP();
	}
	
}
