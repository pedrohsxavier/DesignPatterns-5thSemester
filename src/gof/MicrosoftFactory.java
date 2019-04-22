package gof;

import apps.Excel;
import apps.PowerPoint;
import apps.Word;

public class MicrosoftFactory implements ISuite {

	@Override
	public Editor createEditorTexto() {
		return new Word();
	}

	@Override
	public Editor createEditorPlanilha() {
		return new Excel();
	}

	@Override
	public Editor createEditorApresentacao() {
		return new PowerPoint();
	}
	@Override
	public void abrir() {
		System.out.println("abrindo o Microsoft");
		
	}

	@Override
	public void fechar() {
		System.out.println("fechando o Microsoft");
		
	}	

}