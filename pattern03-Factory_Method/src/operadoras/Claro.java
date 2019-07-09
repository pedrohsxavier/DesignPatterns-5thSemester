package operadoras;

import gof.Operadora;

public class Claro implements Operadora {

	@Override
	public void ligar() {
		System.out.println("Ligar - Claro");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar SMS - Claro");
		
	}
	
}
