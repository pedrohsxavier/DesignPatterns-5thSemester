package gof;

import operadoras.Claro;
import operadoras.Oi;
import operadoras.Tim;
import operadoras.Vivo;

public class OperadoraFactory implements Factory {

	public Operadora criar(Tipo tipo) {
		if (tipo == Tipo.CLARO) return new Claro();
		else if (tipo == Tipo.OI) return new Oi();
		else if (tipo == Tipo.TIM) return new Tim();
		else if (tipo == Tipo.VIVO) return new Vivo();
		else return null;
	}
	
}
