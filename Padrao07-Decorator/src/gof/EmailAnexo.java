package gof;

public class EmailAnexo extends EmailDecorator {

	public EmailAnexo(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println(" com Anexo");
	}

}
