package apps;

import gof.ArquivoBuilder;
import gof.Editor;

public class Excel implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o Excel");
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o Excel");		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

}