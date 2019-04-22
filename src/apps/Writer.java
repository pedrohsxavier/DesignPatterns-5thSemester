package apps;

import gof.ArquivoBuilder;
import gof.Editor;

public class Writer implements Editor {

	@Override
	public void abrir() {
		System.out.println("abrindo o Writer");
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o Writer");		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

}