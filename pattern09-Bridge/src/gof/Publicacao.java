package gof;

public class Publicacao {
	
	private String titulo;
	private String autor;
	private Persistencia persistencia;
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Persistencia getPersistencia() {
		return persistencia;
	}
	
	public void setPersistencia(Persistencia persistencia) {
		this.persistencia = persistencia;
	}
	
	
	
}
