package gof;

public class Master implements Cartao {

	@Override
	public void autorizarCompra() {
		System.out.println("Autorizar compra - Master");
	}

	@Override
	public void validarNumero() {
		System.out.println("Validar número - Master");
	}
	
}
