package operadoras;

import gof.Operadora;

public class Oi implements Operadora {

	@Override
	public void ligar() {
		System.out.println("Ligar - Oi");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar SMS - Oi");
		
	}
	
}
