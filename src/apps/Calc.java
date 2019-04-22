package apps;

import gof.ArquivoBuilder;
import gof.Editor;

public class Calc implements Editor {

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

	@Override
	public void fechar() {
		System.out.println("fechando o Calc");
	}

	@Override
	public void abrir() {
		System.out.println("abrindo o Calc");	
	}

}