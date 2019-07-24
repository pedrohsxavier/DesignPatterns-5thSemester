package gof;

public class IFCardAdapter implements Cartao {
	private IFCard cartao;
	
	public IFCardAdapter() {
		this.cartao = new IFCard();
	}
	
	@Override
	public void autorizarCompra() {
		this.cartao.getAutorizacao();
	}

	@Override
	public void validarNumero() {
		this.cartao.getValidacao();
	}
	
}
