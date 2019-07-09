package gof;

public class Cliente {

	public static void main(String[] args) {
		Email e1 = new EmailNormal("de", "para", "assunto", "mensagem");
		//e1.enviar();
		
		Email e2 = new EmailAnexo(e1);
		//e2.enviar();
		
		Email e3 = new EmailConfirmacao(e2);
		//e3.enviar();
		
		Email e4 = new EmailCopiaOculta(e3);
		e4.enviar();
		
		System.out.println("\n\n\n");
		
		new EmailCopiaOculta(new EmailConfirmacao(new EmailAnexo(new EmailNormal("de", "para", "assunto", "mensagem")))).enviar();
	}

}
