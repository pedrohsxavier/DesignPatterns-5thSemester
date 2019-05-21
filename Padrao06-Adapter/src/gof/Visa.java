package gof;

public class Visa implements Cartao {

	@Override
	public void autorizarCompra() {
		System.out.println("Autorizar compra - Visa");
	}

	@Override
	public void validarNumero() {
		System.out.println("Validar número - Visa");
	}
	
}
