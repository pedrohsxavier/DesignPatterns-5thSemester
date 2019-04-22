package gof;

public interface ISuite {
	public Editor createEditorTexto();
	public Editor createEditorPlanilha();
	public Editor createEditorApresentacao();
	
	public void abrir();
	public void fechar();
	
}