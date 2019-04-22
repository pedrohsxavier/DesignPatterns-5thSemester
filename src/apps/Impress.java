package apps;

import gof.ArquivoBuilder;
import gof.Editor;

public class Impress implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o Impress");	
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o Impress");		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

}