package gof;

public class Cliente {
	
	public static void main(String[] args) {
		CartaoFactory.getCartao(Bandeira.VISA).autorizarCompra();
		CartaoFactory.getCartao(Bandeira.MASTER).autorizarCompra();
		CartaoFactory.getCartao(Bandeira.IFCARD).autorizarCompra();
	}
}
