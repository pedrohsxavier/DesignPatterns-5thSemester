package operadoras;

import gof.Operadora;

public class Vivo implements Operadora {

	@Override
	public void ligar() {
		System.out.println("Ligar - Vivo");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar SMS - Vivo");
		
	}
	
	
}
