package gof;

public class EmailCopiaOculta extends EmailDecorator {

	public EmailCopiaOculta(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println(" com Copia Oculta");
	}
	
}
