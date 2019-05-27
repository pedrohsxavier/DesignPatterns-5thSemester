package gof;

public class Cliente {
	public static void main(String[] args) {
		
		Persistencia bd = new BD();
		Persistencia xml = new XML();
		
		Publicacao p1 = new Livro();
		p1.setAutor("Pedro");
		p1.setTitulo("On the Bridge");
		
		p1.setPersistencia(bd);
		p1.getPersistencia().persistir();
		
		p1.setPersistencia(xml);
		p1.getPersistencia().persistir();
	}
}
