package gof;

public class Cliente {

	public static void main(String[] args) {
		
		Factory f = ProvedorFactory.getFactory(Provedor.GMAIL);
		
		f.criarSMTP().enviar();
		f.criarPOP().receber();
	}

}
