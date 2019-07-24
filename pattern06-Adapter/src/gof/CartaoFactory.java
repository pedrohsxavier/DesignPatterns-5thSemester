package gof;

public class CartaoFactory {
	public static Cartao getCartao(Bandeira bandeira) {
		if (bandeira == Bandeira.MASTER) {
			return new Master();
		}else if (bandeira == Bandeira.VISA) {
			return new Visa();
		}else if (bandeira == Bandeira.IFCARD) {
			return new IFCardAdapter();
		}else {
			return null;
		}
	}
}
