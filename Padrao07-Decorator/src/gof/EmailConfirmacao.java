package gof;

public class EmailConfirmacao extends EmailDecorator {

	public EmailConfirmacao(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println(" com Confirmacao");
	}
	
}
