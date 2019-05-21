package gof;

public class Cliente {
	public static void main(String[] args) {
		PessoaBuilder pb1 = new PessoaBuilder();
		
		pb1.nome("Val�ria");
		pb1.idade(15);
		pb1.email("valeria.cavalcanti@ifpb.edu.br");
		
		Pessoa p1 = pb1.create();
		System.out.println(p1);
		
		Pessoa p2 = (new PessoaDistintaBuilder("Val�ria", 15))
							.email("valeria.cavalcanti@ifpb.edu.br")
							.create();
		System.out.println(p2);
	}
}
