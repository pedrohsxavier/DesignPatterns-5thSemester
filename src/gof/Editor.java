package gof;

public interface Editor {
	public void abrir();
	public void fechar();

	public ArquivoBuilder criar(String name, String path);

}