package gof;

import apps.Calc;
import apps.Impress;
import apps.Writer;

public class LibreOfficeFactory implements ISuite  {

	@Override
	public Editor createEditorTexto() {
		return new Writer();
	}

	@Override
	public Editor createEditorPlanilha() {
		return new Calc();
	}

	@Override
	public Editor createEditorApresentacao() {
		return new Impress();
	}

	@Override
	public void abrir() {
		System.out.println("abrindo o LibreOffice");
		
	}

	@Override
	public void fechar() {
		System.out.println("fechando o LibreOffice");
		
	}	

}