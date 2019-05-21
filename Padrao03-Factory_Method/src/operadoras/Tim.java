package operadoras;

import gof.Operadora;

public class Tim implements Operadora {

	@Override
	public void ligar() {
		System.out.println("Ligar - Tim");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviar SMS - Tim");
		
	}

}
