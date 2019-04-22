package apps;

import gof.ArquivoBuilder;
import gof.Editor;

public class Word implements Editor{

	@Override
	public void abrir() {
		System.out.println("abrindo o Word");	
	}
	
	@Override
	public void fechar() {
		System.out.println("fechando o Word");		
	}

	@Override
	public ArquivoBuilder criar(String name, String path) {
		return new ArquivoBuilder(name, path);
	}

}