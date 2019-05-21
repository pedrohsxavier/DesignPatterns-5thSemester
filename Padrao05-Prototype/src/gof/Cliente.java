package gof;

public class Cliente {
	public static void main(String[] args) {
		SuperHeroi s1 = new SuperHeroi("Rafael");
		
		
		s1.add("Fogo");
		s1.add("Super Grito");
		s1.add("Água");
		s1.add("Gelo");
		s1.add("Paga as contas");
		s1.add("Festa para o Sr. Fabrício");
		s1.add("Estudioso");
		s1.add("Super visão");
		s1.add("Raio do trovão");
		s1.add("Super amigo");
		s1.add("Leitura do pensamento");
		s1.add("Futuro");
		s1.add("Presente");
		s1.add("Passado");
	
		SuperHeroi s2 = s1.clone();
		s2.setNome("Paulo Henrique");
		s2.add("Altura");
		
		System.out.println(s1);
		System.out.println(s2);
		
		SuperHeroi s3 = Prototype.get("FOGO");
		SuperHeroi s4 = Prototype.get("FOGO");
		SuperHeroi s5 = Prototype.get("ÁGUA");
		s4.add("Novo poder");
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
	
}
