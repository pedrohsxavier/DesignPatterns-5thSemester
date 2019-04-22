package apps;

import gof.ArquivoBuilder;
import gof.Editor;

public class PowerPoint implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o Power Point");
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o Power Point");	
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

}